//unchecked exceptions
package javaExamplesDay3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class unCheckedException {

	  public static void main(String args[]) {
		
		  int[] marks = new int[4];
		  Scanner scan = new Scanner(System.in);
		  try {
		 for(int i=0;i<=4;i++)
		 {
			 System.out.println("enter your marks");
			 marks[i] = scan.nextInt();
		 }
		  }catch(InputMismatchException e)
		  {
			  e.printStackTrace();
		  }
		  catch(ArrayIndexOutOfBoundsException e)
		  {
			  e.printStackTrace();
		  }
		  scan.close();
	  }
}
