import java.util.ArrayList;

public class CalculateScores extends Thread {
	private String matchType;
	private String scoreString;
	
	public CalculateScores(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getScoreString() {
		return scoreString;
	}
	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;
	}
	void getScore()
	{
		String array[] = scoreString.split(",");
		ArrayList<Integer> al = new ArrayList<>();
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			al.add(Integer.parseInt(array[i]));
			sum=sum+al.get(i);
			
		}
		int mean=sum/5;
		System.out.println("mean:"+mean);
		System.out.println("min"+al.get(0)+"max:"+al.get((array.length)-1));
		
	}
	public void run()
	{
		System.out.println(matchType);
		getScore();
	}
	

}
