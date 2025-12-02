package Lab02o8;
import java.util.Scanner;

public class Main {
    public static void main(String[] temp){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Celsius to Fahrenheit");

        System.out.println("Enter Type of Temperator C or F : ex. C_to_F");
        String type = input.nextLine();

        System.out.println("Enter Temperator :");
        double tem = input.nextDouble();

        if (type.equals("C_TO_F") || type.equals("C_To_F") || type.equals("C_to_F") || type.equals("c_to_f")){
            System.out.println("Fahrenheit = " + TempConverter.CtoF(tem));
        }

        if (type.equals("F_TO_C") || type.equals("F_To_C") || type.equals("F_to_C") || type.equals("f_to_c")){
            System.out.println("Celsius = " + TempConverter.FtoC(tem));
        }

        input.close();

    }
    
}
