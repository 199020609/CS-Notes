package variable_scope;

public class Test {
	public static void main(String args[]) {
		 // 创建类的对象
		DataClass d1 = new DataClass();
		// 对象名.变量名调用实例变量（全局变量）
		System.out.println(d1.name);
		System.out.println(d1.age);
		
		// 对象名.变量名调用静态变量（类变量）
        System.out.println(d1.website);
        System.out.println(d1.URL);
        
        // 类名.变量名调用静态变量（类变量）
        System.out.println(DataClass.website);
        System.out.println(DataClass.URL);
		
		
	}

}
