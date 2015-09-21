package rn.service;

import com.rightnow.ws.objects.Contact;

public interface IServiceRightNow
{

	//Busuqeda por el id del contacto
	Contact getContact(long _idContact);
	
	//Creando el contact
	long createContact(String _nombre, String _apellido, String _numeroFono, String _numeroMovil, Integer _tipoDocumento, String _numeroDocumento, String _email);
}
