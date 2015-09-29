package rn.service;

import com.rightnow.ws.objects.Answer;
import com.rightnow.ws.objects.AnswerNotification;
import com.rightnow.ws.objects.ChannelType;
import com.rightnow.ws.objects.Contact;
import com.rightnow.ws.objects.FileAttachment;

public interface IServiceRightNow
{

	//Busuqeda por el id del contacto
	Contact getContact(long _idContact);
	
	//Creando el contact
	Contact createContact(String _nombre, String _apellido, String _numeroFono, String _numeroMovil, Integer _tipoDocumento, String _numeroDocumento, String _email);
	
	void createOportunity(String _nombre, String _apellido, String _numeroFono, String _numeroMovil,
			Integer _tipoDocumento, String _numeroDocumento, String _email);
	
	Contact getContactByNombreApellido(String _nombre, String _apellido);
	
	Contact getContactByEmail(String email);

	Answer getAnswer();
	
	ChannelType getChannelType();
	
	FileAttachment getFileAttachment();
	
	AnswerNotification getAnswerNotification();
	
	
}
