package Lab02o1;

public class Student {
    private String studentID;   
    private String name;          
        

        public Student(String id, String n) {
            this.studentID = id;
            this.name = n;
            
        }


        public String getStudentID() {
            return this.studentID;

        }


        public String getName() {
            return this.name;

        }
        
}
