package Lab01;
import java.util.Scanner;


public class Lab0111 {

    
    public static int sumArray(int[] numbers){
        Scanner input = new Scanner(System.in);

        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Sum Calculator");

        System.out.println("How Many Number Do You Want To Input");
        int n = input.nextInt();

        int[] arr = new int[n];            

        for(int i = 0; i < n; i++){           
            System.out.println("Enter number " + (i+1));
            arr[i] = input.nextInt();
        }

        int result = sumArray(arr);
        

        System.out.println("The Values Is ");
        System.out.print(result);

        input.close();
    }
}
