package model;

public class VehiculoDTO
{
	private String numPlaca;


	public VehiculoDTO(String numPlaca)
	{
		super();
		this.numPlaca = numPlaca;
	}
	
	public String getNumPlaca()
	{
		return numPlaca;
	}

	public void setNumPlaca(String numPlaca)
	{
		this.numPlaca = numPlaca;
	}
}
