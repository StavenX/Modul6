package hashset;

import java.util.HashSet;

public class Main 
{
	public static void main (String[] args)
	{
		// Initializing hashset
		HashSet<String> myHashSet =
				new HashSet<String>();
		
		// Adding elements to the HashSet
		myHashSet.add("Apple");
		myHashSet.add("Mango");
		myHashSet.add("Grapes");
		myHashSet.add("Orange");
		myHashSet.add("Fig");
		
		//Addition of duplicate elements
		myHashSet.add("Apple");
		myHashSet.add("Mango");
		
		//Addition of null values
		myHashSet.add(null);
		myHashSet.add(null);
		
		//Displaying HashSet elements
		System.out.println(myHashSet);
	}
}
