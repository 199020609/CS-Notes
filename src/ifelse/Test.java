package ifelse;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		System.out.println("������齱����:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		switch(a) {
		case 8:
			System.out.println("���Ƚ�");
			break;
			
		case 88:
			System.out.println("2�Ƚ�");
			break;
			
		case 888:
			System.out.println("1�Ƚ�");
			break;
			
		default:
			System.out.print("0");
			break;
		}
	}

}
