package JavaFeatures;
interface inter
{
	default void feature()
	{
		System.out.println("This is Default method");
	}
}
public class DefaultMethodex implements inter {
	public static void main(String args[])
	{
		DefaultMethodex dm=new DefaultMethodex();
		dm.feature();
	}
}
