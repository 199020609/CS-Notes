package datatypeconversion;

public class Test {

	public static void main(String args[]) {
		/*
		 * �����ʽ�����͵��Զ�������
		 */
		float price1=5.2f;	 // ��������ļ۸�
		double price2=5.232;	 // �������ֽ�ļ۸�
		int num1=4;	 // �������������
		int num2=8;	// �������ֽ������
		double res = price1*num1+price2*num2;	 // �����ܼ�
		System.out.println("һ��������Ա"+ res + "Ԫ");					//����ܼ�
		
		byte b = 50;
		b  = (byte)(b*2);
		
		int a = 3;
		double c = 5.0;
		a = (int)c;
		System.out.println(a);
		System.out.println(c);
		 double he =  price1 * num1 + price2 * num2;
	    
		 int res2 = (int) he;
		 System.out.println(he);
		    System.out.println("һ����������Ա" + res2 + "Ԫ");

		    
		    int p = 12;
		    System.out.println(-p);
		    
		    int l = p++;
		    System.out.println(l);
		    
		    l = ++p;
		    System.out.println(l);
		
	}
}
