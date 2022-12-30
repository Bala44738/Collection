package list.ArrayList;

//req:-
//----
/*dont take size
enter the name 
store every name inside the arraylist by avoiding the duplicates
if name value is "END" then stop taking the input
finally print all names
*/



import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAvoidDuplicates {

	public static void main(String[] args) {
		
		   
                   
		  
		    ArrayList<String> al = new ArrayList<String>();    
		    
		    while(true) {   //You don't know size then using "while loop"
		    	
		    	  Scanner sc = new Scanner(System.in);
				    System.out.println("Enter the name");
				       String str = sc.next();    //Whatever input you will given it will be stored in str
				       
				       if("END".equalsIgnoreCase(str)) {
				    	   break;
				    	   
				       }
				       
				       if(!al.contains(str)) {   //Given input is not match already stored in str data it willbe add in str
				    	   al.add(str);
				       }
				
		    	
		    }
		    System.out.println("******Read all******");
		    
		    for(String str1:al) {
		    	System.out.println(str1);
		    }
		
		
	}

}
