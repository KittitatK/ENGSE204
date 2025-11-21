package Lab01;
import java.util.Scanner;


public class Lab0110 {

    
    public static Double calculateArea(Double x,  Double y , Double mul){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Width Number ");
        x = input.nextDouble();

        System.out.println("Enter Height Number ");
        y = input.nextDouble();

        mul = x * y;

        return mul;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Find The Area (W x H)");

        double sum = calculateArea(0.0, 0.0, 0.0);

        System.out.println("The Area Is "+ sum);

        input.close();
    }
}
