import java.util.Scanner;

public class M_Aapun {
     int Aapun() {
        int charge=0;
        Scanner sc=new Scanner(System.in);
        char more10time = 0;
        int countOfAlarm=0;
         System.out.println();
         System.out.println("💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓💓🖤🖤");
        System.out.println("I'm glad to see you on my word that's why gonna change your name for this word ....");
        System.out.println("Your Name is :- M_Aapun");
        System.out.println("Aapun means himself and M 😘for respect mis or mr😉");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------------------------");
        while (more10time!='n'){
            System.out.println("Aapun -alarm is beeping wakeup otherwise you getting late for college------");
            System.out.println("If you want to sleep for 10 mins more then reply (y) otherwise (n) :");
            String input=sc.next();
            more10time=input.charAt(0);
            countOfAlarm++;
        }
        if(countOfAlarm>1){
            System.out.println("Aapun you getting late (^_^)");
            System.out.println("You need to ready fast( Chaudhary) is on the room (--)");
            charge=80;
            System.out.println("Aapun your life is 80% only you don't have taking breakfast cause you late ----");
            return charge;
        }
        else {
            System.out.println("Go and cook breakfast and get ready for college --");
            charge=100;
            System.out.println("Aapun your life is 100% , because you take breakfast ////");
            return charge;
        }
    }

    public static void main(String[] args) {
        M_Aapun c=new M_Aapun();
        c.Aapun();
    }
    }

