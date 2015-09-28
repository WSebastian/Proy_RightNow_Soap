package rn.service.impl;

import java.nio.channels.Channel;
import java.rmi.RemoteException;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.noneDSA;

import com.rightnow.ws.base.ID;
import com.rightnow.ws.base.RNObject;
import com.rightnow.ws.generic.GenericObject;
import com.rightnow.ws.generic.RNObjectType;
import com.rightnow.ws.messages.QueryCSVResponseMsg;
import com.rightnow.ws.messages.QueryResultData;
import com.rightnow.ws.messages.RNObjectsResult;
import com.rightnow.ws.objects.Account;
import com.rightnow.ws.objects.Answer;
import com.rightnow.ws.objects.AnswerNotification;
import com.rightnow.ws.objects.ChannelType;
import com.rightnow.ws.objects.Contact;
import com.rightnow.ws.objects.FileAttachment;
import com.rightnow.ws.objects.NoteList;
import com.rightnow.ws.objects.Opportunity;
import com.rightnow.ws.objects.PersonName;
import com.rightnow.ws.objects.SLAInstance;
import com.rightnow.ws.wsdl.RequestErrorFault;
import com.rightnow.ws.wsdl.ServerErrorFault;
import com.rightnow.ws.wsdl.UnexpectedErrorFault;

import client.RightNowClient;
import rn.service.IServiceRightNow;

public class IServiceRightNowImpl extends RightNowClient implements IServiceRightNow
{

	@Override
	public Contact getContact(long _idContact)
	{
		Contact contact = null;

		try
		{
			contact = new Contact();
			ID IDContact = new ID();

			IDContact.setId(_idContact);
			contact.setID(IDContact);

			NoteList notes = new NoteList();

			contact.setNotes(notes);

			RNObject[] rnObjects = new RNObject[] { contact };

			System.out.println("Antes de ejecutar la busqueda");

			RNObjectsResult rnObjectsResult = _service.get(rnObjects, getProcessingOptions(), clientInfoHeader(BASIC_GET));

			System.out.println("Despues de ejecutar");
			RNObject[] rnObjects2 = rnObjectsResult.getRNObjects();

			contact = (Contact) rnObjects2[0];

			imprimirDatosContacto(contact);
		}
		catch (Exception e)
		{
			System.out.println("Error en getContact(): " + e);
			e.printStackTrace();
		}

		return contact;

	}
	

	@Override
	public Contact createContact(String _nombre, String _apellido, String _numeroFono, String _numeroMovil,
			Integer _tipoDocumento, String _numeroDocumento, String _email)
	{
		Contact newContact = null;

		try
		{
			newContact = poblarInfoContacto(_nombre, _apellido, _numeroFono, _numeroMovil, _tipoDocumento, _numeroDocumento, _email);

			imprimirDatosContacto(newContact);

			RNObject[] createObjects = new RNObject[] { newContact };
		
			// Invoke the create operation on the RightNow server
			RNObjectsResult createResults;
			createResults = _service.create(createObjects, createProcessingOptions(), clientInfoHeader(AXIS2_GETTING_STARTED));
			
			// We only created a single contact, this will be at index 0 of
			// the
			// results
			RNObject[] rnObjects = createResults.getRNObjects();
			newContact = (Contact) rnObjects[0];
		    System.out.println("Creo contacto");

		}
		catch (RemoteException e)
		{
			e.printStackTrace();
		}
		catch (RequestErrorFault e)
		{
			e.printStackTrace();
		} 
		catch (UnexpectedErrorFault e)
		{
			e.printStackTrace();
		} 
		catch (ServerErrorFault e)
		{
			e.printStackTrace();
		}
		return newContact;
	}


	@Override
	public void createOportunity(String _nombre, String _apellido, String _numeroFono, String _numeroMovil,
			Integer _tipoDocumento, String _numeroDocumento, String _email)
	{
		Opportunity opportunity = null;

		try
		{
			System.out.println("Inicio");
			Contact contact = getContactByNombreApellido(_nombre, _apellido);
			
			if(contact == null)
			{
				contact = createContact(_nombre, _apellido, _numeroFono, _numeroMovil, _tipoDocumento, _numeroDocumento, _email);
				System.out.println("No existe el contacto, se procedera a crealo");

			}
			
			poblarOportunity(contact.getID().getId());
		    System.out.println("Enviando el contacto para poblar en oportunity");

		} 
		catch (Exception e)
		{
			System.out.println("Error: "+e);
		}

	}


	@Override
	public Contact getContactByNombreApellido(String _nombre, String _apellido)
	{
		Contact contact = null;
		try
		{
			System.out.println("Inicio para buscar");
		    contact = new Contact();

		    RNObject[] objectTemplates97 = new RNObject[]{contact};
		    
		    
			
			String sql = "SELECT Contact From Contact Where Contact.Name.First='"+_nombre+"' and Contact.Name.Last='"+_apellido+"'";
			
			QueryResultData[] objectsResult = _service.queryObjects(sql, objectTemplates97, 1000, clientInfoHeader(BASIC_GET));
			contact = null;
			System.out.println("Preparado");
			if(objectsResult[0].getRNObjectsResult().getRNObjects() != null)
			{
				//Solo quiero 1 resultado
				RNObjectsResult  object=objectsResult[0].getRNObjectsResult();
				
				//Obtengo el arreglo de objetos
				RNObject[] objects = object.getRNObjects();
				//Casteo a objeto la primera posicion
				contact = (Contact)objects[0];
				
				imprimirDatosContacto(contact);
			}			
		} catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RequestErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnexpectedErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServerErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return contact;
	}

	

