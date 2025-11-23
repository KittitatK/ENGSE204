package Lab01;
import java.util.Scanner;

public class Lab0107 {
    public static void main(String[] calus){
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int j ;
        System.out.println("Calculate Sum");
        
        System.out.println("How Many Number Do You Want TO Input");
        int num = input.nextInt();

        for(int i = 1 ; i <= num ; i++ ){
            System.out.printf("Enter number %d\n",i);
            j = input.nextInt();
            sum += j;
            
        }
        
        System.out.printf("Sum = %d", sum );

        input.close();
    }
}
