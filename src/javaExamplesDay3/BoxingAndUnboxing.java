package javaExamplesDay3;
import java.util.ArrayList;

class calculateAverage{
	ArrayList<Integer> marks;
	String name;
	calculateAverage(ArrayList<Integer> marks , String name)
	{
		this.marks= marks ;
		this.name = name;
	}
	 int count = 3;
	 int total=0;
	 float average ;
	 Integer TotalAverage =100;
	void average()
	{
		 for(int m : marks)
		 {
			 //unboxing
			 total=total +m;
		 }
		 //implicit typecasting
		 average = total/count ;
	}
	void compare( )
	{
		//if average is also object , no unboxing occurs
		if(average == TotalAverage)
		{
			System.out.println("s grade");
		}
	}
	//overriding toString method of wrapper class to print in required format
	public String toString()
	{
		return "name : "+name+" average :"+average ;
	}
}
public class BoxingAndUnboxing {

	 public static void main(String[] args)
	 {
		 ArrayList <Integer> marks = new ArrayList<Integer>() ;
		 // autoboxing - converting int to Integer
		 marks.add(100);
		 marks.add(100);
		 marks.add(100);
		 
		 calculateAverage student = new calculateAverage(marks,"mahi");
		 student.average();
		 System.out.println(student);
		 student.compare();
	 }
}
