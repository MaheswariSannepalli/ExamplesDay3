package javaExamplesDay3;

class personDetails{
	String name;
	//blank final variable , must be initialize in constructor
	final int pan;
	personDetails(String name,int pan)
	{
		this.pan = pan;
		this.name = name;
	}
}
public class Person {

	public static void main(String[] args)
	{
		personDetails p1 = new personDetails("Maheswari",765381);
		personDetails p2 = new personDetails("Mahi",765381);
	}
}