	@Override
	public Answer getAnswer()
	{
		Answer answer = new Answer();
		try
		{
			answer = new Answer();

		    RNObject[] objectTemplates97 = new RNObject[]{answer};
		    
		    System.out.println("Se prepara para buscar");
			
			String sql = "SELECT Answer FROM Answer";
			
			QueryResultData[] objectsResult = _service.queryObjects(sql, objectTemplates97, 1000, clientInfoHeader(BASIC_GET));
			
			System.out.println(objectsResult.length);
			if(objectsResult[0].getRNObjectsResult().getRNObjects() != null)
			{
				//Solo quiero 1 resultado
				RNObjectsResult  object=objectsResult[0].getRNObjectsResult();
				
				//Obtengo el arreglo de objetos
				RNObject[] objects = object.getRNObjects();
				//Casteo a objeto la primera posicion
				answer = (Answer)objects[0];
				
				imprimirDatosAnswer(answer);
				
			}	
		} 
		catch (RemoteException e)
		{
			e.printStackTrace();
		}
		catch (RequestErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (UnexpectedErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ServerErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NullPointerException e) 
		{
			System.out.println("Dato nulo: "+e);
			System.exit(1);
		}
		
		return answer;
	}


	@Override
	public ChannelType getChannelType()
	{
		ChannelType channelType = null;

		try
		{
//			channelType = new ChannelType();
			RNObject[] objectTemplates97 = new RNObject[]{channelType};
			
			String sql = "SELECT ChannelType FROM ChannelType";
			
			QueryResultData[] objectsResult = _service.queryObjects(sql, objectTemplates97, 1000, clientInfoHeader(BASIC_GET));
			System.out.println(objectsResult.length);
			if(objectsResult[0].getRNObjectsResult().getRNObjects() != null)
			{
				//Solo quiero 1 resultado
				RNObjectsResult  object=objectsResult[0].getRNObjectsResult();
				
				//Obtengo el arreglo de objetos
				RNObject[] objects = object.getRNObjects();
				//Casteo a objeto la primera posicion
				channelType = (ChannelType)objects[0];
				
				imprimirDatosChannelType(channelType);
				
			}	
		} 
		catch (RemoteException e)
		{
			e.printStackTrace();
		}
		catch (RequestErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (UnexpectedErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ServerErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NullPointerException e) 
		{
			System.out.println("Dato nulo: "+e);
			System.exit(1);
		}
		
		return channelType;
	}


	@Override
	public FileAttachment getFileAttachment()
	{
		FileAttachment fileAttachment = null;
		try
		{
		
			GenericObject genericObject= new GenericObject();
				
			RNObject[] rnObjects = new RNObject[]{new GenericObject()};
			
			String query ="Select FileAttachment FROM FileAttachment";
			System.out.println("Entro");
			QueryResultData[] objectsResult = _service.queryObjects(query, null, 1000, clientInfoHeader(BASIC_GET));
			
			System.out.println("Salio: "+objectsResult.length);
			
			System.out.println("Verificando Mensaje: "+objectsResult[0].getFault().getExceptionMessage());
			
			
			if(objectsResult[0].getRNObjectsResult().getRNObjects() != null)
			{
				System.out.println("1");
				//Solo quiero 1 resultado
				RNObjectsResult  rnObjectsResult=objectsResult[0].getRNObjectsResult();
				
				//Obtengo el arreglo de objetos
				RNObject[] objects = rnObjectsResult.getRNObjects();
				System.out.println("Llego");
				//Casteo a objeto la primera posicion
//				fileAttachment = (FileAttachment)objects[0];
				
				
			}	
			
		} catch (Exception e)
		{
		}
		return null;
	}


	@Override
	public Contact getContactByEmail(String email)
	{
		Contact contact = null;
		try
		{
			System.out.println("Inicio para buscar");
		    contact = new Contact();

		    RNObject[] objectTemplates97 = new RNObject[]{contact};
		    
		    
			
			String sql = "SELECT Contact.Emails.Address From Contact Where Contact.Name.First='PEDRO AUGUSTO' and Contact.Name.Last='GALARZA'";
			
		    QueryCSVResponseMsg csvResponseMsgs  =_service.queryCSV(sql, 1000, ",", false, false, clientInfoHeader("Running a CSV QUERY"));
			QueryResultData[] objectsResult = _service.queryObjects(sql, objectTemplates97, 1000, clientInfoHeader(BASIC_GET));
			contact = null;
			System.out.println("Preparado");
			if(objectsResult[0].getRNObjectsResult().getRNObjects() != null)
			{
				//Solo quiero 1 resultado
				RNObjectsResult  object=objectsResult[0].getRNObjectsResult();
				
				//Obtengo el arreglo de objetos
				RNObject[] objects = object.getRNObjects();
				//Casteo a objeto la primera posicion
				contact = (Contact)objects[0];
				
				imprimirDatosContacto(contact);
			}			
		} catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RequestErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnexpectedErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServerErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return contact;
	}



}
