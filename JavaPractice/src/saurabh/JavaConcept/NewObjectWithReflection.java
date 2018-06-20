package saurabh.JavaConcept;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewObjectWithReflection {
	
	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException{
		//Normal object creation
		Employee emp = new Employee();
		emp.doSomething();
		//Use of Class.newInstance()
		// But the limitation is Class.newInstance() can only invoke the no-arg constructor,
		//So, specify no-arg constructor explicitly if arg constructors are there
		Class clsz = Class.forName("saurabh.JavaConcept.Employee");
		Employee employee = (Employee)clsz.newInstance();
		employee.doSomething();
		//Use of Constructor.newInstance()
		//Constructor.newInstance() can invoke any constructor, regardless of the number of parameters.
		Constructor<Person> constructor = Person.class.getConstructor();
		Person person = constructor.newInstance();
		person.doSomething();
		System.out.println(person.toString());
		
	}
	
}
