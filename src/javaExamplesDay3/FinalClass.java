package javaExamplesDay3;
//can't inherit and creates immutable class
final class login{
	//should be private , else can be seen using object
	//it should be declared final otherwise it maybe changed
	// int x =1;
	private final int password = 12345;
	void passwordCheck(int password)
	{
		if(password == this.password)
		{
			showCode();
		}
	}
	private void showCode()
	{
		System.out.println("your secret code is : 6425");
	}
}
public class FinalClass {
	public static void main(String[] args)
	{
		login obj = new login();
		obj.passwordCheck(12345);
		// obj.x=9;
	}
}
