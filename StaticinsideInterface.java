package JavaFeatures;
interface SInterface
{
	public static void sum(int a,int b)
	{
		System.out.println("The sum is:"+(a+b));
	}
}
public class StaticinsideInterface implements SInterface
{
	public static void main(String []args) {
		StaticinsideInterface si=new StaticinsideInterface();
		SInterface.sum(10, 20);
	}
}
