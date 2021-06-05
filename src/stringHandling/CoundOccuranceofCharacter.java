package stringHandling;

import java.util.Scanner;

public class CoundOccuranceofCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		char ch,c;
		int count=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		s=scan.next();
		System.out.println("Enter the character");
		ch=scan.next().charAt(0);
		/*scan.close();
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			if(ch==c)
			{
				count++;
			}
		}*/
		
		char arr[]=s.toCharArray();
		for(char r:arr)
		{
			if(r==ch)
			{
				count++;
			}
		}
		System.out.println(ch +" occurs " +count+" times in "+s);
		

	}

}
