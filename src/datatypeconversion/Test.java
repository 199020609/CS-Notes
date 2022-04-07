package datatypeconversion;

public class Test {

	public static void main(String args[]) {
		/*
		 * “表达式中类型的自动提升”
		 */
		float price1=5.2f;	 // 定义牙膏的价格
		double price2=5.232;	 // 定义面巾纸的价格
		int num1=4;	 // 定义牙膏的数量
		int num2=8;	// 定义面巾纸的数量
		double res = price1*num1+price2*num2;	 // 计算总价
		System.out.println("一共给收银员"+ res + "元");					//输出总价
		
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
		    System.out.println("一共付给收银员" + res2 + "元");

		    
		    int p = 12;
		    System.out.println(-p);
		    
		    int l = p++;
		    System.out.println(l);
		    
		    l = ++p;
		    System.out.println(l);
		
	}
}
