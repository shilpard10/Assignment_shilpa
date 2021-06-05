package collection;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		//List mylist=new ArrayList();
		List<Integer> mylist=new ArrayList<Integer>(); 
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		
		//mylist.add("s");
		//mylist.add(30.10);
		//mylist.add("Shilpa");
		//add, remove, set, contains, isEmpty
		System.out.println(mylist);
		System.out.println(mylist.get(0));
		
		for(int i=0;i<mylist.size();i++)
		{
			int value=mylist.get(i);
			System.out.println(value);
		}

	}

}
