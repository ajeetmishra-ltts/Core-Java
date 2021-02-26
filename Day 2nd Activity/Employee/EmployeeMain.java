import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name: ");
        String s1 = sc.nextLine();

        System.out.println("Enter Address: ");
        String s2 = sc.nextLine();

        System.out.println("Enter Moblie: ");
        String s3 = sc.nextLine();

        e.name(s1);
        e.setAddress(s2);
        e.setMobile(s3);

        System.out.println("Employee Details");
        System.out.println("Name: " + e.getName());
        System.out.println("Address: " + e.getAddress());
        System.out.println("Moblie: " + e.getMobile());

        sc.close();
    }

}

    

     