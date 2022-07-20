package javaExamplesDay3;

class encrypt{
	private int x=9;
	private class B{
		int encryptCode(int y)
		{
			return x+y ;
		}
	}
	int encryptRequest(int y)
	{
	   B b = new B();
	  return b.encryptCode(y);
	}
}
public class MemberInnerClass2{  
	 
	 public static void main(String args[])
	 {  
		encrypt obj = new encrypt();
		 System.out.println("encrypted msg: "+obj.encryptRequest(6));
	 }  
}  