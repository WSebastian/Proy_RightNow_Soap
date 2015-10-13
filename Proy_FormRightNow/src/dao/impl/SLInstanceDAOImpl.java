package dao.impl;

import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.QueryCSVResponseMsg;

import client.RightNowClient;
import dao.SLAInstanceDAO;

public class SLInstanceDAOImpl extends RightNowClient implements SLAInstanceDAO
{

	@Override
	public void getSLAInstance()
	{
		try
		{
			String sql = "SELECT SLAInstance.NameOfSLA.ID FROM Incident LIMIT 1000";
			
			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();

			for (int i = 0; i < csvRow.getRow().length; i++)
			{
				String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
						.getRow()[i].split(",");

				System.out.println("Incident :: {" + arrayStrings[0] + "}");
				

				System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
