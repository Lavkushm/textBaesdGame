import java.util.Scanner;

public class ReverseString {
    void reverseString(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string that you want to reverse :");
        String word=sc.next();
        StringBuilder sb = new StringBuilder(word);
        String wod=sb.reverse().toString();
        System.out.println("Reverse string :"+wod);
    }

    public static void main(String[] args) {
        ReverseString c=new ReverseString();
        c.reverseString();
    }
}
