package datatypeconversion;

public class Test2 {
	public static void main(String args[]) {
	int a = 1;
	int b = 2;
	a += b; // 相当于 a = a + b
	System.out.println(a);
	a += b + 3; // 相当于 a = a + b + 3
	System.out.println(a);
	a -= b; // 相当于 a = a - b
	System.out.println(a);
	a *= b; // 相当于 a=a*b
	System.out.println(a);
	a /= b; // 相当于 a=a/b
	System.out.println(a);
	a %= b; // 相当于 a=a%b
	System.out.println(a);
	
	 	double price = 10.25; // 定义商品的单价，赋值为10.25
	    double total = 0; // 定义总价初始为0
	    int count = 2; // 定义购买数量，赋值为2
	    price -= 1.25; // 减去降价得到当前单价
	    count *= 5; // 现在需要购买10个，即原来数量的5倍
	    total = price * count; // 总价=当前单价*数量
	    System.out.printf("商品当前的单价为：%2.3f \n", price); // 输出当前单价
	    System.out.printf("购买商品的数量为：%d \n", count); // 输出购买数量
	    System.out.printf("总价为：%4.5f \n", total); // 输出总价
	}
}
