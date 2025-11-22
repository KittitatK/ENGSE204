package Lab01;
import java.util.Scanner; //เรียกใช้ Util เพื่อให้รับค่าอ่านค่า


public class Lab0101 {
    public static void main(String[] plus) {
        Scanner input = new Scanner(System.in); //นำคำสั่งในการอ่านค่าเข้า

        System.out.println("calculate integer (x + y)");//ชื่อโปรแกรม

        System.out.println("input1");
        int num1 = input.nextInt();// รับค่าจากแรก

        System.out.println("input2");
        int num2 = input.nextInt();// รับค่าจากสอง

        System.out.print("Result : ");
        System.out.print(num1 + num2 );//คำนวณและ print ออกมา

        input.close();//ปิดScanner
    }
}//end class
