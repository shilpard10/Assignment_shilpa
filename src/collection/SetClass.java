package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		//List mylist=new ArrayList();
		Set<String> myset=new HashSet<String>(); 
		myset.add("abc");
		myset.add("pqr");
		myset.add("xyz");
		myset.add("aaa");
		
		
		System.out.println(myset);
		
	    Iterator<String> itr=myset.iterator();
	    while(itr.hasNext())
	    {
	    	String name=itr.next();
	    	System.out.println(name);
	    	
	    }

	}

}
