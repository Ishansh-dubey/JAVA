package stringDemo;

import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {
		String name = "";
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter your name: ");
//		name = sc.next();
//		System.out.println(name);
//		
		System.out.println("Enter your DOB(dd-mm-yyyy): ");
		String dob = sc.next();
		
		String dob_arr[] = dob.split("-");
		String year = dob_arr[2];
		
		int dob_int = Integer.parseInt(year);
		
		int age = 2021 - dob_int;
		System.out.println(age);
	}
}
