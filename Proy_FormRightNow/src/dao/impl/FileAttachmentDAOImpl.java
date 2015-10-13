package dao.impl;

import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.QueryCSVResponseMsg;

import client.RightNowClient;
import dao.FileAttachmentDAO;

public class FileAttachmentDAOImpl extends RightNowClient implements FileAttachmentDAO
{

	@Override
	public void getFileAttachment()
	{
		try
		{
			String sql = "SELECT ID FROM FileAttachment";
			
			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql, 10000, ",", false, false, clientInfoHeader(RUNNING_A_CSV_QUERY));

			 CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();
			

			 for (int i = 0; i < csvRow.getRow().length; i++)
			{
					String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
							.getRow()[i].split(",");
					
					System.out.println("ServiceDisposition_id :: {" + arrayStrings[0] + "}");
	
					
					System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			}
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
