package JavaFeatures;
@FunctionalInterface
interface MyInterface
{
	public String greet();
}
public class LambdawithFunctionalinterface {
	public static void main(String ...s)
	{
		MyInterface msg=()->{
			return "Hello Good Morning";
		};
		System.out.println(msg.greet());
	}
}
