import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sample
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String input1 = br.readLine();
	    String input2 = br.readLine();
	    
	    List<String> list1 = Arrays.asList(input1.split(","));
	    List<String> list2 = Arrays.asList(input2.split(","));
	    
		Collections.sort(list1);
		Collections.sort(list2);
		
        boolean boolval = list1.equals(list2); 
         
        if(boolval == true){
            System.out.println("SAME");
        }else{
            System.out.println("NOT SAME");
        }  
	}
}