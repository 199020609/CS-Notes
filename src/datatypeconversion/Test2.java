package datatypeconversion;

public class Test2 {
	public static void main(String args[]) {
	int a = 1;
	int b = 2;
	a += b; // �൱�� a = a + b
	System.out.println(a);
	a += b + 3; // �൱�� a = a + b + 3
	System.out.println(a);
	a -= b; // �൱�� a = a - b
	System.out.println(a);
	a *= b; // �൱�� a=a*b
	System.out.println(a);
	a /= b; // �൱�� a=a/b
	System.out.println(a);
	a %= b; // �൱�� a=a%b
	System.out.println(a);
	
	 	double price = 10.25; // ������Ʒ�ĵ��ۣ���ֵΪ10.25
	    double total = 0; // �����ܼ۳�ʼΪ0
	    int count = 2; // ���幺����������ֵΪ2
	    price -= 1.25; // ��ȥ���۵õ���ǰ����
	    count *= 5; // ������Ҫ����10������ԭ��������5��
	    total = price * count; // �ܼ�=��ǰ����*����
	    System.out.printf("��Ʒ��ǰ�ĵ���Ϊ��%2.3f \n", price); // �����ǰ����
	    System.out.printf("������Ʒ������Ϊ��%d \n", count); // �����������
	    System.out.printf("�ܼ�Ϊ��%4.5f \n", total); // ����ܼ�
	}
}
