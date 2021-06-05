package stringHandling;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome";
		String s2="Hello how are you";
		String s3="Bad Luck";
		
		System.out.println(s1.charAt(2));//l
		System.out.println(s1.indexOf("l"));//2
		System.out.println(s2.contains("are"));//true
		System.out.println(s1.length());//7
		System.out.println(s2.substring(6));//how are you
		System.out.println(s2.substring(7,9));//ow
		System.out.println(s1.startsWith("We"));//true
		System.out.println(s1.endsWith("hello"));//false
		System.out.println(s3.replace("Bad", "Good"));//Good Luck
		System.out.println(s1.toUpperCase());//WELCOME
		System.out.println(s1.toLowerCase());//welcome
		

	}

}
