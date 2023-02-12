import java.util.Scanner;

public class TopicProblemOption {
    int  tpo(){
        Scanner sc= new Scanner(System.in);
       int inputOutOfDoubt=0;
        System.out.println("\t\t 1 > Sorting based ");
        System.out.println("\t\t 2 > String based ");
        System.out.println("\t\t 3 >Or From syllabus");
        System.out.println("Enter the number of given :");
        inputOutOfDoubt=sc.nextInt();
        return inputOutOfDoubt;
    }

    public static void main(String[] args) {
        TopicProblemOption c= new TopicProblemOption();
        c.tpo();
    }
}
