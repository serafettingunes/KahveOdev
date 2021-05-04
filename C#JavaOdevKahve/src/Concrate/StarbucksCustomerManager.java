package Concrate;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService _checkService;
	
	@Override
	public void save(Customer customer)  {
		try {
			if (_checkService.CheckIfRealPerson(customer)) {
			 System.out.println( "Starbucksa Kaydedildi : "+ customer.getFirstName());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 System.out.println("Hata");
		}
		
	}

	public StarbucksCustomerManager(ICustomerCheckService checkService) {
		super();
		this._checkService = checkService;
	}

	public StarbucksCustomerManager() {
		// TODO Auto-generated constructor stub
	}

	
	public void save() {
		// TODO Auto-generated method stub
		
	}

}
