package Assignments;

//Number of words, number of lines, count of word java, print the lines which has java word.
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assgnment13_StringFileHandling {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(
				"C:\\Users\\Brillent\\eclipse-workspace_APITesting\\APIPractice\\src\\StringFile.txt");
		BufferedReader reader = new BufferedReader(fr);
		String line = null;
		String array[] = null;
		int linecount = 0;
		int wordcount = 0;
		int javacount = 0;

		while ((line = reader.readLine()) != null) {
			linecount++;
			if (line.contains("Java")) {
				System.out.println(line);
			}
			String[] arr = line.split(" ");
			wordcount = wordcount + arr.length;

			for (String a : arr) {
				if (a.equalsIgnoreCase("Java")) {
					javacount++;
				}
			}
		}
		System.out.println("Total number of lines are " + linecount);
		System.out.println("Total number of words are " + wordcount);
		System.out.println("Total number of java words are " + javacount);
	}
}
