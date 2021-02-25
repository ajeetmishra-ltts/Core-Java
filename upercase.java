package com.ltts.strings;
import java.util.*;
public class upercase {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		String firstName1;
		String lastName1;
		Scanner in=new Scanner(System.in);
		firstName=in.next();
		lastName=in.next();
		firstName1=in.next();
		lastName1=in.next();
		if(lastName.equalsIgnoreCase(lastName1)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}