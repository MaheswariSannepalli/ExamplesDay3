package javaExamplesDay3;

class factorial
{
	 int  fact (int n)
	{
		 if(n==0) {
			 return 1;
		}
		 else {
			
			 System.out.println(n);
				return  n* fact(n-1);
		 }
	}
}
public class StackoverFlow {

	public static void main(String[] args) {
		factorial o = new factorial();
		System.out.println("fact is:"+o.fact(65858));
	}
}
