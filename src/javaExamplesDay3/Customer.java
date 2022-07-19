package javaExamplesDay3;

class GoldPrice{
	//fixed , cannot change. 
	//variable must be initialized while declaration or in constructor
	//As it is static only one instance created , saves memory . static final can only be initialized while declaration or in static blocks
	static final int pricePerGram = 8000;
	public void price(int weight)
	{
		int totalprice = weight*pricePerGram ;
		System.out.println("Price is : "+totalprice);
	}
}
public class Customer {

	public static void main(String[] args)
	{
		GoldPrice p1 = new GoldPrice();
		p1.price(8);
	}
}
