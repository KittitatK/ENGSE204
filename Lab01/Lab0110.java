package Lab01;
import java.util.Scanner;

public class Lab0110 {


    public static Double calculateArea(Double x, Double y){
        return x * y;
    }

    public static void main(String[] eren){
        Scanner input = new Scanner(System.in);

        System.out.println("Find The Area (W x H)");

        System.out.print("Enter Width Number: ");
        double width = input.nextDouble();

        System.out.print("Enter Height Number: ");
        double height = input.nextDouble();

        double area = calculateArea(width, height);

        System.out.println("The Area Is " + area);

        input.close();
    }
}
