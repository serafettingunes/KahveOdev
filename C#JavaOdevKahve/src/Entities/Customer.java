package Entities;

import Abstract.IEntitiy;

public class Customer implements IEntitiy {
	int Id;
	private String FirstName;
	private String LastName;
	private int DateOfBirth;
	private long NationalityId;

	

	/*public Customer(Long Tc, String ad, String soyad, int Date) {
		this.NationalityId=Tc;
		this.FirstName=ad;
		this.DateOfBirth=Date;
		this.LastName=soyad;
	}*/

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public long getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(long nationalityId) {
		NationalityId = nationalityId;
	}
}
