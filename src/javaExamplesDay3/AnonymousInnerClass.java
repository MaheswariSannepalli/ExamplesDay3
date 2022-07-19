//can make instances with extras such as overriding without creation of actual subclass
//can access methods and final variables of enclosing scope
//can create new methods
package javaExamplesDay3;

class EmployeeDetails{
	 String comapanyName="xyz";
	String name;
	int id;
	 EmployeeDetails(String name,int id)
	{
		this.name= name;
		this.id = id ;
	}
	 void displayDetails()
	 {
		 System.out.println("comapanyName : "+comapanyName+"name : "+name+"id : "+id);
	 }
}
public class AnonymousInnerClass {

	 public static void main(String args[]) {
		 EmployeeDetails emp1 = new  EmployeeDetails("mahi",121);
		 emp1.displayDetails();
		 EmployeeDetails head = new  EmployeeDetails("sree",245)
		 {
			 void displayDetails()
			 {
				 System.out.println("name : "+name+"id : "+id);
			 }
		 };
		head.displayDetails();
	 }
}
