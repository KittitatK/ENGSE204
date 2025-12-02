package Lab02o12;

public class Course {

    private String courseld;
    private String courseName;

    public Course(String coseld, String coName){

        this.courseld = coseld;
        this.courseName = coName;

    }

    public String getCourseInfo(){

        return this.courseld + " : " + this.courseName;
    }
    
}
