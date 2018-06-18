package saurabh.JavaConcept;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class EmployeeTest {
	public static void main(String[] args) {
		/*Employee[]	empArray = new Employee[4];
		empArray[0] = new Employee(101, "Saurabh", 25, "Ballia");
		empArray[1] = new Employee(102, "Manas", 21, "Delhi");
		empArray[2] = new Employee(103, "Jayant", 23, "Raipur");
		empArray[3] = new Employee(104, "Rakesh", 28, "Lucknow");
			//Code for some random employee
		Random random = new Random();
		int index = random.nextInt(empArray.length);
		System.out.println(empArray[index]);
		for(int i = 0; i < empArray.length; i++) {
			System.out.println(empArray[i].getName());
		}
		
		List<Employee> ls = Arrays.asList(empArray);
		for (Employee employee : ls) {
			System.out.println(employee.getName());
			
		}*/
		
		/*Random random = new Random();
		Integer[] intArray = new Integer[100];
		for(int i = 0; i < 100; i++) {
			int number = random.nextInt(1000);
			intArray[i] = number;
		}
		for (int i : intArray) {
			System.out.print(i+" ");
		}
		System.out.println();
		List<Integer> intList = Arrays.asList(intArray);
		for (Integer is : intList) {
			System.out.print(is+" ");
		}
		System.out.println();
		for(int i=0; i < 100; i++) {
			System.out.print(intList.get(i)+" ");
		}*/
		String str = "A last-minute intervention by External Affairs Minister Sushma Swaraj was responsible for ensuring that Prime Minister Narendra Modi did not sign a key agreement on taking back illegal immigrants when he visited the U.K. in April, senior officials in New Delhi and London confirmed to The Hindu.";
		char[] strArray = str.toCharArray();
		Character[] charArray = new Character[str.length()];
		for(int i = 0; i < str.length();i++) {
			charArray[i] = strArray[i];
		}
		System.out.println();
		for (Character i : charArray) {
			System.out.print(i);
		}
		System.out.println();
		List<Character> intList = Arrays.asList(charArray);
		for (Character is : intList) {
			System.out.print(is);
		}
		System.out.println();
		for(int i=0; i < str.length(); i++) {
			System.out.print(intList.get(i));
		}
		
	}
}
