package Lab01;
import java.util.Scanner;


public class Lab0101 {
    public static void main(String[] plus) {
        Scanner input = new Scanner(System.in);

        System.out.println("calculate integer (x + y)");

        System.out.println("input1");
        int num1 = input.nextInt();

        System.out.println("input2");
        int num2 = input.nextInt();

        System.out.print("Result : ");
        System.out.print(num1 + num2 );

        input.close();
    }
}
