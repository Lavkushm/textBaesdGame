import java.util.Scanner;

public class ProblemOption {
    int problemOption(){
        Main c1=new Main();
        int res= c1.abc();
        Scanner sc= new Scanner(System.in);
        int inputOutOfDoubt = res;
        int inputOfSorting;
        int inputOfString;
        if(inputOutOfDoubt==1){
            System.out.println("Sure, select which type of sorting want to know ....");
            System.out.println("\t\t 1 > Bubble Sorting  ");
            System.out.println("\t\t 2 > Selection Sorting  ");
            System.out.println("\t\t 3 > Insertion Sorting ");
            inputOfSorting=sc.nextInt();
            return inputOfSorting;
        }
        if(inputOutOfDoubt==2){
            System.out.println(" select which type of Problem want to solve....");
            System.out.println("\t\t 1 > Reverse the string   ");
            System.out.println("\t\t 2 > String is palindrome or not  ");
            System.out.println("\t\t 3 > Word count  ");
            System.out.println("\t\t 4 > Panagram checking  ");
            System.out.println("\t\t 5 > Longest common prefix ");
            System.out.println("\t\t 6 > Last word count in sentence ");
            inputOfString=sc.nextInt();
            return inputOfString;
        }
        if(inputOutOfDoubt==3){
            System.out.println("Sure, select which type of Problem want to solve....");
            System.out.println("Enter the number of program want to solve (3,4,5,7,8,9,10) :");
            int syllabusProblemNumber =sc.nextInt();
            return syllabusProblemNumber;
        }
        return 0;
    }
    public static void main(String[] args) {
        ProblemOption c=new ProblemOption();
        c.problemOption();
    }
}
