package Lab01;
import java.util.Scanner;

public class Lab0109 {
    public static void main(String[] haved){
        Scanner input = new Scanner(System.in);

        int i;
        double m = 0;
        double sum = 0;
        double avg = 0;
            
        System.out.println("Find The Average");

        System.out.println("How Many Number Do You Want To Input");
        int n = input.nextInt();

        for ( i = 1 ; i <= n ; i ++){
            System.out.println("Enter The NUmber "+ i);
            m = input.nextDouble();
            sum += m;
        }

        avg = sum / n;

        System.out.printf("The Average 0f This Number is %.1f", avg);

        input.close();
    }
}

