package servicews;

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
import org.omg.PortableServer.ServantRetentionPolicyValue;

import com.rightnow.ws.base.ActionEnum;
import com.rightnow.ws.base.ID;
import com.rightnow.ws.base.NamedID;
import com.rightnow.ws.base.RNObject;
import com.rightnow.ws.generic.DataValue;
import com.rightnow.ws.generic.GenericField;
import com.rightnow.ws.generic.GenericObject;
import com.rightnow.ws.generic.RNObjectType;
import com.rightnow.ws.messages.ClientInfoHeader;
import com.rightnow.ws.messages.CreateProcessingOptions;
import com.rightnow.ws.messages.GetProcessingOptions;
import com.rightnow.ws.messages.RNObjectsResult;
import com.rightnow.ws.objects.Contact;
import com.rightnow.ws.objects.Email;
import com.rightnow.ws.objects.EmailList;
import com.rightnow.ws.objects.Note;
import com.rightnow.ws.objects.NoteList;
import com.rightnow.ws.objects.Opportunity;
import com.rightnow.ws.objects.OpportunityContact;
import com.rightnow.ws.objects.PersonName;
import com.rightnow.ws.objects.Phone;
import com.rightnow.ws.objects.PhoneList;
import com.rightnow.ws.wsdl.RequestErrorFault;
import com.rightnow.ws.wsdl.ServerErrorFault;
import com.rightnow.ws.wsdl.UnexpectedErrorFault;

import model.ContactDTO;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;


public class SampleClient
{
	RightNowSyncService _service;

	public SampleClient()
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

//	private Contact populateContactInfo()
//	{
//		Contact newContact = new Contact();
//
//		PersonName personName = new PersonName();
//		personName.setFirst("Juan");
//		personName.setLast("Luna");
//		newContact.setName(personName);
//
//		EmailList emailList = new EmailList();
//		Email[] emailArray = new Email[1];
//		emailArray[0] = new Email();
//		emailArray[0].setAction(ActionEnum.add);
//		emailArray[0].setAddress("chrisLuna@rightnow.com");
//
//		NamedID addressType = new NamedID();
//		ID addressTypeID = new ID();
//		addressTypeID.setId(1);
//		addressType.setID(addressTypeID);
//
//		emailArray[0].setAddressType(addressType);
//		emailArray[0].setInvalid(false);
//
//		emailList.setEmailList(emailArray);
//		newContact.setEmails(emailList);
//		return newContact;
//	}

