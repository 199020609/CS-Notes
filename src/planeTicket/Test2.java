package planeTicket;

import java.util.Scanner;

public class Test2 {
	public static void mian(String args[]) {
		System.out.println("请输入出行的月份");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		System.out.println("选择头等舱还是经济舱？数字1为头等舱，数字2为经济舱");
		int kind = input.nextInt();
		double result = 3000;	//原价
		
		switch(month) {
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			switch(kind) {
			case 1:
				result *= 0.9;
				break;
			case 2:
				result *= 0.8;
				break;
			default:
				System.out.println("输入的kind有误");
				break;
			}
			break;
		
		case 12:
		case 1:
		case 2:
		case 3:
			switch(kind) {
			case 1:
				result *= 0.9;
				break;
			case 2:
				result *= 0.8;
				break;
			default:
				System.out.println("输入的kind有误");
				break;
			}
			break;
			
		default:
			System.out.println("输入的month有误");
			break;
			
		}
		 System.out.println("您选择的机票价格为：" + result);
	}
}
