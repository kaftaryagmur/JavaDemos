package reCapDemo9;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		//OracleDatabaseManager databaseManager= new OracleDatabaseManager(); //bagimlilik saglanir!!!!!!!!!	
		databaseManager.getData();
	}
}
