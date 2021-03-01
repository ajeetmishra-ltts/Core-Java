import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of overs: ");
		try
		{
			int size = Integer.parseInt(reader.readLine());
			int array[] = new int[size];
			for(int i=0;i<size;i++)
			{
				array[i] = Integer.parseInt(reader.readLine());
				
			}
			System.out.println("Over Number: ");
			int num = Integer.parseInt(reader.readLine());
			System.out.println(array[num-1]);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
