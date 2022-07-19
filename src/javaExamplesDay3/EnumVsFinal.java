package javaExamplesDay3;

class Fit {
	   public static final String SMALL = "S";
	   public static final String MEDIUM = "M";
	   public static final String LARGE = "L";
}
enum FitEnum {   
	SMALL("S"), MEDIUM("M"),LARGE("L");
	
	 private final String fit;      
	 FitEnum(String fit) 
	 {   
	      this.fit = fit;
	 } 
	  String getFit() 
	  {            
	      return fit;
	  }
}
class display{
	final String Small = Fit.SMALL;
	final String Medium = Fit.MEDIUM;
	final String Large = Fit.LARGE;
	//informative
	void enumdisplay()
	{
		for (FitEnum fit : FitEnum.values())  
		{
			System.out.println(fit.getFit()+" represents "+fit);   
		 }
	}
	void finaldisplay()
	{
		System.out.println(Small);
		System.out.println(Medium);
		System.out.println(Large);
	}
}
public class EnumVsFinal {

	public static void main(String[] args)
	{
		//not type safe , XS not exists in given values
		final String userSelectedFit = "XS" ;  // Fit.MEDIUM
		String userSelectedFit2 = FitEnum.MEDIUM.getFit() ;
		
		System.out.println("Selected fit by final variables : "+userSelectedFit);
		System.out.println("Selected fit by enum : "+userSelectedFit2);
		
		display obj = new display();
		obj.enumdisplay();
		obj.finaldisplay();
	}
}
