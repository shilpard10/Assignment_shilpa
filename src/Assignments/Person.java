package Assignments;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Person {

	String name;
	long contact;
	String address;
	int age;
	String country;
	int empid;
	String salary;
	String height;
	String weight;
	static String[] value;
	static int[] agevalue;

	public static void main(String[] args) throws IOException {
		Person p = new Person();
		FileReader fr = new FileReader(
				"C:\\Users\\Brillent\\eclipse-workspace_APITesting\\APIPractice\\src\\Person.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = null;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
			if (line.contains("name")) {
				value = line.split(":");
				p.name = value[1];

			}
//			if (line.contains("contact")) {
//				String[] cntvalue = line.split(":");
//				long cont=Long.parseLong(cntvalue[1].trim());
//				p.contact = cont;
//			}

			if (line.contains("address")) {
				value = line.split(":");
				p.address = value[1];
			}
			if (line.contains("age")) {
				String agenumber[]=line.split(":");
				int agevalue = Integer.parseInt(agenumber[1].trim());
				
				p.age = agevalue;
			}
			if (line.contains("country")) {
				value = line.split(":");
				p.country = value[1];
			}
			if (line.contains("Empid")) {
				String empval[] = line.split(":");
				int empvalue=Integer.parseInt(empval[1].trim());
				p.empid = empvalue;
			}
			if (line.contains("salary")) {
				String salval[] = line.split(":");
				p.salary = value[1];
			}
			if (line.contains("height")) {
				value = line.split(":");
				p.height = value[1];
			}
			if (line.contains("weight")) {
				value = line.split(":");
				p.weight = value[1];
			}

		}
		System.out.println("name is " + p.name);
		System.out.println("contact is " + p.contact);
		System.out.println("address is " + p.address);
		System.out.println("age is " + p.age);
		System.out.println("country is " + p.country);
		System.out.println("emp id is " + p.empid);
		System.out.println("salary s " + p.salary);
		System.out.println("height is " + p.height);
		System.out.println("weight is " + p.weight);
	}

}
