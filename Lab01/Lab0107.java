package Lab01;
import java.util.Scanner;//นำค่า utilเข้า

public class Lab0107 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//เรียกใชScanner เพื่อรับค่าผู้ใช้

        int sum = 0;
        int j ;
        System.out.println("Calculate Sum");
        
        System.out.println("How Many Number Do You Want TO Input");
        int num = input.nextInt();

        for(int i = 1 ; i <= num ; i++ ){//start for ให้ i เป็นตัววนค่าจนครบจำนวนตามที่ผู้ใช้กรอก เช่นผู้ใช้กรอก 4 ครั้ง มันก็จะขึ้นให้กรอก4ครั้งโดยมี <= num โดยนำเป็นตัวกำหนดลูป
            System.out.printf("Enter number %d\n",i);
            j = input.nextInt();
            sum += j;// sum = sum + j
            
        }//end for
        
        System.out.printf("Sum = %d", sum );//แสดงผลรวม

        input.close();//ปิดScanner
    }
}//end class
