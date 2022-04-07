package ifelse;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		System.out.println("ÇëÊäÈë³é½±ºÅÂë:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		switch(a) {
		case 8:
			System.out.println("ÈıµÈ½±");
			break;
			
		case 88:
			System.out.println("2µÈ½±");
			break;
			
		case 888:
			System.out.println("1µÈ½±");
			break;
			
		default:
			System.out.print("0");
			break;
		}
	}

}
