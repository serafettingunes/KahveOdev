package Adapter2;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap mernis = new KPSPublicSoapProxy();

		try {
			return mernis.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName(),
					customer.getLastName(), customer.getDateOfBirth());
		} catch (Exception e) {
			return false;
			
		}

	}

}
