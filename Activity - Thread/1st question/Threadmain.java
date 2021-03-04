import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Threadmain {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String match[]=new String[5];
	String score[]=new String[5];
	int i;
	SortScore[] ss=new SortScore[5];
	for(i=0;i<3;i++)
	{
		System.out.println("Enter the match : ");
		match[i]=br.readLine();
		System.out.println("Enter the Score :  ");
		match[i]=br.readLine();
		ss[i]=new SortScore(match[i],score[i]);
	}
	System.out.println("Ordered List :  ");
	for(i=0;i<5;i++) {
		ss[i].start();
		try
		{
			ss[i].join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		ss[i].getScores();
		}
	}
}
	