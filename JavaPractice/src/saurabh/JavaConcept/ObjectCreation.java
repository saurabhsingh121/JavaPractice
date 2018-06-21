package saurabh.JavaConcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

//Reference:-  https://programmingmitra.blogspot.com/2016/05/different-ways-to-create-objects-in-java-with-example.html
public class ObjectCreation {
	
	public static void main(String[] args) throws Exception{
		//By using new keyword
		Student stu1 = new Student();
		stu1.setName("Saurabh");
		
        System.out.println(stu1 + ", hashcode : " + stu1.hashCode());
        
        //By using class's newInstance() method
        Student stu2 = (Student) Class.forName("saurabh.JavaConcept.Student").newInstance();
        //or we can apply to do this
        //Student stu2 = Student.class.newInstance();
        stu2.setName("Golu");
        System.out.println(stu2 + ", hashcode : " + stu2.hashCode());
        
        //By using constructor's newInstance()	method
        Constructor<Student> constructor = Student.class.getConstructor();
        Student stu3 = constructor.newInstance();
        stu3.setName("Guru");
        System.out.println(stu3 + ", hashcode : " + stu3.hashCode());
        
        //By using clone() method
        Student stu4 = (Student)stu3.clone();
        stu4.setName("Maratha"); //When we comment it, stu4 has copy of st3 object
        System.out.println(stu4 + ", hashcode : " + stu4.hashCode());
        
        //By using serialization
        
        //Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
        out.writeObject(stu4);
        out.close();
        
        //Deserialization
        //In deserialization JVM don't need constructor to create an object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
        Student stu5 = (Student) in.readObject();
        stu5.setName("Macha");
        System.out.println(stu5 + ", hashcode : " + stu5.hashCode());
        
        

	}
}
