package Lab01;
import java.util.Scanner;

public class Lab0114 {
    public static void main(String[] minsw){
        Scanner input = new Scanner(System.in);

        System.out.println("Minesweeper");

        System.out.print("Enter Row : ");
        int R = input.nextInt();

        System.out.print("Enter Column : ");
        int C = input.nextInt();
        
        char[][] target = new char[R][C];

         System.out.println("Create map Coordinate (.) , Bomb (*)");
         for (int i = 0; i < R ; i++){
            for ( int j = 0 ; j < C ; j++){
                target[i][j] = input.next().charAt(0);
            }
         }

        int tlm = 0;
        for (int i = 0; i < R; i++){
            for (int j = 0; j < C; j++){
                if (target[i][j] == '*'){
                    tlm ++;
                }
            }
        }

        System.out.println("Which target you want to select (R = 0,C = 0)");
        int TR = input.nextInt() ;
        int TC = input.nextInt() ;
        int mc = 0;

        if(TR < 0 || TR >= R  || TC < 0 || TC >= C){
            System.out.println("1");
            return;
        }

        if (target[TR][TC] == '*') {
            System.out.println("Mine");
             
        }else{
            if (TR - 1 >= 0 && TC - 1 >= 0) {
                if (target[TR-1][TC-1] == '*'){ 
                    mc++;
                }
            }

            if (TR - 1 >= 0) {
                if (target[TR-1][TC] == '*'){
                    mc++;
                }
            }

            if (TR - 1 >= 0 && TC + 1 < C) {
                if (target[TR-1][TC+1] == '*'){
                    mc++;
                }
            }

            if (TC - 1 >= 0) {
                if (target[TR][TC-1] == '*'){
                    mc++;
                }
            }

            if (TC + 1 < C) {
                if (target[TR][TC+1] == '*'){
                    mc++;
                }
            }

            if (TR + 1 < R && TC - 1 >= 0) {
                if (target[TR+1][TC-1] == '*'){
                    mc++;
                }
            }

            if (TR + 1 < R) {
                if (target[TR+1][TC] == '*'){
                    mc++;
                }
            }

            if (TR + 1 < R && TC + 1 < C) {
                if (target[TR+1][TC+1] == '*'){
                    mc++;
                }
            }

            System.out.printf("Have %d Mines Around\n",mc);
        }

        
        System.out.printf("Total Mines in map = %d\n", tlm);

        input.clsoe();
    }
    
}
