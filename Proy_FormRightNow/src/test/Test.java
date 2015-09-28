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

		iService.getContactByNombreApellido("PEDRO AUGUSTO", "GALARZA");
	}
	
	private static void crearContacto()
	{
		IServiceRightNow iService = new IServiceRightNowImpl();
	
		Contact contact =iService.createContact("asbfdb", "fdb", "23444344", "43444344", 1, "47984559", "farnicio@gmail.com");
		
		System.out.println("Contacto creado con el id: "+contact.getID().getId());
	}
	
	private static void crearOportunity()
	{
		IServiceRightNow iService = new IServiceRightNowImpl();
		
//		iService.createOportunity("Eliazar", "Espinozas", "34344434", "343444444", 1, "470854525", "eliazar@gmail.com");
//		iService.createOportunity("fabricio", "lapa", "23444344", "43444344", 1, "47984559", "farnicio@gmail.com");
		iService.createOportunity("Alberts", "wesker", "3629815", "994206355", 1, "47084567", "albertsweskerresiden@gmail.com");

	}

	
	
}
