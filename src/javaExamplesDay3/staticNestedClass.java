//can access private members and static members of outer class
package javaExamplesDay3;

class EmpDetails{
	
	String name;
	int id ;
	
	static String c_name ;
	static int c_id;
	static String c_city ;
	
	EmpDetails(String name,int id)
	{
		this.name = name ;
		this.id = id;
	}
	//same instance for everyone
	static class Company{
		void CompanyDetails(String name , int id,String city)
		{
			c_name =name;
			c_id = id;
			c_city = city ;
		}
	}
	void displayDetails()
	{
		System.out.println("name : "+name+"c name"+c_name);
	}
}
public class staticNestedClass {

	 public static void main(String args[])
	 {
		 EmpDetails.Company address = new EmpDetails.Company();
		 address.CompanyDetails("xyz",333355,"chennai");
		 
		 EmpDetails emp = new EmpDetails("mahi",877);
		 EmpDetails emp2= new EmpDetails("sree",977);

		 emp.displayDetails();
		 emp2.displayDetails();
		 
		 
	 }
}
