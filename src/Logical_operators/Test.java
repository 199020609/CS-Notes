package Logical_operators;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
//		if(1>2&1<2) {
//			System.out.println("1");
//		}else {
//			System.out.println("2");
//		}
//	}

	
		int number1, number2; // ������������������������
	    System.out.print("�������һ������(number1)��");
	   Scanner input = new Scanner(System.in);
	    number1 = input.nextInt(); // �����һ����
	    System.out.print("������ڶ�������(number2)��");
	    input = new Scanner(System.in);
	    number2 = input.nextInt(); // ����ڶ�����
	    System.out.printf("number1=%d,number2=%d\n", number1, number2); // �����������
	    // �ж��û�������������Ƿ����
	    if (number1 == number2) {
	        System.out.println("number1 �� number2 ��ȡ�");
	    }
	    // �ж��û���������������Ƿ����
	    if (number1 != number2) {
	        System.out.println("number1 �� number2 ����ȡ�");
	        // �ж��û��������1�Ƿ������2
	        if (number1 > number2) {
	            System.out.println("number1 ���� number2��");
	        }
	        // �ж��û��������1�Ƿ�С����2
	        if (number1 < number2) {
	            System.out.println("number1 С�� number2��");
	        }
	    }
	    
	    int i=10;
	    System.out.printf("%x \n",~i);
}
}