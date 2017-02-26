package ni.edu.ucem.webapi.daoImpl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.ucem.webapi.dao.ReservacionDAO;
import ni.edu.ucem.webapi.modelo.Reservacion;

@Repository
public class DisponibleDAOImpl implements DisponibleDAO 
{
    private final JdbcTemplate jdbcTemplate;
   
    @Autowired
    public DisponibleDAOImpl(final JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

     
    
    @Override
    public int contar()
    {
        final String sql = "select count(*) from cuarto";
        return this.jdbcTemplate.queryForObject(sql, Integer.class);
    }
    
    @Override
    public int contarPorDisponible(final int pDisponibleId)
    {
        final String sql = "select count(*) from cuarto where ";
        return this.jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public List<Disponible> obtenerTodos(final Date desde, final Date desde, final Date hasta, final Date hasta, final int pOffset, final int pLimit) 
    {
        String sql = "select * from cuarto as ct inner join categoria_cuarto ctcat on ctcat .id = ct.categoria" +
					"	where ct.id not in"+
					"	(select  res.cuarto from reservacion as res"+
					"	where res.desde<=? and res.hasta>=?"+
					"	union all"+
					"	select  res.cuarto from reservacion as res"+
					"	where res.desde<=? and res.hasta>=?); offset ? limit ?";
        return this.jdbcTemplate.query(sql, new Object[]{pOffset, pLimit},
                new BeanPropertyRowMapper<Disponible>(Disponible.class));
    }

    
}
