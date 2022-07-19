//can't instantiate outside block
//can access members and varaibles of outer scope
//can be abstract or final and can extend abstract or implement  interface
package javaExamplesDay3;

class GoldPricee
{
	void getPrice(int Weight)
	{
		int weight = Weight ; 
		class Inner
		{
			public int discount = 10 ;
			public int price = 8000 ;
			
			private int getdiscount()
			{
				return (price*weight*discount)/100 ;
			}
			private int getPrice()
			{
				return weight*price - (weight*price*discount)/100 ;
			}
		}
		//instantiating inside method
		    Inner inner = new Inner();
	        System.out.println("Discount = "+ inner.getdiscount());
	        System.out.println("price = " + inner.getPrice());
	}
}
public class localInnerClass
{
	    public static void main(String[] args)
	    {
	    	GoldPricee g1 = new GoldPricee();
	        g1.getPrice(8);
	    }
}