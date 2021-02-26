import java.util.Scanner;

public class updates {
    private String name;
    private String address;
    private String mobile;

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    String getMobile() {
        return mobile;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void display() {
        System.out.println("Employee Details: ");
        System.out.println("Name: " + name);
        System.out.println("Address:" + address);
        System.out.println("Mobile: " + mobile);
    }
}