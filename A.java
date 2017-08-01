
public interface A {
	void sum(int a,int b);
}
abstract class B{
	abstract void sum(int a,int b);
}
public class C extends B implements AABB{

	@Override
	public void sum(int a, int b) {
		System.out.println("hii");
	}
	public static void main(String[] args) {
		C c=new C();
		c.sum(1, 2);
System.out.println("hello");
	}
dhjfkdsh	
}