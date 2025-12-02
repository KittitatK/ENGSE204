package Lab02o12;
import java.util.Scanner;

public class Main {
    public static void main(String[] enrolled){

        Scanner input = new Scanner(System.in);

        System.out.println("------( Enroll Course )------");
        System.out.println("Enter Course ID :");
        String id = input.nextLine();

        

        System.out.println("Enter Course Name :");
        String cname = input.nextLine();

        

        System.out.println("Enter Your Name :");
        String stdname = input.nextLine();

        

        Course c = new Course(id, cname);
        Student s = new Student(stdname, c);

        System.out.println("\n");

        s.displayEnrollment();

        input.close();
    }

}
