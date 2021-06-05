package serializztionDeserialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationDeserialization {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper=new ObjectMapper();
		Employee e=new Employee();
		e.setAge(10);
		e.setName("abc");
		
		String empjason=mapper.writeValueAsString(e);
		Employee emp=mapper.readValue(new File("C:\\Users\\Brillent\\eclipse-workspace_APITesting\\APIPractice\\Input\\Emp.json"),Employee.class);
		System.out.println(emp);
	}

}
