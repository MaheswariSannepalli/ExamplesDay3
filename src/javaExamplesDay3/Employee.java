//Static variables
package javaExamplesDay3;

class Details{
	//initialized only once 
	static int id = 0 ;
	String name = "Null";
	String department = "Null";
	
	Details(){
		id = id + 1 ;
	}
	
	public void FillingDetails(String name,String department)
	{
		this.name = name;
		this.department = department ;
	}
	public void showDetails()
	{
	   System.out.println("ID : "+id);
	   System.out.println("name : "+name);
	   System.out.println("department : "+department);
	}
}
public class Employee {

	public static void main(String[] args)
	{
		Details emp1 = new Details();
		emp1.FillingDetails("Maheswari", "Appx");
		emp1.showDetails();
		
		Details emp2 = new Details();
		//Everything will be default except id , because it's static 
		emp2.showDetails();
	}
}
