package model;

public class ContactDTO
{
	private String nombre, apellido, numDocumento, email, fonoFijo, fonoMovil;
	private Integer tipoDocumento;
	
	public ContactDTO()
	{
		super();
	}
	
	public ContactDTO(String nombre, String apellido, String numDocumento, String email, String fonoFijo,
			String fonoMovil, Integer tipoDocumento)
	{
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numDocumento = numDocumento;
		this.email = email;
		this.fonoFijo = fonoFijo;
		this.fonoMovil = fonoMovil;
		this.tipoDocumento = tipoDocumento;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellido()
	{
		return apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public String getNumDocumento()
	{
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento)
	{
		this.numDocumento = numDocumento;
	}

	public Integer getTipoDocumento()
	{
		return tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento)
	{
		this.tipoDocumento = tipoDocumento;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getFonoFijo()
	{
		return fonoFijo;
	}

	public void setFonoFijo(String fonoFijo)
	{
		this.fonoFijo = fonoFijo;
	}

	public String getFonoMovil()
	{
		return fonoMovil;
	}

	public void setFonoMovil(String fonoMovil)
	{
		this.fonoMovil = fonoMovil;
	}

}
