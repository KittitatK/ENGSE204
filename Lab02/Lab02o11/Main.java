package Lab02o11;

import java.util.Scanner;

public class Main {
    public static void main(String[] carros){
        Scanner input = new Scanner(System.in);

        System.out.println("------( Car Information )------");
        System.out.print("Car Name    : ");
        String car = input.nextLine();

        System.out.print("Manufacturing Year (MFG)          : ");
        int year = input.nextInt();

        System.out.print("Manufacturing Year (MFG) Update   : ");
        int Update = input.nextInt();

        Car Info = new Car(car, year);
        Info.setYear(Update);

        System.out.println("------( Car Information Year Update )------");
        System.out.println("Model   : " + Info.getModel());
        System.out.println("Year    : " + Info.getYear());

        input.close();
    }
}
