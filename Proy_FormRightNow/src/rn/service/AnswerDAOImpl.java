package rn.service;

import java.rmi.RemoteException;

import com.rightnow.ws.base.NamedIDWithParent;
import com.rightnow.ws.base.RNObject;
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
	
	
	
	@Override
	public void getAnswerNotification()
	{
		try
		{
			String sql =" Select "
					+ "        ContactsWithNotifications.ServiceSettings.AnswerNotifications.AnswerNotificationList.Answer.Name"
					 +"   From Answer ";
			
			
			QueryCSVResponseMsg csvResponseMsg = _service.queryCSV(sql, 1000, ",", false, false, clientInfoHeader("Running a CSV QUERY"));
			
			String arrayString = csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows().getRow()[0];
			
			System.out.println(arrayString);
			
//			System.out.println("ans_notif :: a_id { "+arrayString[0]);
//			System.out.println("ans_notif :: c_id {"+arrayString[1]);
			

	
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
			answer = new Answer();

		    RNObject[] objectTemplates97 = new RNObject[]{answer};
		    
			
			String sql = "SELECT Answer FROM Answer";
			
			QueryResultData[] objectsResult = _service.queryObjects(sql, objectTemplates97, 1000, clientInfoHeader(BASIC_GET));
			
			if(objectsResult[0].getRNObjectsResult().getRNObjects() != null)
			{
				//Solo quiero 1 resultado
				RNObjectsResult  object=objectsResult[0].getRNObjectsResult();
				
				//Obtengo el arreglo de objetos
				RNObject[] objects = object.getRNObjects();
				//Casteo a objeto la primera posicion
				answer = (Answer)objects[0];
				
				
			}
			
			imprimirDatosAnswer(answer);

//			String sql2 = " SELECT AccessLevels.NamedIDList.ID,"
//					+ "            AccessLevels.NamedIDList.Name,"
//					+ "            StatusWithType.Status.Name,"
//					+ "            StatusWithType.Status.ID, "
//					+ "            StatusWithType.StatusType.ID,"
//					+ "            StatusWithType.StatusType.Name,"
//					+ "            Categories.NamedIDHierarchyList.Name"
//					+ "     FROM Answer WHERE ID = 1";
//			
//
////			String sql2 = " SELECT ParentCategory.LookupName"
////					+ "     FROM Answer WHERE ID = 1";
//			
//			
//			QueryCSVResponseMsg csvResponseMsg = _service.queryCSV(sql2, 10000, ",", false, false, clientInfoHeader(RUNNING_A_CSV_QUERY));
////
////			
////			System.out.println("Tamaño de la fila: "+csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows().getRow().length);
//			
//			
//			String id = csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows().getRow()[0].split(",")[0];
//			String name = csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows().getRow()[0].split(",")[1];
//			String estado_name = csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows().getRow()[0].split(",")[2];
//			String estado_id = csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows().getRow()[0].split(",")[3];
//			String estadoTipo_id = csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows().getRow()[0].split(",")[4];
//			String estadoTipo_name = csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable()[0].getRows().getRow()[0].split(",")[5];
//			
//			System.out.println("answers ::::: access_id:  "+id);
//			System.out.println("answers ::::: access_name:  "+name);
//			System.out.println("answers ::::: estado_name:  "+estado_name);
//			System.out.println("answers ::::: estado_id:  "+estado_id);
//			System.out.println("answers ::::: status_type_id:  "+estadoTipo_id);
//			System.out.println("answers ::::: status_type_name:  "+estadoTipo_name);



		}
		catch (NullPointerException | RemoteException | RequestErrorFault | UnexpectedErrorFault | ServerErrorFault e) 
		{
			e.printStackTrace();
			System.exit(1);
		}
		
		return answer;
	}


}
