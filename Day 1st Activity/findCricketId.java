import java.util.Scanner;

public class findCricketId {

    public static void main(String[] args) {
        int[] id = new int[20];
        int[] score = new int[20];
        int n, mark;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        n = sc.nextInt();

        for (int i = 0; i < n / 2; i++) {

            id[i] = sc.nextInt();

            score[i] = sc.nextInt();
        }
        System.out.println("Result");
        mark = sc.nextInt();
        for (int i = 0; i < n / 2; i++) {
            if (score[i] > mark) {
                System.out.println(id[i]);
            }
        }
        sc.close();
    }

}