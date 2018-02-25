import java.util.Scanner;
public class Palindrome {
    
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        String[] slovo = new String[5];
        for (int i = 0; i < 4; i++) {
            System.out.println("Введите строку");
            slovo[i] = scan.nextLine();
        }
        for (int i = 0; i < 4; i++) {    
        System.out.println(slovo[i]);
            if (isPalindrome(slovo[i]))
                System.out.println("Строка является палиндромом.");
        }
        }
    
    
    public static String reverseString(String s) {
        String k = "";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            k += s.charAt(n-i-1);
        }
        return k;
    }
    
    public static boolean isPalindrome(String s) {
        String s1 = reverseString(s);
        return s.equals(s1);
    }
    
}