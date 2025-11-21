package Lab01;
import java.util.Scanner;//เรียกใช้ Util เพื่อให้รับค่าอ่านค่า

public class Lab0106 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//นำคำสั่งในการอ่านค่าเข้า

        System.out.println("multiply number");//ชื่อโปรแกรม

        System.out.println("Enter Number");
        int num = input.nextInt();//ให้ผู้ใช้กรอกค่าจน.เต็ม

        for(int i = 1 ; i <= 12 ; i++){//star for ให้ทำจนกว่า i(1) ถึง 12 
            System.out.printf("%d x %d = %d\n", num, i, (num * i));
        }//end for ให้ทำจนกว่า i(1) ถึง 12 

        input.close();//ปิด Scanner
    }
}//end class
