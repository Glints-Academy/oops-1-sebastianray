package Person;

public class Person {
	private String name;
	private String address;

	// Constructor
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String toString() {
		return name + "(" + address + ")";
	}

	public void introduce() {
		System.out.println("Hello my name is " + name + ". I live in " + address);
	}
}
