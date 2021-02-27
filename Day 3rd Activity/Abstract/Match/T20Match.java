
public class T20Match extends Match {

	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		float reqRunRate;
		reqRunRate=(getTarget()-getCurrentscore())/(20-getCurrentover());
		return reqRunRate;
	}

	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		int cuo;
		cuo=120-((int)getCurrentover()*6);
		
		return cuo;
	}

	@Override
	public void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		int runs;
		runs=getTarget()-getCurrentscore();
		System.out.println("Need "+runs+" runs in "+balls+" balls.");
		System.out.println("Required Runrate: "+reqRunrate);
		
	}

}
