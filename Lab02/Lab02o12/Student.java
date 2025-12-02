package Lab02o12;

public class Student {

    private String studentName;
    private Course enrolledCourse;

    public Student(String stdname , Course enrollc){

        this.studentName = stdname;
        this.enrolledCourse = enrollc;

    }

    public void displayEnrollment(){
        System.out.println("Student : " + this.studentName);
        System.out.println("Enrolled in : " + enrolledCourse.getCourseInfo() );
    }
    
}
