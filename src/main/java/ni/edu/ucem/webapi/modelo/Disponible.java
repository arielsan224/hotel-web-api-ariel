package ni.edu.ucem.webapi.modelo;

import java.util.Date;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class Disponible 
{
	@NotNull
    @NotEmpty(message = "La descripción es requerida.")
    private Date desde;
    
    @NotNull
    @NotEmpty(message = "La descripción es requerida.")
    private Date hasta;
    
    @JsonIgnore
    private Date modificado;
    
    public Disponible()
    {
    }
    
    public Disponible(final Date desde, final Date hasta, final Integer cuarto,
            final Integer huesped) {
        this.desde=desde;
        this.hasta= hasta;
        this.cuarto= cuarto;
        this.huesped = huesped;
    }
    
        
}
