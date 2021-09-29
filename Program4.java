package lab13;

import java.util.TreeSet;

public class Program4 {

	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		   
	    //add elements to TreeSet
	    t1.add("91");
	    t1.add("36");
	    t1.add("24");
	    t1.add("50");
	    t1.add("40");
	   
	    /*
	      To get the lowest value currently stored in Java TreeSet use,
	      Object first() method of TreeSet class.*/
	   
	    System.out.println("Lowest value Stored in Java TreeSet is : " + t1.first());
	   
	    
	   
	    System.out.println("Highest value Stored in Java TreeSet is : " + t1.last());
	 

	}

}
