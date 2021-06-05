package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filHandlingEx {

	public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("C:\\Users\\Brillent\\file.txt");
	BufferedReader reader=new BufferedReader(fr);
	String line=null;
	
	while((line=reader.readLine())!=null)
	{
		System.out.println(line);
	}
	reader.close();

	}

}
