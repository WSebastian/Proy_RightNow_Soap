package test;

import java.rmi.RemoteException;



import com.rightnow.ws.wsdl.RequestErrorFault;
import com.rightnow.ws.wsdl.ServerErrorFault;
import com.rightnow.ws.wsdl.UnexpectedErrorFault;

import model.ContactDTO;
import servicews.SampleClient;

public class Test
{
	public static void main(String[] args)
	{
		try
		{
			SampleClient sampleClient = new SampleClient();
//			ContactDTO contactDTO = new ContactDTO();
//			contactDTO.setNombre("saa");
//			contactDTO.setApellido("2asd34");
//
//
//			SampleClient sampleClient = new SampleClient();
//			long id = sampleClient.createContacto(contactDTO);
////			
////			System.out.println("Id obtenido: "+id);
			
	     sampleClient.getContact();
		}
		catch (NullPointerException | RemoteException | RequestErrorFault | UnexpectedErrorFault | ServerErrorFault e)
		{
			e.printStackTrace();
		}
	}
}
