package Assignments;

public class Manager extends Employee
{
double sal;

Manager(String Empno, String Empname, double salary)
{
	super(Empno,Empname);
	this.sal=salary;
	
	//System.out.println("Manager info is " +Empno+ ", " +Empname+ ", "+salary);
	System.out.println("Manager info is " +Empno+ ", " +Empname+ ", "+salary);
	
}


}