	// Metodo que estoy usando para hacer las prueba
	private Contact populateContactInfo(ContactDTO _contactDTO)
	{
		Contact newContact = new Contact();
		
		
		PersonName personName = new PersonName();
		personName.setFirst(_contactDTO.getNombre());
		personName.setLast(_contactDTO.getApellido());
				

		newContact.setName(personName);
	

		
		NamedID phoneTypeFijo = new NamedID();
		
		NamedID phoneTypeMovil = new NamedID();
		
		ID     phoneTypeIDFijo = new ID();
		       phoneTypeIDFijo.setId(1);
		       

		       
		ID     phoneTypeIDMovil = new ID();
		       phoneTypeIDMovil.setId(2);
		       
		       phoneTypeFijo.setID(phoneTypeIDFijo);
		       phoneTypeFijo.setName("landline");  
		       
		       phoneTypeMovil.setID(phoneTypeIDMovil);
		       phoneTypeMovil.setName("mobile phone");
		       
		

		PhoneList phoneList = new PhoneList();
		Phone[]   listaArray = new Phone[2];
		          listaArray[0] = new Phone();
		          listaArray[0].setPhoneType(phoneTypeFijo);
		          listaArray[0] .setNumber(_contactDTO.getFonoFijo());
		          
		          listaArray[1] = new Phone();
		          listaArray[1].setPhoneType(phoneTypeMovil);
		          listaArray[1].setNumber(_contactDTO.getFonoMovil());
		          
		          phoneList.setPhoneList(listaArray);
		          newContact.setPhones(phoneList);
		          
		 
		             GenericField customField1 = new GenericField();
		            
		             if(_contactDTO.getTipoDocumento()==1)
		             {
		            	 customField1.setName("IDNumberDni");
		             }
		             else if(_contactDTO.getTipoDocumento()==2)
		             {
		            	 customField1.setName("IDNumberCe");
		             }
		             else if(_contactDTO.getTipoDocumento()==3)
		             {
		            	 customField1.setName("IDNumberPassport");
		             }
		             else if(_contactDTO.getTipoDocumento()==4)
		             {
		            	 customField1.setName("IDNumberRuc");

		             }
		            
		             DataValue dataValue1 = new DataValue();
		             dataValue1.setStringValue(_contactDTO.getNumDocumento());
		            
		             customField1.setDataValue(dataValue1);
		            
		             //Create a GenericField representing "c", a package containing all custom fields
		             GenericField cField = new GenericField();
		             cField.setName("contact");
		            
		             //set a value of contact to a GenericField containing all custom objects
		             DataValue dataValue = new DataValue();
		             GenericObject allCustomFields = new GenericObject();
		             allCustomFields.addGenericFields(customField1);
		             dataValue.setObjectValue(allCustomFields);
		             cField.setDataValue(dataValue);
		            
		             //create a enclosure GenericObject containing 'c'
		             GenericObject genericObj = new GenericObject();
		             genericObj.addGenericFields(cField);
		             //set GenericObject to contact's customField attribute
		             newContact.setCustomFields(genericObj); 
		          

		EmailList emailList = new EmailList();
		Email[] emailArray = new Email[1];
		emailArray[0] = new Email();
		emailArray[0].setAction(ActionEnum.add);
		emailArray[0].setAddress(_contactDTO.getEmail());

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
	
	public void getContact()
			throws RemoteException, RequestErrorFault, UnexpectedErrorFault, ServerErrorFault
	{
		
		//Parametros para la solicitud de GET -----
		
		GetProcessingOptions getProcessingOptions = new GetProcessingOptions();
		getProcessingOptions.setFetchAllNames(false);
		
		
		ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
		clientInfoHeader.setAppID("Basic Get");
		
		//----------------------------------------
		
		Contact contact = new Contact();
		ID      IDContact = new ID();
		
		IDContact.setId(7755431);
		contact.setID(IDContact);
		System.out.println("1");

		NoteList notes = new NoteList();
		
		contact.setNotes(notes);
		
		
		RNObject[] rnObjects = new RNObject[]{contact};
		
		System.out.println("Antes de ejecutar");
		
		RNObjectsResult rnObjectsResult =  _service.get(rnObjects, getProcessingOptions, clientInfoHeader);
		
		  
		RNObject[]  rnObjects2 = rnObjectsResult.getRNObjects();
		Contact contact2 =(Contact)rnObjects2[0];
		System.out.println("termino: "+contact2.getName().getFirst());

	}

	private Opportunity populateOportunityInfo(long _idContact)
	{
		Opportunity newOpportunity = new Opportunity();
		
		
		NamedID contact = new NamedID();

		ID contactID = new ID();
		contactID.setId(_idContact);

		contact.setID(contactID);

		NamedID contactRole = new NamedID();

		ID contactRoleID = new ID();
		contactRoleID.setId(1);

		contactRole.setID(contactRoleID);

		NamedID campaign = new NamedID();

		ID campaignId = new ID();
		campaignId.setId(1);

		campaign.setID(campaignId);
		

		
		
		OpportunityContact opportunityContact = new OpportunityContact();
		opportunityContact.setContact(contact);
		opportunityContact.setContactRole(contactRole);
		

		newOpportunity.setPrimaryContact(opportunityContact);
		newOpportunity.setCampaign(campaign);
		newOpportunity.setName("nombre");

		return newOpportunity;
	}

	public long createOpportunity(long _idContact)
	{
		Opportunity newOpportunity = null;
		try
		{
			System.out.println("Llego para crear la oportunidad: " + _idContact);

			newOpportunity = populateOportunityInfo(_idContact);

			// Set the application ID in the client info header.
			ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
			clientInfoHeader.setAppID("Axis2 Getting Started");

			// Set the create processing options, allow external events and
			// rules to execute
			CreateProcessingOptions createProcessingOptions = new CreateProcessingOptions();
			createProcessingOptions.setSuppressExternalEvents(false);
			createProcessingOptions.setSuppressRules(false);

			RNObject[] createObjects = new RNObject[] { newOpportunity };

			System.out.println("Antes de invocar el metodo create");
			// Invoke the create operation on the RightNow server
			RNObjectsResult createResults = _service.create(createObjects, createProcessingOptions, clientInfoHeader);
			// We only created a single contact, this will be at index 0 of the
			// results
			RNObject[] rnObjects = createResults.getRNObjects();
			newOpportunity = (Opportunity) rnObjects[0];
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

		return newOpportunity.getID().getId();
	}

	public long createContacto(ContactDTO _contactDTO)
	{
		Contact newContact = null;
		try
		{
			newContact = populateContactInfo(_contactDTO);


			// Set the application ID in the client info header.
			ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
			clientInfoHeader.setAppID("Axis2 Getting Started");

			// Set the create processing options, allow external events and
			// rules to execute
			CreateProcessingOptions createProcessingOptions = new CreateProcessingOptions();
			createProcessingOptions.setSuppressExternalEvents(false);
			createProcessingOptions.setSuppressRules(false);

			RNObject[] createObjects = new RNObject[] { newContact };

			// Invoke the create operation on the RightNow server
			RNObjectsResult createResults;
			createResults = _service.create(createObjects, createProcessingOptions, clientInfoHeader);
			// We only created a single contact, this will be at index 0 of the
			// results
			RNObject[] rnObjects = createResults.getRNObjects();
			newContact = (Contact) rnObjects[0];
		} catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RequestErrorFault e)
		{
			System.out.println("Error: "+e);
		} catch (UnexpectedErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServerErrorFault e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally
		 {
//		 System.out.println("Contacto creado");
//		 createOpportunity(newContact.getID().getId());
//		  
		 }

		return newContact.getID().getId();
	}

//	public long createContact() throws RemoteException, ServerErrorFault, RequestErrorFault, UnexpectedErrorFault
//	{
//		Contact newContact = populateContactInfo();
//
//		// Set the application ID in the client info header.
//		ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
//		clientInfoHeader.setAppID("Axis2 Getting Started");
//
//		// Set the create processing options, allow external events and rules to
//		// execute
//		CreateProcessingOptions createProcessingOptions = new CreateProcessingOptions();
//		createProcessingOptions.setSuppressExternalEvents(false);
//		createProcessingOptions.setSuppressRules(false);
//
//		RNObject[] createObjects = new RNObject[] { newContact };
//
//		// Invoke the create operation on the RightNow server
//		RNObjectsResult createResults = _service.create(createObjects, createProcessingOptions, clientInfoHeader);
//
//		// We only created a single contact, this will be at index 0 of the
//		// results
//		RNObject[] rnObjects = createResults.getRNObjects();
//		newContact = (Contact) rnObjects[0];
//
//		return newContact.getID().getId();
//	}

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

//	public static void main(String[] args)
//	{
//		try
//		{
//			SampleClient sampleClient = new SampleClient();
//
//			long newContactID = sampleClient.createContact();
//
//			System.out.println("New Contact Create with ID: " + newContactID);
//		} catch (AxisFault e)
//		{
//			// e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.exit(1);
//		} catch (RemoteException e)
//		{
//			// TODO Auto-generated catch block
//			// e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.exit(1);
//
//		} catch (ServerErrorFault e)
//		{
//			// TODO Auto-generated catch block
//			// e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.exit(1);
//
//		} catch (RequestErrorFault e)
//		{
//			// TODO Auto-generated catch block
//			// e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.exit(1);
//
//		} catch (UnexpectedErrorFault e)
//		{
//			// TODO Auto-generated catch block
//			// e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.exit(1);
//
//		}
//	}

}
