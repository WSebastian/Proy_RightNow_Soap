package client;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.ServiceClient;

import com.rightnow.ws.wsdl.RightNowSyncService;
import com.rightnow.ws.wsdl.RightNowSyncServiceStub;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.impl.OMNamespaceImpl;
import org.apache.axiom.om.impl.llom.OMElementImpl;
import org.apache.axiom.soap.impl.llom.soap11.SOAP11Factory;
import org.apache.ws.security.WSConstants;

import com.rightnow.ws.base.ActionEnum;
import com.rightnow.ws.base.ID;
import com.rightnow.ws.base.NamedID;
import com.rightnow.ws.base.RNObject;
import com.rightnow.ws.generic.DataValue;
import com.rightnow.ws.generic.GenericField;
import com.rightnow.ws.generic.GenericObject;
import com.rightnow.ws.messages.ClientInfoHeader;
import com.rightnow.ws.messages.CreateProcessingOptions;
import com.rightnow.ws.messages.GetProcessingOptions;
import com.rightnow.ws.messages.RNObjectsResult;
import com.rightnow.ws.objects.Contact;
import com.rightnow.ws.objects.Email;
import com.rightnow.ws.objects.EmailList;
import com.rightnow.ws.objects.NoteList;
import com.rightnow.ws.objects.Opportunity;
import com.rightnow.ws.objects.OpportunityContact;
import com.rightnow.ws.objects.PersonName;
import com.rightnow.ws.objects.Phone;
import com.rightnow.ws.objects.PhoneList;
import com.rightnow.ws.objects.StatusWithType;
import com.rightnow.ws.wsdl.RequestErrorFault;
import com.rightnow.ws.wsdl.ServerErrorFault;
import com.rightnow.ws.wsdl.UnexpectedErrorFault;

import model.ContactDTO;

import java.rmi.RemoteException;
import java.util.Iterator;

public class RightNowClient
{

	protected RightNowSyncService _service;
	protected final static String BASIC_GET = "Basic Get", AXIS2_GETTING_STARTED = "Axis2 Getting Started";

	// Contructor
	public RightNowClient()
	{
		try
		{
			_service = new RightNowSyncServiceStub();
			ServiceClient serviceClient = ((org.apache.axis2.client.Stub) _service)._getServiceClient();
			serviceClient.addHeader(createSecurityHeader("rnconnect", "RNconnect123"));
		} catch (AxisFault e)
		{
			e.printStackTrace();
		}

	}

	public GetProcessingOptions getProcessingOptions()
	{
		GetProcessingOptions getProcessingOptions = new GetProcessingOptions();
		getProcessingOptions.setFetchAllNames(false);
		

		return getProcessingOptions;
	}

	public CreateProcessingOptions createProcessingOptions()
	{
		// Set the create processing options, allow external events and
		// rules to execute
		CreateProcessingOptions createProcessingOptions = new CreateProcessingOptions();
		createProcessingOptions.setSuppressExternalEvents(false);
		createProcessingOptions.setSuppressRules(false);

		return createProcessingOptions;
	}

	public ClientInfoHeader clientInfoHeader(String _appId)
	{
		ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
		clientInfoHeader.setAppID(_appId);

		return clientInfoHeader;
	}

	protected Opportunity poblarOportunity(long _idContact)
	{
		Opportunity newOpportunity = new Opportunity();

		//Enviando nombre de la oportunidad
		newOpportunity.setName("Campaña AB");

	   //Enviando id del contacto
		ID contactID = new ID();
		contactID.setId(_idContact);
		Contact contact = new Contact();
		contact.setID(contactID);

		
		
		
//		NAMEDID NAMEDIDCONTACT = NEW NAMEDID();



//		namedIDContact.setID(contactID);
		

		// NamedID contact = new NamedID();
		//
		// ID contactID = new ID();
		// contactID.setId(_idContact);
		//
		// contact.setID(contactID);
		//
		// NamedID contactRole = new NamedID();
		//
		// System.out.println("Llego");
		// ID contactRoleID = new ID();
		// contactRoleID.setId(1);
		//
		// contactRole.setID(contactRoleID);
		//
		//// NamedID campaign = new NamedID();
		////
		//// ID campaignId = new ID();
		//// campaignId.setId(1);
		////
		//// campaign.setID(campaignId);
		//
		// NamedID status = new NamedID();
		//
		// ID statusId = new ID();
		// statusId.setId(1);
		//
		// status.setID(statusId);
		//
		// StatusWithType statusWT = new StatusWithType();
		// statusWT.setStatus(status);
		//
		// OpportunityContact opportunityContact = new OpportunityContact();
		// opportunityContact.setContact(contact);
		// opportunityContact.setContactRole(contactRole);
		//
		// newOpportunity.setPrimaryContact(opportunityContact);
		//// newOpportunity.setCampaign(campaign);
		// newOpportunity.setName("247");
		// newOpportunity.setSummary("340");
		// newOpportunity.setStatusWithType(statusWT);

		return newOpportunity;

	}

