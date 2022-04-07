package ifelse;

import java.util.Scanner;

public class liu {
	public static void main(String[] args) {
//	    System.out.println("请输入考试成绩：");
//	    Scanner input = new Scanner(System.in);
//	    int score = input.nextInt(); // 接收键盘输入数据
//	    if (score >= 90) { // 考试成绩>=90
//	        System.out.println("优秀");
//	    } else if (score >= 80) { // 90>考试成绩>=80
//	        System.out.println("良好");
//	    } else if (score >= 60) { // 80>考试成绩>=60
//	        System.out.println("中等");
//	    } else { // 考试成绩<60
//	        System.out.println("差");
//	    }
		
			String today = "周末";
		    String weather = "晴朗";
		    if(today.equals("周末")) {
		    	if(weather.equals("晴朗")) {
		    		System.out.print("去游乐场");
		    	}else {
		    		System.out.print("篮球场");
		    	}
		    }else {
		    	System.out.print("上班");
		    }
		
		
	}
}
