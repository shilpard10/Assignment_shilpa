package Assignments;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerilznDserilzn {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper=new ObjectMapper();
		//serializatioin
		EmpSerDeser emp=new EmpSerDeser();
		emp.setName("abc");
		emp.setAge(22);
		emp.setContact(1245789854);
		emp.setDesignation("Engineer");
		
		
		String empjson=mapper.writeValueAsString(emp);
		System.out.println(empjson);
		//deserialization
		EmpSerDeser e=mapper.readValue(new File("C:\\Users\\Brillent\\eclipse-workspace_APITesting\\APIPractice\\Input\\Employee.json"), EmpSerDeser.class);
		System.out.println(e);

	}

}
