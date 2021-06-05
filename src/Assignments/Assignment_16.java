package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment_16 {
	static int count = 0;

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		System.out.println(list1);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(30);
		list2.add(20);
		list2.add(50);
		list2.add(40);
		list2.add(10);
		System.out.println(list2);

		for (int i = 0; i < list1.size(); i++) {
			if (list2.contains(list1.get(i))) {
				count++;
				}
			}
		if (count == list1.size()) {
			System.out.println("Lists are equal");
		}
		else
			System.out.println("Lists are not equal");
	}
}