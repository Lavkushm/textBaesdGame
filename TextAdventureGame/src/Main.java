public class Main {
   static int topicOption;
    int abc() {
        return topicOption;
    }

    public static void main(String[] args) {
        int charge=0;
        // A character who play in the game name Aapun
        M_Aapun c=new M_Aapun();
        charge=c.Aapun();
        System.out.println("charege :"+charge);
        //college getting
        College c1=new College();
        c1.college();
        // topic problem option
        TopicProblemOption c2=new TopicProblemOption();
        BubbleSort c4=new BubbleSort();
        ProblemOption c3=new ProblemOption();
         topicOption=c2.tpo();
         Main p=new Main();
//         p.abc(topicOption);
        while (charge>30){
            if(topicOption==1){
                int sort= c3.problemOption();
                if(sort==1){
                    c4.bubbleSort();
                    charge=charge-40;
                }
                if(sort==2){
                    SelectionSort c5=new SelectionSort();
                    c5.selectionSort();
                    charge=charge-40;
                }
                if(sort==3){
                    InsertionSort c6=new InsertionSort();
                    c6.insertionSort();
                    charge=charge-40;
                }
                else {
                    System.out.println("Wrong choice you are fired from game ");
                    System.out.println("Life charge is 0%");
                }
            }
            if(topicOption==2){
                int stg= c3.problemOption();
                System.out.println(stg);
                if(stg==1){
                    ReverseString c7=new ReverseString();
                    c7.reverseString();
                    charge=charge-30;
                }
                if(stg==2){
                    StringPalindromeOrNot c8=new StringPalindromeOrNot();
                    c8.isPalindrome();
                    charge=charge-30;
                }
                if(stg==3){
                    WordCount c9=new WordCount();
                    c9.wordCount();
                    charge=charge-30;
                }
                if(stg==4){
                    CheckPangram c10=new CheckPangram();
                    c10.checkPangram();
                    charge-=30;
                }
            }
            if(topicOption==3){
                int frmSls=c3.problemOption();
            }
        }
         if(topicOption>4 || topicOption<1){
             System.out.println("Wrong input you are fired ");
             System.out.println("Game over _:_");
         }


    }
}