package Lab02o9;

public class Address {
    private String address;
    private String town;
    private String zipCode;

    public Address(String add, String tw, String zipc){
        this.address = add;
        this.town = tw;
        this.zipCode = zipc;
    }

    public String getFullAddress(){

        return this.address + ", " + this.town + ", " + this.zipCode;
    }
    
}
