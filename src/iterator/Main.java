package iterator;

import java.util.ArrayList;
import java.util.Iterator;
 
public class Main 
{
	private final static int canIterate = 1;
	
	public static void main(String args[])
	{
    ArrayList<String> names = new ArrayList<String>();
    names.add("Bob");
    names.add("Icecream");
    names.add("Spørsmåltegn");
    names.add("Jack");
 
    Iterator<String> it = names.iterator();
    	while(it.hasNext()) 
    	{
    		String obj = (String)it.next();
    		//System.out.println(obj);
    		
    		if ((obj.length() > 4) && (canIterate == 1))
    		{
    			it.remove();
    		}
    		else
    		{
    			System.out.println("Object: " + obj);	
    		}
    	}
	}
}