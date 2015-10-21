package dao;

public interface IncidentsDAO
{
	/**
	 * Lista todos las categorias disponibles
	 * para asignar a los incidentes
	 */
	void getIncidentsCategories();
	void Incidents_cat_id_byCategoryName();
	
	
	void getIncidentsProducts();
	void Incidents_prod_id_ByProductName();
	
	
	void getIncidentsDispositions();
	void Incidents_disp_id_byDispositionName();
	void getIncidentContact();
	
	
	void getInc_performance();
	
	void getInc_bounced_msgs();
	
	void getIncidentsField();
}
