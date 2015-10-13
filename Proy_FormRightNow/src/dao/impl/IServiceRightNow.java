package dao.impl;


import com.rightnow.ws.objects.FileAttachment;

public interface IServiceRightNow
{

	FileAttachment getFileAttachment();
	void getList_NamedIDDeltaList(String query);
	void getList_NamedIDHierarchyList(String query);
	

}
