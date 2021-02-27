import java.io.*;
import java.util.*;

public class RunRate {
    Scanner scan = new Scanner(System.in);
    int runs, balls;
    float runRate;

    public void input() {
        try {
            System.out.println("Enter the total runs scored: ");
            runs = scan.nextInt();
            System.out.println("Enter the total overs faced ");
            balls = scan.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("Error Code: " + e);
            System.exit(0);
        }
    }

    public void compute() {
        runRate = runs / balls;
        System.out.println("Current Run Rate : " + runRate);
    }

    public static void main(String[] args) {
        RunRate obj = new RunRate();
        obj.input();
        obj.compute();
    }
}