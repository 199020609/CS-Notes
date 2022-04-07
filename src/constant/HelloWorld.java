package constant;
/**
 * 
 * @author LIUBIN
 *
 */
public class HelloWorld {

	// 静态常量
	public static final double PI = 3.14;
	// 声明成员常量
	final int y = 10;
	public static void main(String args[]) {
		// 声明局部常量
		final double x = 3.3;
//		x=1;	不能修改
		System.out.print("hello"+x);
	}
	
}
