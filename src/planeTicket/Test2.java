package planeTicket;

import java.util.Scanner;

public class Test2 {
	public static void mian(String args[]) {
		System.out.println("��������е��·�");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		System.out.println("ѡ��ͷ�Ȳջ��Ǿ��òգ�����1Ϊͷ�Ȳգ�����2Ϊ���ò�");
		int kind = input.nextInt();
		double result = 3000;	//ԭ��
		
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
				System.out.println("�����kind����");
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
				System.out.println("�����kind����");
				break;
			}
			break;
			
		default:
			System.out.println("�����month����");
			break;
			
		}
		 System.out.println("��ѡ��Ļ�Ʊ�۸�Ϊ��" + result);
	}
}
