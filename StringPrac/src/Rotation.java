

public class Rotation {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "dbac";
		int cnt = 0;
		char[] crr = s1.toCharArray();

		if (s1.length() == s2.length()) {
			for (char c : crr) {
				if (s2.indexOf(c) == -1) {
					cnt++;

				}

			}

		}
		if(cnt>0) {
			System.out.println("not rotation");
		}
		else
			System.out.println(" rotation");

	}

}
