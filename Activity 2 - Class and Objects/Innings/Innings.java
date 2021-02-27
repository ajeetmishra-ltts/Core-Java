import java.util.*;
public class Innings {
	private String teamname;
	private String inningsname;
	private Integer runs;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}
	public Integer getRuns() {
		return runs;
	}
	public void setRuns(Integer runs) {
		this.runs = runs;
	}
	
	public void displayInningsDetails()
	{
		System.out.println("Name: "+ getTeamname());
		System.out.println("Scored: "+ getRuns());
		
		if(getInningsname().equalsIgnoreCase("First"))
			System.out.println("Need "+runs+1+" to win");
		else if(getInningsname().equalsIgnoreCase("Second"))
			System.out.println("Match Ended");
	}
}
