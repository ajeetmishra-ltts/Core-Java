import java.util.Scanner;

public class CustomerMain {
    public static void main(String[] args) {
        Customer e = new Customer();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details: ");
        String s1 = sc.nextLine();

        e.setDetails(s1);

        String[] res = s1.split("[,]", 0);
        String res1 = res[0];
        String res2 = res[1];
        String res3 = res[2];
        System.out.println("Name: " + res1);
        System.out.println("Address: " + res2);
        System.out.println("Mobile: " + res3);

        sc.close();
    }
}
