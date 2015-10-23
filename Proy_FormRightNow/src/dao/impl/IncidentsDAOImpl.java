package dao.impl;

import java.rmi.RemoteException;

import org.opensaml.ESAPISecurityConfig;

import com.rightnow.ws.base.NamedIDWithParent;
import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.QueryCSVResponseMsg;
import com.rightnow.ws.wsdl.RequestErrorFault;
import com.rightnow.ws.wsdl.ServerErrorFault;
import com.rightnow.ws.wsdl.UnexpectedErrorFault;

import client.RightNowClient;
import dao.IncidentsDAO;

public class IncidentsDAOImpl extends RightNowClient implements IncidentsDAO
{

	@Override
	public void getIncidentsCategories()
	{
		try
		{

			String sql = "Incident.Category";

			NamedIDWithParent[] namedIDWithParents = _service.getValuesForNamedIDHierarchy(sql,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			for (NamedIDWithParent next : namedIDWithParents)
			{

				System.out.println("Id :: {" + next.getID() + "}   ParentID :: {" + next.getParentID() + "}   Name :: {"
						+ next.getName() + "}");

			}

		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	/**
	 * Terminado!!!
	 */

	public void Incidents_cat_id_byCategoryName()
	{
		try
		{

			/**
			 * Para listar Todas las categorias de los incientes En un listado
			 * General
			 */

			String sql2 = "Select                                " + "             ID,                          "
					+ "             Incident.Category.ID,        " + "             Incident.Category.Name"
					+ "    From                                  "
					+ "    Incident Where Incident.Category.Name='Carta de garantía'";

			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql2, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
					.getRow()[0].split(",");

			System.out.println("Incident_id :: {" + arrayStrings[0] + "}");
			System.out.println("Incident.Category.ID :: {" + arrayStrings[1] + "}");
			System.out.println("Incident.Category.Name :: {" + arrayStrings[2] + "}");

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
			e.printStackTrace();
		} catch (ServerErrorFault e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void getIncidentsProducts()
	{
		try
		{
			String sql = "Incident.Product";

			NamedIDWithParent[] namedIDWithParents = _service.getValuesForNamedIDHierarchy(sql,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			for (NamedIDWithParent next : namedIDWithParents)
			{

				System.out.println("Id :: {" + next.getID() + "}   ParentID :: {" + next.getParentID() + "}   Name :: {"
						+ next.getName() + "}");

			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void Incidents_prod_id_ByProductName()
	{
		try
		{

			String sql = "Select                             " + "             ID,                       "
					+ "             Incident.Product.ID,      " + "             Incident.Product.Name     "
					+ "    From                               " + "    Incident Where Incident.Product.Name='SOAT'";

			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
					.getRow()[0].split(",");

			System.out.println("Incident_id :: {" + arrayStrings[0] + "}");
			System.out.println("Incident.Product.ID :: {" + arrayStrings[1] + "}");
			System.out.println("Incident.Product.Name :: {" + arrayStrings[2] + "}");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void getIncidentsDispositions()
	{
		try
		{
			String sql = "Incident.Disposition";

			NamedIDWithParent[] namedIDWithParents = _service.getValuesForNamedIDHierarchy(sql,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			for (NamedIDWithParent next : namedIDWithParents)
			{

				System.out.println("Id :: {" + next.getID() + "}   ParentID :: {" + next.getParentID() + "}   Name :: {"
						+ next.getName() + "}");

			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void Incidents_disp_id_byDispositionName()
	{

		try
		{

			String sql2 = "Select                             " + "             ID,                       "
					+ "             Incident.Disposition.ID,      " + "             Incident.Disposition.Name     "
					+ "    From                               "
					+ "    Incident Where Incident.Disposition.Name='CONSULTA'";

			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql2, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
					.getRow()[0].split(",");

			System.out.println("Incident_id :: {" + arrayStrings[0] + "}");
			System.out.println("Incident.Disposition.ID :: {" + arrayStrings[1] + "}");
			System.out.println("Incident.Disposition.Name :: {" + arrayStrings[2] + "}");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void getIncidentContact()
	{
		try
		{
			String query = "SELECT   ID," + "             PrimaryContact.Contact.ID,"
					+ "             PrimaryContact.Contact.Name," + "             StatusWithType.StatusType.Name,"
					+ "             StatusWithType.StatusType.ID" + "     FROM Incident LIMIT 1000";
			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(query, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();

			for (int i = 0; i < csvRow.getRow().length; i++)
			{
				String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
						.getRow()[i].split(",");

				String ID = arrayStrings[0];
				String contacID = arrayStrings[1];
				String contactName = arrayStrings[2];
				String incidentStatus_name = arrayStrings[3];
				String incidentStatus_id = arrayStrings[4];

				System.out.println("Incident_id :: {" + ID + "} Contact_id :: {" + contacID + "} contactName :: {"
						+ contactName + "} incidentStatus_id :: {" + incidentStatus_id + "} incidentStatus_name :: {"
						+ incidentStatus_name + "}");

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
			e.printStackTrace();
		}
	}

	@Override
	public void getInc_performance()
	{
		try
		{

			String sql = "SELECT " + "          AssignedTo.StaffGroup.ID," + "        "
					+ "   FROM Incident LIMIT 10000";

			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();

			for (int i = 0; i < csvRow.getRow().length; i++)
			{
				String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
						.getRow()[i].split(",");

				System.out.println("Incident_AssignedTo_StaffGroup.ID :: {" + arrayStrings[0] + "}");
				System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

			}

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void getIncidentsField()
	{

	}

	@Override
	public void getInc_bounced_msgs()
	{
		try
		{

			String sql = "    SELECT                                                         "
					+ "               I.PrimaryContact.Contact.ID,                           "
					+ "               I.Mailbox.Name,                                        "
					+ "               I.CreatedTime,                                         "
					+ "               I.Threads.ThreadList.ID                                "
					+ "        FROM Contact C INNER JOIN C.PrimaryContactIncidents I  LIMIT 1000";

		

			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();

			for (int i = 0; i < csvRow.getRow().length; i++)
			{
				String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
						.getRow()[i].split(",");

				System.out.println("Incident_PrimaryContact.Contact.ID :: {" + arrayStrings[0] + "}");
				System.out.println("Incident_Mailbox.ID :: {" + arrayStrings[1] + "}");
				System.out.println("Incident_CreatedTime :: {" + arrayStrings[2] + "}");
				if (arrayStrings.length == 3)
				{
					System.out.println("Incident_Threads     :: { }");
				} 
				else
				{
					System.out.println("Incident_Threads     :: {" + arrayStrings[3] + "}");
				}
				System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
