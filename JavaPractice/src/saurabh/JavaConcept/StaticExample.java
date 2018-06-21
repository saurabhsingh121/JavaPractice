package saurabh.JavaConcept;

public class StaticExample {
	
	//static block
	static {
		//can be used to initialized when class is loaded
		System.out.println("StaticExample static block");
		//can access only static variables and method
		str = "Test";
		setCount(2);
	}
	
	//Multiple static block in same class
	static {
		System.out.println("StaticExample static block2");
	}
	
	//static variable example
	private static int count; //keep private to control its value through setter
	public static  String str;
	
	public int getCount() {
		return count;
	}
	
	//static method example
	public static  void setCount(int count) {
		if(count > 0) {
			StaticExample.count = count;
		}
	}
	
	//static util method
	public static int addInts(int i, int...js) {
		int sum = i;
		for(int x : js) {
			sum += x;
		}
		return sum;
	}
	
	//static class example- used for packaging convenience only
	public static class MyStaticClass{
        public int count;
        
    }
}
