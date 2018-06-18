package saurabh.JavaConcept;

import java.util.Scanner;

public class ClassForNameTest {
	
	public static void main(String[] args) {
		//Scanning the whole class name with package structure
		Scanner scan = new Scanner(System.in);
		System.out.println("Class Name with package structure");
		String someClassName = scan.nextLine();
		try {
			Class clasz = Class.forName(someClassName);
			Object obj = clasz.newInstance();
			System.out.println(obj.toString());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
}
