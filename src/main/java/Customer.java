import java.util.Date;

public class Customer {
    private String name;
    private String addressLN1;
    private String addressLN2;
    private String addressLN3;
    private String postCode;
    private int age;
    private int customerID;

    public Customer(String name, String addressLN1, String addressLN2, String addressLN3, String postCode, int age) {
        this.name = name;
        this.addressLN1 = addressLN1;
        this.addressLN2 = addressLN2;
        this.addressLN3 = addressLN3;
        this.postCode = postCode;
        this.age = age;
    }

}
