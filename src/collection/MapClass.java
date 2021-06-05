package collection;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		Map<String, String> mymap=new HashMap<>();
		mymap.put("name","abc");
		System.out.println(mymap);
		mymap.get("name");
		

	}

}
