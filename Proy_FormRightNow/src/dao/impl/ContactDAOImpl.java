package dao.impl;

import java.rmi.RemoteException;

import com.rightnow.ws.base.ID;
import com.rightnow.ws.base.RNObject;
import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.CSVTable;
import com.rightnow.ws.messages.CSVTableSet;
import com.rightnow.ws.messages.CSVTables;
import com.rightnow.ws.messages.QueryCSVResponseMsg;
import com.rightnow.ws.messages.QueryResultData;
import com.rightnow.ws.messages.RNObjectsResult;
import com.rightnow.ws.objects.Contact;
import com.rightnow.ws.objects.Email;
import com.rightnow.ws.objects.EmailList;
import com.rightnow.ws.objects.NoteList;
import com.rightnow.ws.objects.PersonName;
import com.rightnow.ws.wsdl.RequestErrorFault;
import com.rightnow.ws.wsdl.ServerErrorFault;
import com.rightnow.ws.wsdl.UnexpectedErrorFault;

import client.RightNowClient;
import dao.ContactDAO;

public class ContactDAOImpl extends RightNowClient implements ContactDAO
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
	public Contact getContactByEmail(String email)
	{
		Contact contact = null;
		try
		{
		   
		    
		    
			
			String sql = " SELECT  Contact.ID,                 "
					+ "            Contact.Name.First,         "
					+ "            Contact.Name.Last,          "
					+ "            Contact.Emails.Address      "
					+ "    From Contact Where Contact.Emails.Address='"+email+"'";
			
		    QueryCSVResponseMsg csvResponseMsgs  =_service.queryCSV(sql, 1000, ",", false, false, clientInfoHeader(RUNNING_A_CSV_QUERY));
		    
		    CSVTableSet csvTableSet =   csvResponseMsgs.getCSVTableSet();
		    
			
			CSVTables csvTables = csvTableSet.getCSVTables();
			CSVTable[] csvTables2 =  csvTables.getCSVTable();
			
			contact = new Contact();
			for (CSVTable csvTable : csvTables2)
			{
				CSVRow row = csvTable.getRows();
		        String fila = row.getRow()[0];
				
		        
		        String[] arrayString = fila.split(",");
		        
		        
		 
		        
		        ID id =new ID();
				id.setId(Long.parseLong(arrayString[0]));
				
				contact.setID(id);
				
				PersonName personaName = new PersonName();
				           personaName.setFirst(arrayString[1]);
				           personaName.setLast(arrayString[2]);
				
				           contact.setName(personaName);
				           
				           EmailList emailList = new EmailList();
				           
				           Email[] arrayEmail = new Email[1];
				           
				           arrayEmail[0] = new Email();
				           arrayEmail[0].setAddress(arrayString[3]);
				           
				           emailList.setEmailList(arrayEmail);
				           
				           contact.setEmails(emailList);
				
			}
			
			imprimirDatosContacto(contact);
			
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
