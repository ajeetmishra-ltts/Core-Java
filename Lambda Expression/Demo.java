
public interface Demo {
	public void display();
	default void show() {
		System.out.println("Default method");
	}

}

