package Lab02o3;

public class Student {
    private String studentID;   
    private String name;     
    public static int count = 0;
    
    public Student(String id, String n) {
            this.studentID =  id;
            this.name = n ;
            count++ ;
        }

    /*public int getCount() {
        return count;

    }*/

}
