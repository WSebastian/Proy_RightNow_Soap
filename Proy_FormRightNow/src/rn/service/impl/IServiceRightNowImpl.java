package rn.service.impl;

import java.rmi.RemoteException;

import com.rightnow.ws.base.ID;
import com.rightnow.ws.base.RNObject;
import com.rightnow.ws.messages.RNObjectsResult;
import com.rightnow.ws.objects.Contact;
import com.rightnow.ws.objects.NoteList;
import com.rightnow.ws.objects.PersonName;
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
	public long createContact(String _nombre, String _apellido, String _numeroFono, String _numeroMovil,
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
	
		return newContact.getID().getId();
	}

}
