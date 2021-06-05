package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class filHandlingReadWrite {

	public static void main(String[] args) throws IOException {
	/*FileReader fr=new FileReader("C:\\Users\\Brillent\\file.txt");
	BufferedReader reader=new BufferedReader(fr);
	
	FileWriter fw=new FileWriter("C:\\Users\\Brillent\\fileReadWrite.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	
	String line=null;
	
	/*bw.write("Hi how are you");
	bw.newLine();
	bw.write("hello");
	
	while((line=reader.readLine())!=null)
	{
		System.out.println(line);
		bw.write(line);
		//bw.write("\n");
		bw.newLine();
		bw.append("abc");
		bw.flush();
	
	}
	reader.close();
	bw.close();
*/
	
	
	InputStreamReader fis=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(fis);
	System.out.println("Enter name");
	String name=br.readLine();
	System.out.println(name);
	System.out.println("Enter id");
	String id=br.readLine();
	System.out.println(id);
	
	Scanner scan=new Scanner(System.in);
	scan.nextLine();
	

	}
}
