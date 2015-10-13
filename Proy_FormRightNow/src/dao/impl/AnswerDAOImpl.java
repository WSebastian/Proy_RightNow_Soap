package dao.impl;

import java.rmi.RemoteException;

import com.rightnow.ws.base.NamedIDWithParent;
import com.rightnow.ws.base.RNObject;
import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.QueryCSVResponseMsg;
import com.rightnow.ws.messages.QueryResultData;
import com.rightnow.ws.messages.RNObjectsResult;
import com.rightnow.ws.objects.Answer;
import com.rightnow.ws.objects.AnswerNotification;
import com.rightnow.ws.wsdl.RequestErrorFault;
import com.rightnow.ws.wsdl.ServerErrorFault;
import com.rightnow.ws.wsdl.UnexpectedErrorFault;

import client.RightNowClient;
import dao.AnswerDAO;

public class AnswerDAOImpl extends RightNowClient implements AnswerDAO
{

	@Override
	public void map_prod_hierarchy()
	{
		try
		{
			String sql = "Answer.Products";
			NamedIDWithParent[] namedIDWithParents = _service.getValuesForNamedIDHierarchy(sql, clientInfoHeader(RUNNING_A_CSV_QUERY));
			
			for (NamedIDWithParent next : namedIDWithParents)
			{
		
				System.out.println("Id :: {"+next.getID()+"}   ParentID :: {"+next.getParentID()+"}   Name :: {"+next.getName()+"}");

			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void map_cat_hierarchy()
	{
		try
		{
			String sql = "Answer.Categories";
			NamedIDWithParent[] namedIDWithParents = _service.getValuesForNamedIDHierarchy(sql, clientInfoHeader(RUNNING_A_CSV_QUERY));
			
			for (NamedIDWithParent next : namedIDWithParents)
			{
		
				System.out.println("Id :: {"+next.getID()+"}   ParentID :: {"+next.getParentID()+"}   Name :: {"+next.getName()+"}");

			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	/**
	 * Aqui se usara consultas usando Join segun lo descrito en la documentacion
	 *  http://documentation.custhelp.com/euf/assets/devdocs/august2014/Connect_Web_Services_for_SOAP/Content/RightNow%20Object%20Query%20Language/ROQL%20and%20Common%20Objects.htm
	 */
	@Override
	public void getAnswerNotification()
	{
		try
		{
			String sql =" Select "
					+ "        ID,"
					+ "        ContactsWithNotifications.ServiceSettings.AnswerNotifications.AnswerNotificationList.Interface.Name"
					 +"   From Answer  LIMIT 10000";
			
			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));
			
			 CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();
				

			 for (int i = 0; i < csvRow.getRow().length; i++)
			{
					String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
							.getRow()[i].split(",");
					
					System.out.println("Answern_id :: {" + arrayStrings[0] + "}");
					System.out.println("Answern_Interface_id :: {" + arrayStrings[1] + "}");
					
					System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");

			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	@Override
	public Answer access_id()
	{
		Answer answer = new Answer();
		try
		{
			
			

			String sql2 = "Select                                   " 
					+ "             ID,                             "
					+ "             Summary,                        "
					+ "             UpdatedTime,                    "
					+ "             AnswerType.ID,                  "
					+ "             AnswerType.Name,                "
					+ "             StatusWithType.StatusType.ID,  "
					+ "             StatusWithType.StatusType.Name  "
					+ "From                                         "
					+ "    Answer  LIMIT 1000";

			QueryCSVResponseMsg queryCSVResponseMsg = _service.queryCSV(sql2, 10000, ",", false, false,
					clientInfoHeader(RUNNING_A_CSV_QUERY));

			 CSVRow csvRow = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows();
			

			 for (int i = 0; i < csvRow.getRow().length; i++)
			{
					String[] arrayStrings = queryCSVResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows()
							.getRow()[i].split(",");
					
					System.out.println("Answern_id :: {" + arrayStrings[0] + "}");
					System.out.println("Answer_Summary :: {" + arrayStrings[1] + "}");
					System.out.println("Answer_Update :: {" + arrayStrings[2] + "}");
					System.out.println("Answer_type_id :: {" + arrayStrings[3] + "}");
					System.out.println("Answer_type_name :: {" + arrayStrings[4] + "}");
					System.out.println("Answer_status_type_ID :: {" + arrayStrings[5] + "}");
					System.out.println("Answer_status_type_name :: {" + arrayStrings[6] + "}");
					System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			}
			
			
			
			
			
//			answer = new Answer();
//
//		    RNObject[] objectTemplates97 = new RNObject[]{answer};
//		    
//			
//			String sql = "SELECT Answer FROM Answer LIMIT 10000";
//			
//			QueryResultData[] objectsResult = _service.queryObjects(sql, objectTemplates97, 1000, clientInfoHeader(BASIC_GET));
//			
//			
//			
//			if(objectsResult[0].getRNObjectsResult().getRNObjects() != null)
//			{
//				//Solo quiero 1 resultado
//				RNObjectsResult  object=objectsResult[0].getRNObjectsResult();
//				
//				//Obtengo el arreglo de objetos
//				RNObject[] objects = object.getRNObjects();
//				//Casteo a objeto la primera posicion
//				answer = (Answer)objects[0];
//				
//				
//			}
//			
//			imprimirDatosAnswer(answer);




		}
		catch (NullPointerException | RemoteException | RequestErrorFault | UnexpectedErrorFault | ServerErrorFault e) 
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		return answer;
	}


}
