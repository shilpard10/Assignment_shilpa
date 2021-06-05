package Assignments;

public class Assignment_10 {

	public static void main(String[] args) {
		String value = "abaaabbbbababababababbaab";
		String strsearch = "ab";
		int count = 0;

		for (int i = 0; i < value.length(); i++) {
			for (int j = i + 1; j <= value.length(); j++) {
				String t = value.substring(i, j);
				//System.out.println(t);
				if (t.equals(strsearch))
					count = count + 1;
			}
		}
			if (count == 0) {
				System.out.println("Substring not found");
			} else
				System.out.println("Frequency of substring is " + count);
	}

}
