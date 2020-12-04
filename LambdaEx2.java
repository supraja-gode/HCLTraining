package JavaFeatures;
interface Example
{
	public void sum(int a,int b);
}
public class LambdaEx2{
	public static void main(String []args)
	{
		Example e=(a,b)->System.out.println("The sum is "+(a+b));
		e.sum(5, 10);
	}
}
