import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public static boolean isValid(String s) {
	      boolean  flag=false;
	        for(int i=1;i<s.length();i+=2){
	        	System.out.println((int)s.charAt(i-1)+"  "+(int)s.charAt(i));
	            if(s.charAt(i)==(int)(s.charAt(i-1)+2)){
	                flag=true;

	            }
	            else{
	                flag=false;
	            }

	        }
	        return flag;
	        
	    }

	public static boolean checkPal(String s) {
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == s.charAt((s.length() - i) - 1) && i != (s.length() - i) - 1) {
				flag = true;

			} else {
				flag = false;
			}

		}
		return flag;

	}

	 public static  String longestPalindrome(String s) {
	        String res = "";
	        int resLen = 0;
	        
	        for (int i = 0; i < s.length(); i++) {
	            // Odd length palindrome
	            int l = i, r = i;
	            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
	                if (r - l + 1 > resLen) {
	                    res = s.substring(l, r + 1);
	                    resLen = r - l + 1;
	                    System.out.println(l+","+r);
	                    System.out.println(res);
	                    System.out.println(resLen);
	                  
	                }
	                l--;
	                r++;
	            }

	            // Even length palindrome
	            l = i;
	            r = i + 1;
	            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
	                if (r - l + 1 > resLen) {
	                    res = s.substring(l, r + 1);
	                    resLen = r - l + 1;
	                
	                }
	                l--;
	                r++;
	            }
	        }

	        return res;
	    }

	public static String decodeAtIndex(String s, int k) {
		int size = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				size = size * Integer.parseInt("" + ch);
			} else {
				size++;
			}

		}
		System.out.println(size);
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			k = k % size;
			if (k == 0 && !Character.isDigit(ch)) {
				return "" + ch;

			}
			if (Character.isDigit(ch)) {
				size = size / (Integer.parseInt("" + ch));

			} else {
				size--;
			}
		}

		return "";
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hs = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			List<Integer> l = new ArrayList<>();
			l.add(i);
			hs.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int rem = target - num;
			if (hs.containsKey(rem)) {
				int idx = hs.get(rem);
				// if(index==i)continue;
				return new int[] { i, idx };
			}

		}

		return new int[2];
	}

	public static void main(String[] args) {

//		System.out.println(decodeAtIndex("ab2cd2", 5));
//		System.out.println(decodeAtIndex("leet2code3", 10));
//		System.out.println(decodeAtIndex("a2b3c4d5e6f7g8h9", 9));
		// int [] n1= {2,7,11,15};
		// int [] n1= {3,2,4};
//		int [] n1= {3,3};
//		
//		System.out.println(Arrays.toString( twoSum(n1, 6)));
		//System.out.println(longestPalindrome("cbbd"));
		System.out.println(isValid("()[]{}"));
		

	}
}