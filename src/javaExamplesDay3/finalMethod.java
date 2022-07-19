package javaExamplesDay3;

class A{
	int x;
	//inherited but can't override follows same implementation throughout all derived classes
	final void method()
	{
		//y cannot be changed , method scope
		int y= 10;		
		x=x+y ;
		 System.out.println("x in final method "+x);
	}
}
class B extends A{
	
	void method2()
	{
		System.out.println("x in child class "+x);
		x = 20;
		System.out.println("x in child class "+x);
	}
	void m()
	{
		 System.out.println("x value "+x);
	}
}
public class finalMethod {

	 public static void main(String args[])
	 {
		 B obj2 = new B();
		 obj2.method();
		 obj2.method2();
		 obj2.m();
		 obj2.x = 30;
		
	 }
}
