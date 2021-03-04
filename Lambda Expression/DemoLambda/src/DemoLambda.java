interface Cab{
	void bookCab();
}
public class DemoLambda {

	public static void main(String[] args) {
		/*
		 * Cab cab = new Cab() { public void bookCab() {
		 * System.out.println("Cab Successfully Booked!"); } };
		 */
		Cab cab = ()->{
		System.out.println("Cab Successfully Booked!");
		};
		cab.bookCab();
		}
		}
