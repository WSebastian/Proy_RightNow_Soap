package test;

import dao.AnswerDAO;
import dao.ChannelTypeDAO;
import dao.DispositionDAO;
import dao.IncidentsDAO;
import dao.ServiceCategoriesDAO;
import dao.ServiceProductDAO;
import rn.service.AnswerDAOImpl;
import rn.service.ChannelTypeDAOImpl;
import rn.service.DispositionDAOImpl;
import rn.service.IServiceRightNow;
import rn.service.IncidentsDAOImpl;
import rn.service.ServiceCategoriesDAOImpl;
import rn.service.ServiceProductDAOImpl;
import rn.service.impl.IServiceRightNowImpl;

public class TestGetTabla
{

	
	IServiceRightNow iServiceRightNow = new IServiceRightNowImpl();
	
	static IncidentsDAO incidentsDAO = new IncidentsDAOImpl();
	
	static AnswerDAO answerDAO = new AnswerDAOImpl();
	
	static DispositionDAO dispositionDAO = new DispositionDAOImpl();
	
	static ServiceCategoriesDAO serviceCategoriesDAO =new ServiceCategoriesDAOImpl();
	
	static ChannelTypeDAO channelTypeDAO = new ChannelTypeDAOImpl();
	
	static ServiceProductDAO serviceProductDAO = new ServiceProductDAOImpl();
	
	
	public static void main(String[] args)
	{
		incidentsDAO.getIncidentContact();
	}
	
	
	
	private void getFileAttachment()
	{
	}

	private void getChannelType()
	{
		iServiceRightNow.getChannelType();
	}

	private void getAnswer()
	{
		answerDAO.map_cat_hierarchy();
	}
	
	private void getAnswerNotification()
	{
		iServiceRightNow.getAnswerNotification();
	}
	

	
	
	private void getAnswer_AccessLevels()
	{
		iServiceRightNow.getList_NamedIDDeltaList("Answer.AccessLevels");
	}
	
	private void getAnswer_Categories()
	{
		iServiceRightNow.getList_NamedIDHierarchyList("Answer.Categories");
	}
	
	
	private void getCategories()
	{
		incidentsDAO.Incidents_cat_id_byCategoryName();
	}
	
	private void getProducts()
	{
		incidentsDAO.Incidents_prod_id_ByProductName();
	}
	
	private void getDisposition()
	{
		incidentsDAO.Incidents_disp_id_byDispositionName();
	}
	

}
