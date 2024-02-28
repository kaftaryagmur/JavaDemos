<<<<<<< HEAD
package reCapDemo10;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
		 
	}
	public void add() {
		//business codes
		customerDal.Add();
	}
}
=======
package reCapDemo10;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
		 
	}
	public void add() {
		//business codes
		customerDal.Add();
	}
}
>>>>>>> 6a6f35683c30af64c6c69cbae018cdcd82d307c2
