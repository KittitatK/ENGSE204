package Lab01;
import java.util.Scanner;//เรียกใช้ Util เพื่อให้รับค่าอ่านค่า

public class Lab0103 {
    public static void main(String[] evod) {
        Scanner input = new Scanner(System.in);//นำคำสั่งในการอ่านค่าเข้า

        System.out.println("Check  Even , Odd number");//ชื่อโปรแกรม

        System.out.println("Enter number : ");
        int num = input.nextInt();//ให้ผู้ใช้กรอกเลข

        if(num % 2 == 0){//ถ้าเลขที่กรอกหารแล้วเจอเศษเช่น ผู้ใช้กรอก 7 7 หารเอาเศษ 2 = 6 เหลือเศษ 1 ( 7 % 2 = 1)
            System.out.println("This number is Even number");//แสดงข้อความหากหารลงตัว
        }else{
            System.out.println("This number is Odd number");//แสดงข้อความหากไม่หารลงตัว

        } 

        input.close();//ปิดScanner
    }
    
}//end class
