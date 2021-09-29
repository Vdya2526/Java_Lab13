package lab13;

import java.util.TreeSet;

public class Program5 {

	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		   
	    //add elements to TreeSet
	    t1.add(91);
	    t1.add(22);
	    t1.add(23);
	    t1.add(24);
	    t1.add(25);
	    Integer[] intArray = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
	    
	    intArray = (Integer[]) t1.toArray(intArray);
	     //6” is set to null to mark the end of the TreeSet elements
	    //iterate the array
	    for(Integer number : intArray){
	        System.out.println( number );
	   
	}

}}
