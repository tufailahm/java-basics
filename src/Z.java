class X
{
	public X() {
		System.out.println("6.X constructor");
	}
	{
		System.out.println("5.X instance block");
	}
}
class W {
	public W() {
		System.out.println("4.W constructor");
	}
}
public class Z {
	
	W w = new W();
	X x = new X();
	{
		System.out.println("7. W instance block");
	}
	static {
		System.out.println("1.static block-1");
	}
	static {
		System.out.println("2.static block-2");
	}

	public Z() {
		System.out.println("8.Z constructor");
	}

	public static void main(String args[]) {
		System.out.println("3.In main");
		Z z1 = new Z();
		System.out.println("9. Main ended");
	}
}
