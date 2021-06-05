package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment_19 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);list.add(30);list.add(40);list.add(10);
		list.add(40);list.add(10);list.add(40);list.add(50);
		list.add(50);
		System.out.println("List of elements " + list);

		Set<Integer> uniqueset = new HashSet<Integer>(list);
		for (Integer i : uniqueset) {
			int freq = Collections.frequency(list, i);
			System.out.println("Frequency of " + i + " : " + freq);
		}

	}

}
