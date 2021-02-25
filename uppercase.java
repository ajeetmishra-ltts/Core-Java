import java.util.Scanner;

public class demostring {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = "Good morning";

        System.out.println("Length : " + s1.length());
        System.out.println("Equal : " + (s1 == s2));
        System.out.println("Equal : " + (s2 == s3));

        // string other methods

        System.out.println("Check the content: literals :  " + s1.equals(s2));
        System.out.println("Check the content: literals with object :  " + s2.equals(s3));

        //

        System.out.println("Concat : " + s1.concat(s5));
        s1 = s1.concat(s5);
        System.out.println("Value of s1 : " + s1);
        System.out.println("Value of s5 : " + s5);

    }

}
