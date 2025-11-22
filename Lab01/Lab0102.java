package Lab01;
import java.util.Scanner; //เรียกใช้ Util เพื่อให้รับค่าอ่านค่า


public class Lab0102 {
    public static void main(String[] sumi) {
        Scanner input = new Scanner(System.in);//นำคำสั่งในการอ่านค่าเข้า

        System.out.println("Rectangle calculate (Width x Height)");//ตั้งชื่อโปรแกรม

        System.out.println("Enter Width");
        Double num1 = input.nextDouble();//ให้ผู้ใช้กรอกค่าความกว้าง

        System.out.println("Enter Height");
        Double num2 = input.nextDouble();//ให้ผู้ใช้ใส่ความสูง

        System.out.print("Result :");
        System.out.print(num1 * num2);//แสดงผลลัพธ์

        input.close();//ปิดScanner
    }
}//end class
