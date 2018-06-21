package saurabh.JavaConcept;

//Reference:- https://www.journaldev.com/1365/static-keyword-in-java
public class TestStatic {
	public static void main(String[] args) {
		StaticExample.setCount(5);
		
		//non-private static varible can be accessed with class name
		StaticExample.str = "abc";
		StaticExample se = new StaticExample();
		System.out.println(se.getCount());
		//class and instance static variables are same
        System.out.println(StaticExample.str +" is same as "+se.str);// both will be "abc"
        System.out.println(StaticExample.str == se.str); // true - change in the value
        
        //static nested classes are like normal top-level classes
        StaticExample.MyStaticClass myStaticClass = new StaticExample.MyStaticClass();
        myStaticClass.count=10;
        
        StaticExample.MyStaticClass myStaticClass1 = new StaticExample.MyStaticClass();
        myStaticClass1.count=20;
        
        System.out.println(myStaticClass.count);
        System.out.println(myStaticClass1.count);
	}
}
