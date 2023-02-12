import java.util.Scanner;

public class StringPalindromeOrNot {
    void isPalindrome(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string that you want to check :");
        String word=sc.next();
        String clean = word.toLowerCase().replaceAll("[^a-z0-9]", "");
        if(clean.equals(word)){
            System.out.println("String is palindrome ");
        }
        else {
            System.out.println("String is not palindrome ");
        }
    }

    public static void main(String[] args) {
        StringPalindromeOrNot c= new StringPalindromeOrNot();
        c.isPalindrome();

    }
}
