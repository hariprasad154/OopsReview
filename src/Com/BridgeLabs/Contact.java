package Com.BridgeLabs;

public class Contact {
	private String Name;
	private String Age;
	private String PhoneNumber;
	private String City;
	private String State;
	
	void Contact(String Name,String Age,String PhoneNumber,String City) {
		this.Name=Name;
		this.Age=Age;
		this.PhoneNumber=PhoneNumber;
		this.City=City;
		this.State=State;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return Age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		Age = age;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return PhoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return State;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}
}
