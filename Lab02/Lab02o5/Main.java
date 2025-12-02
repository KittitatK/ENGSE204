package Lab02o5;
import java.util.Scanner;

public class Main {
    public static void main(String[] Area){
        Scanner input = new Scanner(System.in);

        System.out.println("Find The Area");
        System.out.println("Enter Wide :");
        double w = input.nextDouble();

        System.out.println("Enter Length :");
        double l = input.nextDouble();

        Rectangle reccal = new Rectangle();
        System.out.println(reccal.getArea(w ,l));
        System.out.println(reccal.getPerimeter(w ,l));



        input.close();
    }
    
}
