public class Palindrome {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
		String s = args[i];
		System.out.println(s + " is " + (isPalindrome(s) ? "" : "not ") +  "a palindrome");
        }
    }

  
    public static String reverseString(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}