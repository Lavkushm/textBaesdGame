import java.util.Scanner;

public class WordCount {
    void wordCount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence that you want to count:");
        String word=sc.nextLine();
        String[] words = word.split("\\s+");  // Split the sentence on any number of white space characters
        int wordCount = words.length;
        System.out.println("Word length is :"+wordCount);
    }

    public static void main(String[] args) {
        WordCount c= new WordCount();
        c.wordCount();
    }
}
