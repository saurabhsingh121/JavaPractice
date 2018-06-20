package saurabh.JavaConcept;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String city;
	//This no-arg constructor was created to create instance of it while providing only
	//package structure name and I was testing it on saurabh.JavaConcept.ClassForNameTest Java class
	//Class.newInstance() only creates object of class when it has no-arg constructor
	public Employee() {
		
	}
	public Employee(int id, String name, int age, String city) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public String getName() {
		return name;
	}

	/*@Override
	public String toString() {
		return "This is some custom Employee [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}*/
	
	
}
