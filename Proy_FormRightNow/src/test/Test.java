package test;


import java.rmi.RemoteException;

import com.rightnow.ws.objects.Contact;
import com.rightnow.ws.wsdl.RequestErrorFault;
import com.rightnow.ws.wsdl.ServerErrorFault;
import com.rightnow.ws.wsdl.UnexpectedErrorFault;

import client.RightNowClient;
import model.ContactDTO;
import rn.service.IServiceRightNow;
import rn.service.impl.IServiceRightNowImpl;

public class Test
{
	public static void main(String[] args)
	{
		try
		{
			
			
			getContacto();
			
			
		}
		catch (NullPointerException e)
		{
			System.out.println("Error en main: "+e);
		}
	}
	
	
	private static void getContacto()
	{
		IServiceRightNow iService = new IServiceRightNowImpl();

		iService.getContact(7755522);
	}
	
	private static void crearContacto()
	{
		IServiceRightNow iService = new IServiceRightNowImpl();
	
		long id =iService.createContact("jkkj", "jk", "21323", "21213", 2, "232429", "kjjk@gmail.com");
		
		System.out.println("Contacto creado con el id: "+id);
	}
	
	private static void xxx()
	{
//		RightNowClient client = new RightNowClient();
//		
//		ContactDTO c=new ContactDTO();
//		c.setApellido("daniel");
//		c.setNombre("peredo");
//		c.setEmail("daniel@gmail.com");
//		c.setFonoFijo("21323");
//		c.setFonoMovil("21213");
//		c.setTipoDocumento(2);
//		c.setNumDocumento("232423");
//		
//		client.createContact(c);
	}
	
	
}
