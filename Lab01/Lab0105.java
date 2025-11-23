package Lab01;
import java.util.Scanner;//เรียกใช้ Util เพื่อให้รับค่าอ่านค่า

public class Lab0105 {
    public static void main(String[] menm){
        Scanner input = new Scanner(System.in);//นำคำสั่งในการอ่านค่าเข้า

        System.out.println("Menu Number");//ชื่อโปรแกรม

        System.out.println("Enter Number ( 1 - 4 ) : ");
        int num = input.nextInt();//ให้ผู้ใช้กรอกค่า

        switch(num){//Start Switch case //แสดงผลตามเลขที่ผู้ใช้กรอกกรณีกรอกเลขอื่นจะขึ้นข้อความerror
            case 1:
                System.out.println("Americano");
                break;

            case 2:
                System.out.println("Latte");
                break;

            case 3:
                System.out.println("Espresso");
                break;
            
            case 4:
                System.out.println("Mocha");
                break;

             default:
                System.out.println("Please try again");

        }//end Switch Case

        input.close();//ปิดScanner
    }
    
}//end class

/*package Lab01;
import java.util.Scanner;

public class Lab0105 {
    public static void main(String[] menm){
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Number");

        System.out.println("Enter Number ( 1 - 4 ) : ");
        int num = input.nextInt();

         if(num == 1){
            System.out.println("Americano"); 
        }
        else if(num == 2){
            System.out.println("Latte");
        }
        else if(num == 3){
            System.out.println("Espresso");
        }
        else if(num == 4){
            System.out.println("Mocha");
        }
        else{
            System.out.println("Please try again");
        }

        input.close();
    }
    
} */