	protected Contact poblarInfoContacto(String _nombre, String _apellido, String _numeroFono, String _numeroMovil,
			Integer _tipoDocumento, String _numeroDocumento, String _email)
	{
		Contact newContact = new Contact();

		PersonName personName = new PersonName();
		personName.setFirst(_nombre);
		personName.setLast(_apellido);

		newContact.setName(personName);

		PhoneList phoneList = new PhoneList();
		Phone[] listaArray = new Phone[2];

		NamedID phoneTypeMovil = new NamedID();
		ID phoneTypeIDMovil = new ID();
		phoneTypeIDMovil.setId(2);
		phoneTypeMovil.setID(phoneTypeIDMovil);
		phoneTypeMovil.setName("mobile phone");

		listaArray[0] = new Phone();
		listaArray[0].setPhoneType(phoneTypeMovil);
		listaArray[0].setNumber(_numeroMovil);

		// Si el numerico telefonico no es nulo se guardara en la lista como
		// parte del dato
		if (_numeroFono != null)
		{

			ID phoneTypeIDFijo = new ID();
			phoneTypeIDFijo.setId(1);
			NamedID phoneTypeFijo = new NamedID();
			phoneTypeFijo.setID(phoneTypeIDFijo);
			phoneTypeFijo.setName("landline");

			listaArray[1] = new Phone();
			listaArray[1].setPhoneType(phoneTypeFijo);
			listaArray[1].setNumber(_numeroFono);
		}

		phoneList.setPhoneList(listaArray);
		newContact.setPhones(phoneList);

		GenericField customField1 = new GenericField();
		
		if (_tipoDocumento == 1)
		{
			customField1.setName("IDNumberDni");
		} 
		else if (_tipoDocumento == 2)
		{
			customField1.setName("IDNumberCe");
		} 
		else if (_tipoDocumento == 3)
		{
			customField1.setName("IDNumberPassport");
		} 
		else if (_tipoDocumento == 4)
		{
			customField1.setName("IDNumberRuc");
		}

		DataValue dataValue1 = new DataValue();
		dataValue1.setStringValue(_numeroDocumento);

		customField1.setDataValue(dataValue1);

		// Create a GenericField representing "c", a package containing all
		// custom fields
		GenericField cField = new GenericField();
		cField.setName("contact");
		
		// set a value of contact to a GenericField containing all custom
		// objects
		DataValue dataValue = new DataValue();
		GenericObject allCustomFields = new GenericObject();
		allCustomFields.addGenericFields(customField1);
		dataValue.setObjectValue(allCustomFields);
		cField.setDataValue(dataValue);
		
		

		// create a enclosure GenericObject containing 'c'
		GenericObject genericObj = new GenericObject();
		genericObj.addGenericFields(cField);
		// set GenericObject to contact's customField attribute
		newContact.setCustomFields(genericObj);
		
	
		
//		
//		GenericField customField2 = new GenericField();
//		customField2.setName("Auto");
//		
//		DataValue dataValue2 = new DataValue();
//		dataValue2.setStringValue("C6K558");
//		
//		customField2.setDataValue(dataValue2);
//		
//		
//		
//		
//		GenericField genericField3 = new GenericField();
//		genericField3.setName("pacifico");
//
//		DataValue dataValue3 = new DataValue();
//		GenericObject genericObject = new GenericObject();
//		genericObject.addGenericFields(customField2);
//		
//		dataValue3.setObjectValue(genericObject);
//		genericField3.setDataValue(dataValue3);
//		
//		GenericObject genericObject2 = new GenericObject();
//		genericObject2.addGenericFields(genericField3);
//		
//		newContact.setCustomFields(genericObject2);
//
//		
//		
		
		
		
		
		
		EmailList emailList = new EmailList();
		Email[] emailArray = new Email[1];
		emailArray[0] = new Email();
		emailArray[0].setAction(ActionEnum.add);
		emailArray[0].setAddress(_email);

		NamedID addressType = new NamedID();
		ID addressTypeID = new ID();
		addressTypeID.setId(1);
		addressType.setID(addressTypeID);

		emailArray[0].setAddressType(addressType);
		emailArray[0].setInvalid(false);

		emailList.setEmailList(emailArray);
		newContact.setEmails(emailList);

		return newContact;
	}

