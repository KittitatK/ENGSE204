package Lab02o1;
import java.util.Scanner;

public class Main {
    public static void main(String[] information){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID : ");
        String sId = input.nextLine();

        System.out.print("Enter Student Name : ");
        String sName = input.nextLine();

        Student s = new Student(sId, sName);

        System.out.println(s.getStudentID());
        System.out.println(s.getName());

        input.close();
    }
 
    
}
