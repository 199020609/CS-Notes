package Type;

public class test {
	
	
	
	public static void main(String[] args) {
	    byte a = 20; // ����һ��byte���͵ı����������ʼֵΪ20
	    short b = 10; // ����һ��short���͵ı����������ʼֵΪ10
	    int c = 30; // ����һ��int���͵ı����������ʼֵΪ30
	    long d = 40; // ����һ��long���͵ı����������ʼֵΪ40
	    long sum = a + b + c + d;
	    System.out.println("sum=" + sum);
	    
	    float price1 = 12.2f; // ����float���Ͳ������ֵ
		double price2 = 12.254d; // ����double���͵ı����������ֵ
		double price3 = 12.254; // ����double���͵ı����������ֵ
	    System.out.println(price1);
	    System.out.println(price3);
	    System.out.println(price2);	//Java Ĭ�ϵĸ�����Ϊ double
	    
	    
	    double lutu = 2348.4; // ���� double ���͵ı��������ڴ洢���̾���
	    int num = 2; // ���� int ���͵ı��������ڴ洢����
	    float total = (float)lutu*num; // ���� float ���͵ı��������ڴ洢�ܾ���
	    System.out.println("���� AB ���ع���Ҫ��ʻ��" + total + " ��");
	    
	    boolean isable;    // ���� boolean ���͵ı��� isable
	    boolean l = false;    // ���� boolean ���͵ı��� a���������ֵΪ false
	    
	    String letter = "h";	//�������ַ����������� char �͸�ֵ
	    char numChar = '5';
	    
	    char ac = 'A';    // �� char ���͵� a ������ֵΪ A������Ӧ�� ASCII ֵΪ 65
	    char bc = 'B';    // �� char ���͵� b ������ֵΪ B������Ӧ�� ASCII ֵΪ 66
	    System.out.println("A �� ASCII ֵ�� B �� ASCII ֵ��ӽ��Ϊ��"+(ac+bc));
	    
	}

}
