package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	
	public  void save(Customer customer)  {
		System.out.println("veritaban�na kaydedildi "+customer.getFirstName());
		
	}

}
