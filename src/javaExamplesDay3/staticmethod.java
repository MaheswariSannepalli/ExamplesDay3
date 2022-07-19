package javaExamplesDay3;
//static methods can only access static variables of the class and modify it
//can declare static methods with the same signature but it is not considered overriding as there won’t be any run-time polymorphism
//can be overloaded if difference is not only the static access modifier
class Student{
    int rollno;
    String name;
    static String college = "PEC";
    static int college_id=156;
    
    Student(int r, String n){
        rollno = r;
        name = n;
        }
    static void changecollege(String collegeName)
    {
     college = collegeName;
     System.out.println("base class");
    }
    static void changecollege(int collegeId)
    {
     college_id = collegeId;
     System.out.println("base class");
    }
    void display()
    { 
    	System.out.println(rollno+" "+name+" "+college);
        System.out.println("base class");
     }
}
//this class is just for understanding overriding of super methods
class derivedclass extends Student{
	
	derivedclass(int r, String n)
	{
		super(r,n);
	}
	static void changecollege(String collegeName)
    {
     college = collegeName;
     System.out.println("derived class instance");
    }
	 void display()
	    { 
	    	System.out.println(rollno+" "+name+" "+college);
	        System.out.println("derived class instance");
	     }
}
public class staticmethod{
   public static void main(String args[])
   {
   Student s1 = new Student(111,"Maheswari");
   Student s2 = new Student(222,"Sree");
   s1.display();
   s2.display();
   Student.changecollege("PTU");
   Student.changecollege(222);
   //calling display method
   s1.display();
   s2.display();

   Student s3 = new derivedclass(333,"mahi");
   //calls the base class method because no run time polymorphism for static methods
   Student.changecollege(333);
   //run time polymorphism happens
   s3.display();
   }
}
