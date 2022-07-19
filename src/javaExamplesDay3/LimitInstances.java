package javaExamplesDay3;
//creating limited number of threads
class RestrictNumOfThreadInstance {
	
    public static int varCount = 0;
   // private constructor 
    private RestrictNumOfThreadInstance() 
    {
             varCount++;
             System.out.println("thread numer "+varCount+" is created");
    }
    //static method for creating instances
    public static RestrictNumOfThreadInstance getLimInstance() {

                   if(varCount <5) {
                           return new RestrictNumOfThreadInstance();
                   }
                   System.out.println("Maximum instance limit reached. You are not allowed to create anymore instances");
                   System.gc();
                   return null;
    }
   //for decreasing count
    public void finalise()
    {
    	System.out.println("Instance is deleted");
         varCount = varCount-1;
    }
 }
public class LimitInstances {
	public static void main(String[] args) {

                          RestrictNumOfThreadInstance obj;

                          int a=1;
                          while(a<=20)
                          {
                                        obj = RestrictNumOfThreadInstance.getLimInstance();
                                        a++;
                          }
           }
}
