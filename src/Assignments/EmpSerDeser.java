package Assignments;

public class EmpSerDeser {
	String name;
	int age;
	long contact;
	String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString()
	{
		return "Employee[name=" + name +  ",age=" + age + ",contact=" + contact + ",designation=" + designation +"]";
		
	}

}
