package javaExamplesDay3;

class Personalmessages{
	 String name;
	StringBuffer msg =new StringBuffer();
	
	Personalmessages(String name,String message)
	{
		this.name = name;
		msg.append(message);
		}
	void additionalMsg(String message)
	{
		msg.append(message);
	}
	void changename(String newname)
	{
		name = newname;
	}
	void show()
	{
		System.out.println("name is : "+name+" message : "+msg);
	}
}
public class Stringbuffer {

	public static void main(String[] args) {
		Personalmessages u1 = new  Personalmessages("mahi","you are doing great. ");
		u1.additionalMsg("It will be fine");
		u1.show();
		Personalmessages u2 = new Personalmessages("mahi"," do well ");
		u2.show();
		u2.changename("maheswari");
		u2.show();
		u1.show();
	}
}
