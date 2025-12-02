package Lab02o4;

public class Student {

    private String name;
    private int mid;
    private int fi;

    public Student(String n, int x, int y){
        this.name = n;
        this.mid = x;
        this.fi = y;
    }

    public double calculateAverage(){
        double avg = (mid + fi) / 2;
        return avg;
    }

    public void displaySummary(){
        double avg = calculateAverage();
        System.out.println("Name : " + this.name);
        System.out.println("Average Score : "+ avg);

        if (avg >= 50.0){
            System.out.println("Status : Pass");
        }else{
            System.out.println("Status : Fail");
        }
    }
}
