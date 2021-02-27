import java.util.*;
public class MainMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the Match format: ");
		System.out.println("1.	ODI\r\n"+ "2.	T20\r\n"+ "3.	Test\r\n"+ " ");
		int n=inp.nextInt();
		System.out.println("Enter the Current score: ");
		int currentscore=inp.nextInt();
		System.out.println("Enter the Current over: ");
		float currentover=inp.nextFloat();
		System.out.println("Enter the Target score: ");
		int target=inp.nextInt();
		if(n==1)
		{
			ODIMatch o=new ODIMatch();
			o.setCurrentscore(currentscore);
			o.setCurrentover(currentover);
			o.setTarget(target);
			float rr=o.calculateRunRate();
			int balls= o.calculateBalls();
			o.display(rr, balls);
		}
		else if(n==2)
		{
			T20Match t2=new T20Match();
			t2.setCurrentscore(currentscore);
			t2.setCurrentover(currentover);
			t2.setTarget(target);
			float rr=t2.calculateRunRate();
			int balls= t2.calculateBalls();
			t2.display(rr, balls);
		}
		else if(n==3)
		{
			TestMatch tt=new TestMatch();
			tt.setCurrentscore(currentscore);
			tt.setCurrentover(currentover);
			tt.setTarget(target);
			float rr=tt.calculateRunRate();
			int balls= tt.calculateBalls();
			tt.display(rr, balls);
		}
		else
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
	}

}
