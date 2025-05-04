package DSA;

public class Palindrome {
    static String s = "MADAM";
    static int n = s.length();

    static boolean isPalindrome(int i) {
        if (i >= n / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return isPalindrome(i + 1);
    }

    public static void main(String[] args) {
        if (isPalindrome(0)) {
            System.out.println("a palindrome.");
        } else {
            System.out.println("not a palindrome.");
        }
    }
}

