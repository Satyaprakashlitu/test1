import java.io.IOException;

public class CountChar {

	
	public static void main(String[] args) throws IOException {
		A a=new C();
		C c=(C)a;
		a.m1("satya"); 
		c.m2();
		Object o="java";
		A a1=new C();
		B b1=(B)a1;
		
		}


}
class A{
	public String m1(String s) throws IOException {
		System.out.println(s);
		return s;
	}
	
}
abstract class B extends A{
	public abstract String m1(String i);
}
class C extends B{

	@Override
	public String m1(String i)throws NullPointerException{
		System.out.println("hghjg");
		return null;
	}
	public void m2() {
		System.out.println("m2");
	}
	
}