package Lab02o9;

public class Student {
    private String name;
    private Address address;

    public Student(String n, Address ad){
        this.name = n;
        this.address = ad;

    }

    public void displayProfile(){
        System.out.println("Name : "+ this.name);
        System.out.println("Address : "+ address.getFullAddress());
    }
    
}
