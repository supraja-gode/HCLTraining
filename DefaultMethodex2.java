package JavaFeatures;
interface TestInterface
{
	public void square(int a);
	default void show()
	{
		System.out.println("Default Method executed");
	}
}
public class DefaultMethodex2 implements TestInterface{
	public void square(int a)
	{
		System.out.println(a*a);
	}
	public static void main(String []args)
	{
		DefaultMethodex2 df=new DefaultMethodex2();
		df.square(5);
		df.show();
	}
}
