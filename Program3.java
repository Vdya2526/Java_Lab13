package lab13;

import java.util.LinkedHashSet;

public class Program3 {

	public static void main(String[] args) {
		LinkedHashSet<String> l1
        = new LinkedHashSet<String>();

   l1.add("red");
    l1.add("green");
   l1.add("blue");

    /*
     * To check if the LinkedHashSet contains the
     * element, use the contains method.
     */

    // this will return true as the "red" element exists
    System.out.println(l1.contains("red"));

    // this will return true as the "white" element does
    // not exists
    System.out.println(l1.contains("white"));

	}

}
