
public class VowelsConsonants {

	public static void main(String[] args) {
		String str="Sandeep";
		String s=str.toLowerCase();
		char[] crr=s.toCharArray();
		int vow=0;
		int con=0;
		for(int i=0;i<crr.length;i++) {
			if(crr[i]=='a' ||crr[i]=='i'||crr[i]=='o'||crr[i]=='u'||crr[i]=='e') {
				vow++;
				
			}
			else {
				con++;
			}
		}
		System.out.println("Vowels :" +vow +" Consonatas :" +con);

	}

}
