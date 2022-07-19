//IOException
package javaExamplesDay3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class checkedException {

   public static void main(String args[]) {		
      File file = new File("C://New.txt");
      try {
      FileReader fr = new FileReader(file); 
      }catch (IOException e){
	   e.printStackTrace();
	   }
   }
}