
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, temp, store, fact = 1, count = 0;
        int[] intArray = new int[20];
        System.out.println("enter number");
        num1 = sc.nextInt();
        temp = num1;
        if (num1 > 32767) {
            System.out.println("Too large");
        } else if (num1 < 0) {
            System.out.println("Too small");
        } else if (num1 == 0 || num1 == 1) {
            System.out.println(1);
        } else {

            while (temp > 0) {
                store = temp % 10;
                fact = 1;
                for (int i = 1; i <= store; i++) {
                    fact = fact * i;
                }

                intArray[count] = fact;
                count++;
                temp = temp / 10;
            }
            for (int i = count - 1; i >= 0; i--) {
                System.out.println(intArray[i]);
            }

        }
        sc.close();
    }

}
