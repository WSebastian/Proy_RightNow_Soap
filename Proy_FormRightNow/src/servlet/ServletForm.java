package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ContactDTO;
import model.VehiculoDTO;
import servicews.SampleClient;

/**
 * Servlet implementation class ServletForm
 */
@WebServlet("/ServletForm")
public class ServletForm extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
			servicio(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

			servicio(request, response);
	}
	
	
	

	private void servicio(HttpServletRequest request, HttpServletResponse response)
	{

			  
		SampleClient sampleClient = new SampleClient();
		
		ContactDTO contactDTO = inyeccionDatosContact(request);
		VehiculoDTO vehiculoDTO = inyeccionDatosVehiculo(request);
		
		System.out.println("Inyecto datos");
		
		System.out.println("Id Obtenido: " + sampleClient.createContacto(contactDTO));
     		
		request.setAttribute("mensaje", "Datos enviado de manera exitosa!! :)");
		irJSPI(request, response, "form.jsp");

	}
			
	
	
	private ContactDTO inyeccionDatosContact(HttpServletRequest request)
	{
		ContactDTO contactDTO = new ContactDTO();
		contactDTO.setNombre(request.getParameter("txtNombre"));
		contactDTO.setApellido(request.getParameter("txtApellidos"));
		contactDTO.setTipoDocumento(Integer.parseInt(request.getParameter("cboTipoDocumento")));
		contactDTO.setNumDocumento(request.getParameter("txtNumeroDocumento"));
		contactDTO.setEmail(request.getParameter("txtEmail"));
		contactDTO.setFonoFijo(request.getParameter("txtFonoFijo"));
		contactDTO.setFonoMovil(request.getParameter("txtFonoMovil"));
		
		
		System.out.println("------------ Datos inyectado en el contacto ---------------");
		System.out.println("Nombre: "+contactDTO.getNombre());
		System.out.println("Apellido: "+contactDTO.getApellido());
		System.out.println("TipoDocumento: "+contactDTO.getTipoDocumento());
		System.out.println("Num Documento: "+contactDTO.getNumDocumento());
		System.out.println("Email: "+contactDTO.getEmail());
		System.out.println("Fono fijo: "+contactDTO.getFonoFijo());
		System.out.println("Fono Movil: "+contactDTO.getFonoMovil());
	
		return contactDTO;
	}
	
	private VehiculoDTO inyeccionDatosVehiculo(HttpServletRequest request)
	{
		VehiculoDTO vehiculoDTO = new VehiculoDTO(request.getParameter("txtPlaca"));
		System.out.println("------------ Datos inyectado en el Vehiculo ---------------");
		System.out.println("Placa: "+vehiculoDTO.getNumPlaca());
		
		return vehiculoDTO;
	}
	
	
	private void irJSPI(HttpServletRequest _request, HttpServletResponse _response, String _jsp)
	{
		try
		{
			_request.getRequestDispatcher(_jsp).forward(_request, _response);
		} 
		catch (ServletException | IOException e)
		{
			e.printStackTrace();
		}
	}


}
