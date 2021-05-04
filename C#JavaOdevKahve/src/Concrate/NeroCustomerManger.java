package Concrate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapter2.MernisServiceAdapter;
import Entities.Customer;

public class NeroCustomerManger extends BaseCustomerManager {

	private ICustomerCheckService _custumerChechService;

	public NeroCustomerManger() {
		super();
		this._custumerChechService = _custumerChechService;
	}

	

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName() +" Adlý Kullanýcý Neroya kaydedildi ");
		
	}

	

}
