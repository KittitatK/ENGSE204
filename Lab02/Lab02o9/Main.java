package Lab02o9;
import java.util.Scanner;
public class Main {
    public static void main(String[] Address){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name And Surname");
        String name = input.nextLine();

        System.out.println("Enter Address ");
        String add = input.nextLine();

        System.out.println("Enter Town ");
        String tw = input.nextLine();

        System.out.println("Zip Code ");
        String zipc = input.nextLine();

        System.out.println("\n");

        Address A = new Address(add, tw, zipc);
        Student S = new Student(name, A);

        S.displayProfile();
        
        input.close();
    }
    
}
