package planeTicket;

import java.util.Scanner;

public class Test1 {
	public static void main(String args[]) {
		System.out.println("请输入出行的月份");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		System.out.println("选择头等舱还是经济舱？数字1为头等舱，数字2为经济舱");
		int kind = input.nextInt();
		double result = 3000;	//原价
		//旺季的票价计算
		if(month >= 4 && month <= 11) {
			if(kind==1) {
				result *= 0.9;	//头等舱
			}else if(kind==2){
				result *= 0.8;	//经济舱
				
			}else {
				System.out.println("输入有误");
			}
		//淡季的票价计算
		}else if(month >= 1 && month <= 3 || month==12){
			if(kind==1) {
				result *= 0.9;	//头等舱
			}else if(kind==2){
				result *= 0.8;	//经济舱
				
			}else {
				System.out.println("输入有误");
			}
		}else {
			System.out.println("输入有误");
		}
		
		System.out.println("你的票价为"+result);
	}

}
