package test;


import com.rightnow.ws.objects.Mailbox;

import dao.AnswerDAO;
import dao.ChannelTypeDAO;
import dao.DispositionDAO;
import dao.FileAttachmentDAO;
import dao.IncidentsDAO;
import dao.MailBoxDAO;
import dao.PacificoDAO;
import dao.SLAInstanceDAO;
import dao.ServiceCategoriesDAO;
import dao.ServiceProductDAO;
import dao.impl.AnswerDAOImpl;
import dao.impl.ChannelTypeDAOImpl;
import dao.impl.DispositionDAOImpl;
import dao.impl.FileAttachmentDAOImpl;
import dao.impl.IServiceRightNow;
import dao.impl.IncidentsDAOImpl;
import dao.impl.MailBoxDAOImpl;
import dao.impl.PacificoDAOImpl;
import dao.impl.SLInstanceDAOImpl;
import dao.impl.ServiceCategoriesDAOImpl;
import dao.impl.ServiceProductDAOImpl;
import rn.service.impl.IServiceRightNowImpl;

public class TestGetTabla
{

	IServiceRightNow iServiceRightNow = new IServiceRightNowImpl();

	static IncidentsDAO incidentsDAO = new IncidentsDAOImpl();

	static AnswerDAO answerDAO = new AnswerDAOImpl();

	static DispositionDAO dispositionDAO = new DispositionDAOImpl();

	static ServiceCategoriesDAO serviceCategoriesDAO = new ServiceCategoriesDAOImpl();

	static ChannelTypeDAO channelTypeDAO = new ChannelTypeDAOImpl();

	static ServiceProductDAO serviceProductDAO = new ServiceProductDAOImpl();

	static SLAInstanceDAO slaInstanceDAO = new SLInstanceDAOImpl();

	static FileAttachmentDAO fileAttachmentDAO = new FileAttachmentDAOImpl();
	
	static PacificoDAO pacificoDAO = new PacificoDAOImpl();
	
	static MailBoxDAO mailBoxDAO = new MailBoxDAOImpl();

	
	public static void main(String[] args)
	{
		
		incidentsDAO.getInc_bounced_msgs();
	}
	

	private void getAnswer()
	{
		answerDAO.map_cat_hierarchy();
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
