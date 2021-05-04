import Abstract.BaseCustomerManager;
import Concrate.NeroCustomerManger;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager =new NeroCustomerManger();
		Long a = Long.valueOf("12345679118");

		
		Customer customer=new Customer();
		 customer.setDateOfBirth(1992);
		 customer.setFirstName("Þerafettin");
		 customer.setId(5);
		 customer.setLastName("Güneþ");
		 customer.setNationalityId(a);

		 baseCustomerManager.save(customer);
		 
	}

}
