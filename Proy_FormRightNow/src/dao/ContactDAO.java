package dao;

import com.rightnow.ws.objects.Contact;

public interface ContactDAO
{
	// Busuqeda por el id del contacto
	Contact getContact(long _idContact);

	Contact getContactByNombreApellido(String _nombre, String _apellido);

	Contact createContact(String _nombre, String _apellido, String _numeroFono, String _numeroMovil,
			Integer _tipoDocumento, String _numeroDocumento, String _email);

	Contact getContactByEmail(String email);
	
	void getAll();
}
