package aggregation_assignment;

public class Address {
	 String city;
	 String state;
	 String country;
	 Student ref;
	public Address(String city,String state,String country,Student ref) {
		
		this.city = city;
        this.state = state;
        this.country = country;
        this.ref = ref;
		
	}
	
	public void display() {
		
		System.out.println("Student name: " + ref.name);
		System.out.println("Student roll num: " + ref.rollNumber);
		System.out.println("Address : "+city+","+state+","+country);
	}

	public static void main(String[] args) {
		
      Student obj1 = new Student("Dimiya",34);
      Address obj2 = new Address("Trivandrum","Kerala","India", obj1);
      obj2.display();
	}

}
