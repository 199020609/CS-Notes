package variable_scope;

public class Test4 {
    public static void test() {
        try {
            System.out.println("Hello!Exception!");
        } catch (Exception e) { // �쳣����飬����Ϊ Exception ����
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
    	Test4.test();
    	test();
    }
}