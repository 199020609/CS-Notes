package variable_scope;

public class Test {
	public static void main(String args[]) {
		 // ������Ķ���
		DataClass d1 = new DataClass();
		// ������.����������ʵ��������ȫ�ֱ�����
		System.out.println(d1.name);
		System.out.println(d1.age);
		
		// ������.���������þ�̬�������������
        System.out.println(d1.website);
        System.out.println(d1.URL);
        
        // ����.���������þ�̬�������������
        System.out.println(DataClass.website);
        System.out.println(DataClass.URL);
		
		
	}

}
