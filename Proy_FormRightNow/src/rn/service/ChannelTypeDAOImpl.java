package rn.service;

import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.QueryCSVResponseMsg;

import client.RightNowClient;
import dao.ChannelTypeDAO;

public class ChannelTypeDAOImpl extends RightNowClient implements ChannelTypeDAO
{
	@Override
	public void chan_type_id()
	{
		try
		{
			String sql2 = "Select                                   " 
		            + "             ID,                             "
					+ "             LookupName,                     " 
		            + "             DisplayOrder,                   "
					+ "             Name                            " 
		            + "From                                         "
					+ "    ChannelType  LIMIT 1000";

			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql2, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();

			for (int i = 0; i < csvRow.getRow().length; i++)
			{
				String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
						.getRow()[i].split(",");

				System.out.println("ChannelType_id :: {" + arrayStrings[0] + "}");
				System.out.println("ChannelType_LookupName :: {" + arrayStrings[1] + "}");
				System.out.println("ChannelType_DisplayOrder :: {" + arrayStrings[2] + "}");
				System.out.println("ChannelType_Name :: {" + arrayStrings[3] + "}");

				System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
