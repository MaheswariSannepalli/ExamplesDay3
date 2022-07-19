package javaExamplesDay3;

class CarParts {
	   
	   private static int wheels = 4;
	   private static int seats = 4;
	   //creates only one instance
	   public static class SameFeatures{
		//   int x =0; this x can be modified in main class  using objects
	       public void wheel() {
	           System.out.println("Wheels : " + wheels);
	       }
	       public void seats() {
	           System.out.println("seats : " + seats);
	       }
	   }

	   public void colour(String colour) {
	       System.out.println("Car colour :"+colour);
	   }
}
public class InnerStatic {
	 public static void main(String[] args) {
	        CarParts.SameFeatures car1 = new CarParts.SameFeatures();
	        car1.wheel();
	        car1.seats();
	       CarParts car = new CarParts();
	       car.colour("black");
	    }
}