	// // Metodo que estoy usando para hacer las prueba
	// private Contact populateContactInfo(ContactDTO _contactDTO)
	// {
	//
	// Contact newContact = new Contact();
	//
	// PersonName personName = new PersonName();
	// personName.setFirst(_contactDTO.getNombre());
	// personName.setLast(_contactDTO.getApellido());
	//
	// newContact.setName(personName);
	//
	// NamedID phoneTypeFijo = new NamedID();
	//
	// NamedID phoneTypeMovil = new NamedID();
	//
	// ID phoneTypeIDFijo = new ID();
	// phoneTypeIDFijo.setId(1);
	//
	// ID phoneTypeIDMovil = new ID();
	// phoneTypeIDMovil.setId(2);
	//
	// phoneTypeFijo.setID(phoneTypeIDFijo);
	// phoneTypeFijo.setName("landline");
	//
	// phoneTypeMovil.setID(phoneTypeIDMovil);
	// phoneTypeMovil.setName("mobile phone");
	//
	// PhoneList phoneList = new PhoneList();
	// Phone[] listaArray = new Phone[2];
	// listaArray[0] = new Phone();
	// listaArray[0].setPhoneType(phoneTypeFijo);
	// listaArray[0].setNumber(_contactDTO.getFonoFijo());
	//
	// listaArray[1] = new Phone();
	// listaArray[1].setPhoneType(phoneTypeMovil);
	// listaArray[1].setNumber(_contactDTO.getFonoMovil());
	//
	// phoneList.setPhoneList(listaArray);
	// newContact.setPhones(phoneList);
	//
	// GenericField customField1 = new GenericField();
	//
	// if (_contactDTO.getTipoDocumento() == 1)
	// {
	// customField1.setName("IDNumberDni");
	// } else if (_contactDTO.getTipoDocumento() == 2)
	// {
	// customField1.setName("IDNumberCe");
	// } else if (_contactDTO.getTipoDocumento() == 3)
	// {
	// customField1.setName("IDNumberPassport");
	// } else if (_contactDTO.getTipoDocumento() == 4)
	// {
	// customField1.setName("IDNumberRuc");
	//
	// }
	//
	// DataValue dataValue1 = new DataValue();
	// dataValue1.setStringValue(_contactDTO.getNumDocumento());
	//
	// customField1.setDataValue(dataValue1);
	//
	// // Create a GenericField representing "c", a package containing all
	// // custom fields
	// GenericField cField = new GenericField();
	// cField.setName("contact");
	//
	// // set a value of contact to a GenericField containing all custom
	// // objects
	// DataValue dataValue = new DataValue();
	// GenericObject allCustomFields = new GenericObject();
	// allCustomFields.addGenericFields(customField1);
	// dataValue.setObjectValue(allCustomFields);
	// cField.setDataValue(dataValue);
	//
	// // create a enclosure GenericObject containing 'c'
	// GenericObject genericObj = new GenericObject();
	// genericObj.addGenericFields(cField);
	// // set GenericObject to contact's customField attribute
	// newContact.setCustomFields(genericObj);
	//
	// EmailList emailList = new EmailList();
	// Email[] emailArray = new Email[1];
	// emailArray[0] = new Email();
	// emailArray[0].setAction(ActionEnum.add);
	// emailArray[0].setAddress(_contactDTO.getEmail());
	//
	// NamedID addressType = new NamedID();
	// ID addressTypeID = new ID();
	// addressTypeID.setId(1);
	// addressType.setID(addressTypeID);
	//
	// emailArray[0].setAddressType(addressType);
	// emailArray[0].setInvalid(false);
	//
	// emailList.setEmailList(emailArray);
	// newContact.setEmails(emailList);
	//
	// System.out.println("Poblo todo el contact");
	//
	// return newContact;
	// }
	////
	// public Contact getContact(long _id)
	// throws RemoteException, RequestErrorFault, UnexpectedErrorFault,
	// ServerErrorFault
	// {
	//
	// // ----------- Parametros para la solicitud de GET ---------------
	//
	// GetProcessingOptions getProcessingOptions = new GetProcessingOptions();
	// getProcessingOptions.setFetchAllNames(false);
	//
	// ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
	// clientInfoHeader.setAppID("Basic Get");
	//
	// // ----------------------------------------------------------------
	//
	// Contact contact = new Contact();
	//
	// PersonName personName = new PersonName();
	// personName.setFirst("Pedrito");
	// personName.setLast("Camela");
	//
	// contact.setName(personName);
	//
	// ID IDContact = new ID();
	//
	// IDContact.setId(7755522);
	// contact.setID(IDContact);
	//
	// NoteList notes = new NoteList();
	//
	// contact.setNotes(notes);
	//
	// RNObject[] rnObjects = new RNObject[] { contact };
	//
	// System.out.println("Antes de ejecutar");
	//
	// RNObjectsResult rnObjectsResult = _service.get(rnObjects,
	// getProcessingOptions, clientInfoHeader);
	//
	// RNObject[] rnObjects2 = rnObjectsResult.getRNObjects();
	//
	// Contact contact2 = (Contact)rnObjects2[0];
	//
	// imprimirDatosContacto(contact2);
	//
	//
	// return contact2;
	// }
	//
	//

