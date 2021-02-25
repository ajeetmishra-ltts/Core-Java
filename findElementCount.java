
import java.util.Scanner;

public class findElementCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num, count = 0;
        int[] arr = new int[20];
        System.out.println("Enter numbers");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        System.out.println("Result");
        num = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }

}