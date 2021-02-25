
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a First string: ");
		String s1= sc.nextLine();
		System.out.print("Enter a Second string: ");
		String s2= sc.nextLine();
		
		String s1upper=s1.substring(0, 1).toUpperCase() + s1.substring(1).toLowerCase();
		String s2upper=s2.toUpperCase();  
		System.out.println(s1upper+" "+s2upper);
	}
}