	//
	// private Opportunity populateOportunityInfo(long _idContact)
	// {
	// Opportunity newOpportunity = new Opportunity();
	//
	// NamedID contact = new NamedID();
	//
	// ID contactID = new ID();
	// contactID.setId(_idContact);
	//
	// contact.setID(contactID);
	//
	// NamedID contactRole = new NamedID();
	//
	// ID contactRoleID = new ID();
	// contactRoleID.setId(1);
	//
	// contactRole.setID(contactRoleID);
	//
	// NamedID campaign = new NamedID();
	//
	// ID campaignId = new ID();
	// campaignId.setId(1);
	//
	// campaign.setID(campaignId);
	//
	// OpportunityContact opportunityContact = new OpportunityContact();
	// opportunityContact.setContact(contact);
	// opportunityContact.setContactRole(contactRole);
	//
	// newOpportunity.setPrimaryContact(opportunityContact);
	// newOpportunity.setCampaign(campaign);
	// newOpportunity.setName("nombre");
	//
	// return newOpportunity;
	// }
	//
	// public long createOpportunity(long _idContact)
	// {
	// Opportunity newOpportunity = null;
	// try
	// {
	// System.out.println("Llego para crear la oportunidad: " + _idContact);
	//
	// newOpportunity = populateOportunityInfo(_idContact);
	//
	// // Set the application ID in the client info header.
	// ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
	// clientInfoHeader.setAppID("Axis2 Getting Started");
	//
	// // Set the create processing options, allow external events and
	// // rules to execute
	// CreateProcessingOptions createProcessingOptions = new
	// CreateProcessingOptions();
	// createProcessingOptions.setSuppressExternalEvents(false);
	// createProcessingOptions.setSuppressRules(false);
	//
	// RNObject[] createObjects = new RNObject[] { newOpportunity };
	//
	// System.out.println("Antes de invocar el metodo create");
	// // Invoke the create operation on the RightNow server
	// RNObjectsResult createResults = _service.create(createObjects,
	// createProcessingOptions, clientInfoHeader);
	// // We only created a single contact, this will be at index 0 of the
	// // results
	// RNObject[] rnObjects = createResults.getRNObjects();
	// newOpportunity = (Opportunity) rnObjects[0];
	// } catch (RemoteException e)
	// {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (RequestErrorFault e)
	// {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (UnexpectedErrorFault e)
	// {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (ServerErrorFault e)
	// {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// return newOpportunity.getID().getId();
	// }
	//
	// public long createContact(ContactDTO _contactDTO)
	// {
	// Contact newContact = null;
	// try
	// {
	// newContact = populateContactInfo(_contactDTO);
	//
	//// imprimirDatosContacto(newContact);
	//
	// // Set the application ID in the client info header.
	// ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
	// clientInfoHeader.setAppID("Axis2 Getting Started");
	//
	// // Set the create processing options, allow external events and
	// // rules to execute
	// CreateProcessingOptions createProcessingOptions = new
	// CreateProcessingOptions();
	// createProcessingOptions.setSuppressExternalEvents(false);
	// createProcessingOptions.setSuppressRules(false);
	//
	// RNObject[] createObjects = new RNObject[] { newContact };
	//
	// // Invoke the create operation on the RightNow server
	// RNObjectsResult createResults;
	// createResults = _service.create(createObjects, createProcessingOptions,
	// clientInfoHeader);
	// // We only created a single contact, this will be at index 0 of
	// // the
	// // results
	// RNObject[] rnObjects = createResults.getRNObjects();
	// newContact = (Contact) rnObjects[0];
	//
	// System.out.println("Contacto creado: " + newContact.getID().getId());
	//
	// }
	// catch (RemoteException e)
	// {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// catch (RequestErrorFault e)
	// {
	// System.out.println("Error: " + e);
	// } catch (UnexpectedErrorFault e)
	// {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (ServerErrorFault e)
	// {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// return newContact.getID().getId();
	// }

