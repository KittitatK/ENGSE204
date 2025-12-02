package Lab02o2;

public class Student {

    private String studentID;   
    private String name;          


        public Student(String id, String n) {
            this.studentID = id;
            this.name = n;
            
        }


        public String displayInfo() {
            return this.studentID + "\n" + this.name;

        }

}
