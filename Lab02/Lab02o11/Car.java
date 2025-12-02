package Lab02o11;

public class Car {
    private String model;
    private int year;

    public Car(String models, int years){
        this.model = models;
        this.year = years;

    }

    public String getModel(){
        return this.model ;
    }
    
    public int getYear(){

        return this.year;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }
}
