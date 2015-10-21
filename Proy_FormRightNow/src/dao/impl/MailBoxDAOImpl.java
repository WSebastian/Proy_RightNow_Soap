package dao.impl;

import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.QueryCSVResponseMsg;

import client.RightNowClient;
import dao.MailBoxDAO;

public class MailBoxDAOImpl extends RightNowClient implements MailBoxDAO
{

	@Override
	public void getMailBox()
	{
		try
		{
			String sql = "SELECT ID, LookupName, CreatedTime, Name, Type.ID, Type.Name FROM MailBox LIMIT 1000";
			
			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql, 10000, ",", false, false, clientInfoHeader(RUNNING_A_CSV_QUERY));
			
			CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();
			
			String[] arrayString = csvRow.getRow();
			
			for (int i = 0; i < arrayString.length; i++)
			{
				String[] fila = arrayString[i].split(",");
				
				System.out.println("MailBox.ID :: "+fila[0]);
				System.out.println("MailBox.LookupName :: "+fila[1]);
				System.out.println("MailBox.CreatedTime :: "+fila[2]);
				System.out.println("MailBox.Name :: "+fila[3]);
				System.out.println("MailBox.Type.ID :: "+fila[4]);
				System.out.println("MailBox.Type.Name :: "+fila[5]);
				
				System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
