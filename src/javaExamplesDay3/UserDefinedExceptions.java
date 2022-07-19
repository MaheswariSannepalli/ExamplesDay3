package javaExamplesDay3;
//for creating user defined exceptions must extend exception
class EmployeeException extends Exception
{
	private String e;
    public EmployeeException(String s)
    {
      e = s ;
    }
    public String toString()
    {
    	return e;
    }
}
class UserDefinedExceptions
{
	//throws will mention what exceptions may occur
    void empIDCheck(int EmpID) throws EmployeeException
    {
        if(EmpID<=0 || EmpID>999)
        {
        	//for checking exception
           throw new EmployeeException("Invalid Employee ID");
        }
     }
   public static void main(String args[])
   {
	  UserDefinedExceptions emp = new UserDefinedExceptions();
      try
      {
          emp.empIDCheck(0);
      }
      //if exception occurs , catch block will catch it
      catch (EmployeeException e)
      {
          System.out.println("Exception caught");
          System.out.println(e);
      }
    }
}