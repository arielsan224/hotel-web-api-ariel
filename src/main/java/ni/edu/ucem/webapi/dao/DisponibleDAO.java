package ni.edu.ucem.webapi.dao;

import java.util.Date;
import java.util.List;

import ni.edu.ucem.webapi.modelo.Disponible;

public interface DisponibleDAO 
{
    public Disponible obtenerPorId(final int pId, final String... proyeccion);
    
    public int contar();
    
    public int contarPorCategoria(final int pCategoriaId);
    
    public List<Disponible> obtenerTodos(final Date desde, final Date hasta, final int offset, final int limit);
    
}
