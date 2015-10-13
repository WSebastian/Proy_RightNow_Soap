package dao.impl;

import com.rightnow.ws.objects.Contact;
import com.rightnow.ws.objects.Opportunity;

import client.RightNowClient;
import dao.ContactDAO;
import dao.OpportunityDAO;

public class OpportunityDAOImpl extends RightNowClient implements OpportunityDAO
{
	@Override
	public void createOportunity(String _nombre, String _apellido, String _numeroFono, String _numeroMovil,
			Integer _tipoDocumento, String _numeroDocumento, String _email)
	{
		Opportunity opportunity = null;

		ContactDAO contactDAO = new ContactDAOImpl();
		try
		{
			System.out.println("Inicio");
			Contact contact = contactDAO.getContactByNombreApellido(_nombre, _apellido);
			
			if(contact == null)
			{
				contact = contactDAO.createContact(_nombre, _apellido, _numeroFono, _numeroMovil, _tipoDocumento, _numeroDocumento, _email);
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

}
