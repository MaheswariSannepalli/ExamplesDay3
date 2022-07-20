package javaExamplesDay3;

public class singletonClass {

	   private static singletonClass obj=null;
	   String s;
	   String name;
	   //for preventing multiple instances to create
	   private singletonClass()
	   {
           s="you got access";
	   }
	   public static singletonClass testObject()
	   {
	           // one object is created at a time
	           if(obj==null)
	           {
	                obj= new singletonClass();
	           }
	     return obj;
	   }
	   public void enterName(String name)
	   {
		   //here we will store name , after that we use same instance for creating another name
		   this.name = name;
	        System.out.println("name stored "+name);
	   }

	   public static void main(String args[])
	   {
		   singletonClass newInstance= singletonClass.testObject();
		   newInstance.enterName("mahi");
		   singletonClass newInstance2= singletonClass.testObject();
		   newInstance2.enterName("sree");
	   }
	}