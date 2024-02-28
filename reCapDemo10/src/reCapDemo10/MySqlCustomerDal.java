
package reCapDemo10;

public class MySqlCustomerDal implements ICustomerDal,IRepository{ //dal: data access layer 

	@Override
	public void Add() {
		System.out.println("My sql eklendi");
		
	} 

}
//class'lar birden fazla interface implemente edebilir