package pages;

import java.util.Arrays;
import java.util.List;

public class TestOwnerData {
	String firstName;
	String lastName;
	String address;
	String city;
	String phone;

	public TestOwnerData(String firstName, String lastName, String address, String city, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getPhone() {
		return phone;
	}

	public String firstNameANdLastName() {
		return getFirstName() + " " +
			getLastName();
	}

	public List<String> getAllInfo() {
		return Arrays.asList(firstNameANdLastName(), getAddress(), getCity(), getPhone());
	}
}

