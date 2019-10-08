
import java.util.Scanner;

public class epicD6 {

    static int total = 0;
    static int quantity = 0 ;
    static int sides = 0;
    static boolean again = true;
    static int i = 0;
    static int j = 0;
    static String a;
    static int randomnumber = 0;
    static int randomnumber2 = 0;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        while(again == true){
            System.out.println("How many D6's do you want to roll?");
            quantity = sc.nextInt();
            System.out.println("How many sides do you want?");
            sides = sc.nextInt();
            total = 0;
            

            for(i = 1; i <= quantity; i++){
                rolldie(sides);
                total = total + randomnumber;
                System.out.print( randomnumber + " " );
            }
            System.out.println();
            System.out.println(total);

            System.out.println("Again? (y/n)");
            a = sc.next();
            if(a.equals("y")){
                again = true;
            }else{
                again = false; 
            }

        }

    }
    public static void rolldie (int sides){
        randomnumber = (int)(Math.random()*sides) + 1;
        
    }
}
