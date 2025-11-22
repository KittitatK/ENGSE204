package Lab01;
import java.util.Scanner; 

public class Lab0104 {
    public static void main(String[] gpd){
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate Score (0-100)");

        System.out.println("Enter Score (0-100)");
        int score = input.nextInt();

        if ( score < 0 || score > 100){
            System.out.println("Error");

        }else if ( score >= 80 || score <= 100){
            System.out.println("A");

        }else if ( score >= 70 || score <= 79){
            System.out.println("B");

        }else if ( score >= 60 || score <= 69){
            System.out.println("C");

        }else if ( score >= 50 || score <= 59){
            System.out.println("D");

        }else if ( score >= 0 || score <= 49){
            System.out.println("F");

        }

        input.close();
    }
}
