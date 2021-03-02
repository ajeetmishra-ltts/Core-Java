public class Team {
	String Name;
	long numberOfMatches;
	
	public Team(String name, long numberOfMatches) {
		super();
		Name = name;
		this.numberOfMatches = numberOfMatches;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(long numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	@Override
	public String toString() {
		return  Name + "- " + numberOfMatches;
	}
	
	

}
