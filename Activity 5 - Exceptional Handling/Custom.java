import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Custom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Player Name: ");
		try
		{
			String name = reader.readLine();
			System.out.println("Enter Player Age: ");
			int age = Integer.parseInt(reader.readLine());
			if(age<18)
			{
				throw new ArithmeticException("InvalidAgeRange");
			}
			else
			{
				System.out.println("Player Name: "+name);
				System.out.println("Player Age: "+age);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}