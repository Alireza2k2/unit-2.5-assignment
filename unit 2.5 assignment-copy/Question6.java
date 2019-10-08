import java.util.Scanner;
class Question6{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int height = 0;
        int width = 0;

        System.out.println("What would you like the height to be?");
        height = sc.nextInt();
        
        System.out.println("What would you like the width to be?");
        width = sc.nextInt();
        
        displayBox(width,height);

    }
    public static void displayBox(int width, int height){
        int i = 0;
        int j = 0;

        for(i = 1; i <= height; i++){
            for(j = 1; j <= width; j++){
                System.out.print("$");
            }
            System.out.println("");
        }

    }
}