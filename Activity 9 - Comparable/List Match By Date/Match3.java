import java.util.Date;

public class Match3 implements Comparable<Match3> 
{
	private String d1;
	private String Team1;
	private String Team2;
	public Match3(String d1, String team1, String team2) {
		super();
		this.d1 = d1;
		Team1 = team1;
		Team2 = team2;
	}
	
	public String getD1() {
		return d1;
	}
	public void setD1(String d1) {
		this.d1 = d1;
	}
	public String getTeam1() {
		return Team1;
	}
	public void setTeam1(String team1) {
		Team1 = team1;
	}
	public String getTeam2() {
		return Team2;
	}
	public void setTeam2(String team2) {
		Team2 = team2;
	}
	@Override
	public int compareTo(Match3 o) {
		// TODO Auto-generated method stub
		if(d1.compareTo(getD1())==0)
		{
			return 0;
		}
		else if(d1.compareTo(getD1())<0)
		{
			return 1;
		}
		else
			return -1;
	} 
	@Override
	public String toString() {
		return  " Team1=" + Team1 +"\n Team2= " + Team2 +"\n Match held on "+d1;
	}
}
