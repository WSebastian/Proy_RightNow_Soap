package dao.impl;

import java.rmi.RemoteException;

import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.CSVTable;
import com.rightnow.ws.messages.CSVTableSet;
import com.rightnow.ws.messages.CSVTables;
import com.rightnow.ws.messages.QueryCSVResponseMsg;
import com.rightnow.ws.wsdl.RequestErrorFault;
import com.rightnow.ws.wsdl.ServerErrorFault;
import com.rightnow.ws.wsdl.UnexpectedErrorFault;

import client.RightNowClient;

public class ServiceCategoriesDAOImpl extends RightNowClient implements dao.ServiceCategoriesDAO
{

	@Override
	public void cat_lvl1_id()
	{
		try
		{
			String sql = "SELECT "
					+ "             ID,                             "
					+ "             LookupName,                     "
					+ "             DisplayOrder,                   "
					+ "             Name                            "
					   + "FROM ServiceCategory LIMIT 1000";
			

			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			 CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();
			

			 for (int i = 0; i < csvRow.getRow().length; i++)
			{
					String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
							.getRow()[i].split(",");
					
					System.out.println("ServiceCategory_id :: {" + arrayStrings[0] + "}");
					System.out.println("ServiceCategory_LookupName :: {" + arrayStrings[1] + "}");
					System.out.println("ServiceCategory_DisplayOrder :: {" + arrayStrings[2] + "}");
					System.out.println("ServiceCategory_Name :: {" + arrayStrings[3] + "}");
					
					System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			}
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
//	@Override
//	public void getCategories()
//	{		
//		try
//		{
//			String sql = "SELECT   ID,"
//					+ "             PrimaryContact.Contact.ID,"
//					+ "             PrimaryContact.Contact.Name,"
//					+ "             StatusWithType.StatusType.Name,"
//					+ "             StatusWithType.StatusType.ID"
//					+ "     FROM Incident";
//
//
//			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql, 10000, ",", false, false, clientInfoHeader(RUNNING_A_CSV_QUERY));
//			
//			CSVTableSet csvTableSet = queryCSVResponseMsg.getCSVTableSet();
//			
//			CSVTables         csvTables =  csvTableSet.getCSVTables();
//			               
//			CSVTable[]  arrayCSVTables = csvTables.getCSVTable();
//			
//			CSVRow              csvRow = arrayCSVTables[0].getRows();
//			
//			String   fila = csvRow.getRow()[0];
//			
//			String[] arrayFila = fila.split(",");
//			
//			for (String string : arrayFila)
//			{
//				System.out.println(string);
//			}
//			
//			
//		}
//		catch (RemoteException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (RequestErrorFault e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UnexpectedErrorFault e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ServerErrorFault e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
