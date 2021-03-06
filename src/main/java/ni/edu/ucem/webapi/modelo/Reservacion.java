package ni.edu.ucem.webapi.modelo;

import java.util.Date;


import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class Reservacion 
{
    private Integer id;
    
     
    @NotNull
    @NotEmpty(message = "La fecha desde es requerida.")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date desde;
    
    @NotNull
    @NotEmpty(message = "La fecha hasta es requerida.")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date hasta;
    
    @NotNull
    @NotEmpty(message = "El numero de cuarto es requerido.")
    private Integer cuarto;
    
    @NotNull
    @NotEmpty(message = "El huesped es requerido.")
    private Integer huesped;
    
    public Reservacion()
    {
    }  
    
    public Reservacion(final Date desde, final Date hasta, final Integer cuarto,
            final Integer huesped) {
        this.desde=desde;
        this.hasta= hasta;
        this.cuarto= cuarto;
        this.huesped = huesped;
    }

    public Reservacion(final Integer id, final Date desde, final Date hasta, final Integer cuarto,
            final Integer huesped) 
    {
    	this.id= id;
    	this.desde=desde;
        this.hasta= hasta;
        this.cuarto= cuarto;
        this.huesped = huesped;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDesde() {
		return desde;
	}

	public void setDesde(Date desde) {
		this.desde = desde;
	}

	public Date getHasta() {
		return hasta;
	}

	public void setHasta(Date hasta) {
		this.hasta = hasta;
	}

	public Integer getCuarto() {
		return cuarto;
	}

	public void setCuarto(Integer cuarto) {
		this.cuarto = cuarto;
	}

	public Integer getHuesped() {
		return huesped;
	}

	public void setHuesped(Integer huesped) {
		this.huesped = huesped;
	}
    
    
   
}
