import java.util.*;
import java.io.*;

public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        if (n < 5 && n > 0 && a > 0 && b > 0 && a < 32767 && b < 32767) {
            switch (n) {
                case 1:

                    System.out.println(a + b);
                    break;

                case 2:

                    System.out.println(a - b);
                    break;

                case 3:

                    System.out.println(a * b);
                    break;

                case 4:

                    System.out.println(a / b);
                    break;
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}