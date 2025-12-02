package Lab02o4;
import java.util.Scanner;

public class Main {
    public static void main(String[] Scorecal){
        Scanner input = new Scanner(System.in);

        System.out.println("-----{ Score Average )-----");

        System.out.println("Enter Name and Sur name");
        String name = input.nextLine();

        System.out.println("Enter MidTerm Scores :");
        int mid = input.nextInt();

        System.out.println("Enter Final Scores :");
        int fi = input.nextInt();

        Student dis = new Student(name, mid, fi);

        dis.displaySummary();
        
        input.close();
    }
    
}
