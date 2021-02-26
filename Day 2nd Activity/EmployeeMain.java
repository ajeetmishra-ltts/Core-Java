import java.util.*;
class EmployeeMain{
    public static void main(String [] args){
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        e.setName(s1);
        e.setAddress(s2);
        e.setMobile(s3);

        System.out.println(e.getName());
        System.out.println(e.getAddress());
        System.out.println(e.getMobile());

    }
}