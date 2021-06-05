package Assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmployeeDir extends EmployeeDirectory  {
	int empid;
	String empname;
	String dept;
	int age;
	double salary;

	static List<EmployeeDir> emplist =new ArrayList<EmployeeDir>();
	
	public EmployeeDir(int empid, String empname, String dept, int age, double salary) {
		this.empid=empid;
		this.empname=empname;
		this.dept=dept;
		this.salary=salary;
	}

	public static void main(String[] args) {
		EmployeeDir e1=new EmployeeDir(101,"Shilpa","CS",30,100000 );
		EmployeeDir e2=new EmployeeDir(102,"Shamika","Admin",22,200000);
		
		emplist.add(e1);
		emplist.add(e2);
		System.out.println(emplist.get(0).empid + emplist.get(0).empname);

	}

}
