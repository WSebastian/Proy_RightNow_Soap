package rn.service.impl;

import java.nio.channels.Channel;
import java.rmi.RemoteException;

import javax.sound.midi.Synthesizer;

import org.apache.axis2.databinding.types.soapencoding.DateTime;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.noneDSA;
import org.jivesoftware.smackx.ReportedData.Row;

import com.rightnow.ws.base.ID;
import com.rightnow.ws.base.RNObject;
import com.rightnow.ws.generic.GenericObject;
import com.rightnow.ws.generic.RNObjectType;
import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.CSVTable;
import com.rightnow.ws.messages.CSVTableSet;
import com.rightnow.ws.messages.CSVTables;
import com.rightnow.ws.messages.QueryCSVResponseMsg;
import com.rightnow.ws.messages.QueryResultData;
import com.rightnow.ws.messages.RNObjectsResult;
import com.rightnow.ws.objects.Account;
import com.rightnow.ws.objects.Answer;
import com.rightnow.ws.objects.AnswerNotification;
import com.rightnow.ws.objects.ChannelType;
import com.rightnow.ws.objects.Contact;
import com.rightnow.ws.objects.Email;
import com.rightnow.ws.objects.EmailList;
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

/**
 * QueryObject: sirve para buscar objetos  y condiciones por campos del objeto primarios, funciona el CRUD Tradicional
 * QueryCSV: sirve para buscar obetener subObjetos y buscar por criterios de campo de los subOjetos
 * QueryGET: Sivr solo para buscar por el ID, es muy simplon
 * @author Gora-User
 *
 */
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
			
			String sql2="SELECT Answer.Categories FROM Answer";
			
			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql2, 1000, ",", false, false, clientInfoHeader(BASIC_GET));
			
//			String[] arrayString = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows().getRow()[0].split(",");
			
			
//			System.out.println("Yaju: "+queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable().length);
//			System.out.println("Salio: "+arrayString[0]);
			
			
			
		
			
			
			
//			QueryCSVResponseMsg csvResponseMsg = _service.queryCSV(sql2, 1000, ",", false, false, clientInfoHeader("Running a CSV QUERY"));
			
//			System.out.println("Tamaño del csvResponse: "+csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable().length);
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
			e.printStackTrace();
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
		
			
			
			String sql = " SELECT  Contact.FileAttachments.ID,   "
					+ "            Contact.FileAttachments.FileName,                                   "  
					+ "           Contact.FileAttachments.ContentType"  
					+ "    From Contact Where Contact.Emails.Address='chernandez@carmelitas.edu.pe.invalid'" ;
			
			QueryCSVResponseMsg csvResponseMsg =  _service.queryCSV(sql, 1000, ",", false, false, clientInfoHeader("Running a CSV QUERY"));
			
			//Logra ejecutar la operacion pero el dato que bota es nulo, puede que no haya registros de ese tipo
			System.out.println("TAMAÑO: "+csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable().length);
			
			 CSVTableSet csvTableSet =   csvResponseMsg.getCSVTableSet();
			    
				
				CSVTables csvTables = csvTableSet.getCSVTables();
				CSVTable[] csvTables2 =  csvTables.getCSVTable();
				
				
				for (CSVTable csvTable : csvTables2)
				{
					CSVRow row = csvTable.getRows();
			        String fila = row.getRow()[0];
					
			        
			        String[] arrayString = fila.split(",");
			        
			        System.out.println("Tamaño:"+ arrayString.length);
			        
			        System.out.println(arrayString[0]);
			        
				}
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return fileAttachment;
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
			
		    QueryCSVResponseMsg csvResponseMsgs  =_service.queryCSV(sql, 1000, ",", false, false, clientInfoHeader("Running a CSV QUERY"));
		    
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


	/**
	 * Aqui se usara consultas usando Join segun lo descrito en la documentacion
	 *  http://documentation.custhelp.com/euf/assets/devdocs/august2014/Connect_Web_Services_for_SOAP/Content/RightNow%20Object%20Query%20Language/ROQL%20and%20Common%20Objects.htm
	 */
	@Override
	public AnswerNotification getAnswerNotification()
	{
		try
		{
//			String sql =" Select Answer.ContactsWithNotifications.ServiceSettings.AnswerNotifications.AnswerNotificationList.Answer.Name,"
//					 +"          Answer.ContactsWithNotifications.ID"
//					 +"   From Answer";
//			QueryCSVResponseMsg csvResponseMsg = _service.queryCSV(sql, 1000, ",", false, false, clientInfoHeader("Running a CSV QUERY"));
//			
//			String[] arrayString = csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows().getRow();
//			
//			System.out.println("ans_notif :::: a_id: "+arrayString[0]);
//			System.out.println("ans_notif :::: c_id: "+arrayString[1]);
			
			String sql =" Select Answer.ContactsWithNotifications.ServiceSettings.AnswerNotifications.AnswerNotificationList.Answer.StartTime From Answer";
			QueryCSVResponseMsg csvResponseMsg = _service.queryCSV(sql, 10000, ",", false, false, clientInfoHeader("Running a CSV QUERY"));
			
//			String dateTime = csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows().getRow()[0];
			
			 String columans = csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows().getRow()[0];

			 System.out.println("Columnas: "+columans);
			
			System.out.println("Slio");
	
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}



}
