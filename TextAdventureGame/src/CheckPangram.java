import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckPangram {
    void checkPangram(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string that you want to check :");
        String word=sc.next();
        Set<Character> s= new HashSet<>();
        for (int i = 0; i <word.length() ; i++) {
            s.add(word.charAt(i));
        }
        if(s.size()==26){
            System.out.println("Is Pangram ");
        }
        else {
            System.out.println("Word is not pangram ");
        }
    }

    public static void main(String[] args) {
        CheckPangram c=new CheckPangram();
        c.checkPangram();
    }
}
