package Type;

public class test {
	
	
	
	public static void main(String[] args) {
	    byte a = 20; // 声明一个byte类型的变量并赋予初始值为20
	    short b = 10; // 声明一个short类型的变量并赋予初始值为10
	    int c = 30; // 声明一个int类型的变量并赋予初始值为30
	    long d = 40; // 声明一个long类型的变量并赋予初始值为40
	    long sum = a + b + c + d;
	    System.out.println("sum=" + sum);
	    
	    float price1 = 12.2f; // 定义float类型并赋予初值
		double price2 = 12.254d; // 定义double类型的变量并赋予初值
		double price3 = 12.254; // 定义double类型的变量并赋予初值
	    System.out.println(price1);
	    System.out.println(price3);
	    System.out.println(price2);	//Java 默认的浮点型为 double
	    
	    
	    double lutu = 2348.4; // 定义 double 类型的变量，用于存储单程距离
	    int num = 2; // 定义 int 类型的变量，用于存储次数
	    float total = (float)lutu*num; // 定义 float 类型的变量，用于存储总距离
	    System.out.println("往返 AB 两地共需要行驶：" + total + " 米");
	    
	    boolean isable;    // 声明 boolean 类型的变量 isable
	    boolean l = false;    // 声明 boolean 类型的变量 a，并赋予初值为 false
	    
	    String letter = "h";	//单引号字符或者整数对 char 型赋值
	    char numChar = '5';
	    
	    char ac = 'A';    // 向 char 类型的 a 变量赋值为 A，所对应的 ASCII 值为 65
	    char bc = 'B';    // 向 char 类型的 b 变量赋值为 B，所对应的 ASCII 值为 66
	    System.out.println("A 的 ASCII 值与 B 的 ASCII 值相加结果为："+(ac+bc));
	    
	}

}
