import java.util.*;
public class ShapeMain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Enter the shape");
		String shape=sc.next();
		if(shape.equals("Square"))
		{
			Square s=new Square();
			System.out.println("Enter the side");
			int side=sc.nextInt();
			s.calculateArea(side);
		}
		else if(shape.equals("Circle"))
		{
			Circle c=new Circle();
			System.out.println("Enter the side");
			int side1=sc.nextInt();
			c.calculateArea(side1);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
