package rn.service.impl;

import java.rmi.RemoteException;

import com.rightnow.ws.base.ID;
import com.rightnow.ws.base.NamedID;
import com.rightnow.ws.base.NamedIDWithParent;
import com.rightnow.ws.base.RNObject;
import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.CSVTable;
import com.rightnow.ws.messages.CSVTableSet;
import com.rightnow.ws.messages.CSVTables;
import com.rightnow.ws.messages.QueryCSVResponseMsg;
import com.rightnow.ws.messages.QueryResultData;
import com.rightnow.ws.messages.RNObjectsResult;
import com.rightnow.ws.objects.Answer;
import com.rightnow.ws.objects.AnswerNotification;
import com.rightnow.ws.objects.ChannelType;
import com.rightnow.ws.objects.Contact;
import com.rightnow.ws.objects.Email;
import com.rightnow.ws.objects.EmailList;
import com.rightnow.ws.objects.FileAttachment;
import com.rightnow.ws.objects.NoteList;
import com.rightnow.ws.objects.Opportunity;
import com.rightnow.ws.objects.PersonName;
import com.rightnow.ws.objects.ServiceProduct;
import com.rightnow.ws.wsdl.RequestErrorFault;
import com.rightnow.ws.wsdl.ServerErrorFault;
import com.rightnow.ws.wsdl.UnexpectedErrorFault;

import client.RightNowClient;
import dao.impl.IServiceRightNow;

/**
 * QueryObject: sirve para buscar objetos  y condiciones por campos del objeto primarios, funciona el CRUD Tradicional
 * QueryCSV: sirve para buscar obetener subObjetos y buscar por criterios de campo de los subOjetos
 * QueryGET: Sivr solo para buscar por el ID, es muy simplon
 * @author Gora-User
 *
 */
public class IServiceRightNowImpl extends RightNowClient implements IServiceRightNow
{

	
	

	



	

	

	


	

	@Override
	public FileAttachment getFileAttachment()
	{
		FileAttachment fileAttachment = null;
		try
		{
		
			
			
			String sql = " SELECT  Contact.FileAttachments.ID,   "
					+ "            Contact.FileAttachments.FileName,                                   "  
					+ "           Contact.FileAttachments.ContentType"  
					+ "    From Contact Where Contact.Emails.Address='chernandez@carmelitas.edu.pe.invalid'" ;
			
			QueryCSVResponseMsg csvResponseMsg =  _service.queryCSV(sql, 1000, ",", false, false, clientInfoHeader("Running a CSV QUERY"));
			
			//Logra ejecutar la operacion pero el dato que bota es nulo, puede que no haya registros de ese tipo
			System.out.println("TAMAÑO: "+csvResponseMsg.getCSVTableSet().getCSVTables().getCSVTable().length);
			
			 CSVTableSet csvTableSet =   csvResponseMsg.getCSVTableSet();
			    
				
				CSVTables csvTables = csvTableSet.getCSVTables();
				CSVTable[] csvTables2 =  csvTables.getCSVTable();
				
				
				for (CSVTable csvTable : csvTables2)
				{
					CSVRow row = csvTable.getRows();
			        String fila = row.getRow()[0];
					
			        
			        String[] arrayString = fila.split(",");
			        
			        System.out.println("Tamaño:"+ arrayString.length);
			        
			        System.out.println(arrayString[0]);
			        
				}
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return fileAttachment;
	}


	


	
	
	



	@Override
	public void getList_NamedIDDeltaList(String query)
	{
		try
		{
			NamedID[] namedIDs = _service.getValuesForNamedID(null, query, clientInfoHeader(RUNNING_A_CSV_QUERY));
			
			for (NamedID namedID : namedIDs)
			{
				System.out.println("ID :: {"+namedID.getID().getId()+"}    NAME :: {"+namedID.getName()+"} ");
				System.out.println();
			}
		} 
		catch (RemoteException e)
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}


	@Override
	public void getList_NamedIDHierarchyList(String query)
	{
		try
		{
			NamedIDWithParent[] namedIDWithParents = _service.getValuesForNamedIDHierarchy(query, clientInfoHeader(RUNNING_A_CSV_QUERY));
			
			for (NamedIDWithParent next : namedIDWithParents)
			{
		
				System.out.println("Id :: {"+next.getID()+"}   ParentID :: {"+next.getParentID()+"}   Name :: {"+next.getName()+"}");

			}
		} 
		catch (RemoteException e)
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
				
	}





	
	
	

}
