package lab13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Program1 {

	public static void main(String[] args) {
		
		    
		       
		        Set<String> h1 = new HashSet<String>();
		
		 
		        // Adding elements to the Set
		        // using add() method
		        h1.add("one");
		        h1.add("two");
		        h1.add("three");
		        h1.add("four");
		        // Printing elements of HashSet object
		        System.out.println(h1);
		       
		        Iterator<String> i=h1.iterator();  
		           while(i.hasNext())  
		           {  
		           System.out.println(i.next());  
		           }  
		    }
	}