	private OMElement createSecurityHeader(String username, String password)
	{
		OMNamespaceImpl wsseNS = new OMNamespaceImpl(WSConstants.WSSE_NS, WSConstants.WSSE_PREFIX);
		OMFactory factory = new SOAP11Factory();
		OMElementImpl securityHeader;
		OMElementImpl usernameTokenElement;
		OMElementImpl usernameElement;
		OMElementImpl passwordElement;

		// create the Security header block
		securityHeader = new OMElementImpl("Security", wsseNS, factory);
		securityHeader.addAttribute("mustUnderstand", "1", null);

		// nest the UsernameToken in the Security header
		usernameTokenElement = new OMElementImpl(WSConstants.USERNAME_TOKEN_LN, wsseNS, securityHeader, factory);

		// nest the Username and Password elements
		usernameElement = new OMElementImpl(WSConstants.USERNAME_LN, wsseNS, usernameTokenElement, factory);
		usernameElement.setText(username);

		passwordElement = new OMElementImpl(WSConstants.PASSWORD_LN, wsseNS, usernameTokenElement, factory);
		passwordElement.setText(password);
		passwordElement.addAttribute(WSConstants.PASSWORD_TYPE_ATTR, WSConstants.PASSWORD_TEXT, null);

		return securityHeader;

	}

	protected void imprimirDatosContacto(Contact _contact)
	{
		System.out.println(":::::::::::: Contact recibido para impresion :::::::::");

		if (_contact.getID() != null)
		{
			System.out.println("ID: " + _contact.getID().getId());
		}

		if (_contact.getName().getFirst() != null)
		{
			System.out.println("Nombre: " + _contact.getName().getFirst());
		}

		if (_contact.getName().getLast() != null)
		{
			System.out.println("Apellido: " + _contact.getName().getLast());
		}
		

		if (_contact.getEmails() != null)
		{
			System.out.println("Imprimiendo lista de Emails");
			for (int i = 0; i < _contact.getEmails().getEmailList().length; i++)
			{
				System.out.println("  " + i + ".- Email : " + _contact.getEmails().getEmailList()[i].getAddress());

			}
		}

		if (_contact.getPhones() != null)
		{
			System.out.println("Imprimiendo lista de telefonos");
			for (int i = 0; i < _contact.getPhones().getPhoneList().length; i++)
			{
				System.out.println("  " + i + ".- Tipo de telefono: "
						+ _contact.getPhones().getPhoneList()[i].getPhoneType().getName());
				System.out.println(
						"  " + i + ".- Numero telefonico: " + _contact.getPhones().getPhoneList()[i].getNumber());
			}
		}

		if (_contact.getCustomFields() != null)
		{
			GenericField[] genericFields = _contact.getCustomFields().getGenericFields();
			for (int i = 0; i < genericFields.length; i++)
			{
				System.out.println("Package?:  " + genericFields[0].getName());

				GenericField[] genericField2 = genericFields[i].getDataValue().getObjectValue().getGenericFields();
				for (int j = 0; j < genericField2.length; j++)
				{
					System.out.println("Custom Field: " + genericField2[i].getName());
					System.out.println("  " + i + ".- Valor: " + genericField2[i].getDataValue().getStringValue());

				}

			}
		}

	}

}
