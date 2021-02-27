import java.util.Scanner;

public class updatess {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name, mob, address;
        updates obj = new updates();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        obj.setName(name);
        System.out.println("Enter Address: ");
        address = sc.nextLine();
        obj.setAddress(address);
        System.out.println("Enter Mobile: ");
        mob = sc.nextLine();
        obj.setMobile(mob);
        obj.display();
        System.out.println();
        while (true) {

            Scanner s = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1.Update Employee Name");
            System.out.println("2.Update Employee Address");
            System.out.println("3.Update Employee Mob_Num");
            System.out.println("4.All Correct Exit");
            int value = sc.nextInt();
            if (value == 1) {
                System.out.println("The Previous Name is: " + obj.getName());
                name = s.nextLine();

                obj.setName(name);
                obj.display();

            } else if (value == 2) {
                System.out.println("The Previous Address is: " + obj.getAddress());
                address = s.nextLine();
                obj.setAddress(address);
                obj.display();

            } else if (value == 3) {
                System.out.println("The Previous Mob_Num is: " + obj.getMobile());
                mob = s.nextLine();
                obj.setMobile(mob);
                obj.display();

            } else {
                obj.display();
                System.exit(0);
            }

        }

    }
}