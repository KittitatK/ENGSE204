package Lab01;
import java.util.Scanner; 


public class Lab0102 {
    public static void main(String[] sumi) {
        Scanner input = new Scanner(System.in);

        System.out.println("Rectangle calculate (Width x Height)");

        System.out.println("Enter Width");
        Double num1 = input.nextDouble();

        System.out.println("Enter Height");
        Double num2 = input.nextDouble();

        System.out.print("Result :");
        System.out.print(num1 * num2);

        input.close();
    }
}
