package Lab01;
import java.util.Scanner;

public class Lab0108 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int i,m;
            
        System.out.println("Find Maximum Value");

        System.out.println("How Many Number Do You Want To Input");
        int n = input.nextInt();


        int[] array  = new int[n];

            for ( i = 1 ; i <= n ; i++){
                System.out.println("Enter Number "+ i);
                m = input.nextInt();
                array[i-1] = m;
            }
                 
            int max = array[0];

            for(i = 1 ; i < array.length ; i++ ){
                if ( array[i] > max ){
                    max = array[i];
                }
            }
            
        System.out.println("The Maximum Number is "+ max);

        input.close();
    }
}

