package Lab02o3;
import java.util.Scanner;

public class Main {
    public static void main(String[] stdcount){
        java.util.Scanner input = new Scanner(System.in);

        System.out.print("Enter Person = ");
        int n = input.nextInt();
        
        input.nextLine();

        for (int i = 0 ; i < n ; i++){
            System.out.print("\n");
            System.out.print("Enter ID = ");
            String sid = input.nextLine();

            System.out.print("Enter Name = ");
            String sname = input.nextLine();

            Student S = new Student(sid, sname);
        }
        

        System.out.println(Student.count);

        input.close();
    }
    
}

