import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapter2.MernisServiceAdapter;
import Concrate.NeroCustomerManger;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager1 =new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager baseCustomerManager2 =new NeroCustomerManger();
		Long a = Long.valueOf("40040040040");

		
		Customer customer=new Customer();
		 customer.setDateOfBirth(1992);
		 customer.setFirstName("Þerafettin");
		 customer.setId(5);
		 customer.setLastName("Güneþ");
		 customer.setNationalityId(a);

		 baseCustomerManager1.save(customer);
		 baseCustomerManager2.save(customer);
		 
	}

}
