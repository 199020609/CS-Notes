package planeTicket;

import java.util.Scanner;

public class Test1 {
	public static void main(String args[]) {
		System.out.println("��������е��·�");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		System.out.println("ѡ��ͷ�Ȳջ��Ǿ��òգ�����1Ϊͷ�Ȳգ�����2Ϊ���ò�");
		int kind = input.nextInt();
		double result = 3000;	//ԭ��
		//������Ʊ�ۼ���
		if(month >= 4 && month <= 11) {
			if(kind==1) {
				result *= 0.9;	//ͷ�Ȳ�
			}else if(kind==2){
				result *= 0.8;	//���ò�
				
			}else {
				System.out.println("��������");
			}
		//������Ʊ�ۼ���
		}else if(month >= 1 && month <= 3 || month==12){
			if(kind==1) {
				result *= 0.9;	//ͷ�Ȳ�
			}else if(kind==2){
				result *= 0.8;	//���ò�
				
			}else {
				System.out.println("��������");
			}
		}else {
			System.out.println("��������");
		}
		
		System.out.println("���Ʊ��Ϊ"+result);
	}

}
