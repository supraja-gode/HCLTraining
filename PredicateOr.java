package JavaFeatures;

import java.util.function.Predicate;

public class PredicateOr {
	public static Predicate<String> ex=new Predicate<String>() {
		@Override
		public boolean test(String t)
		{
			return t.length()>10;
		}
	};
	public static void predicate_or()
	{
		Predicate<String> word=p->p.contains("A");
		String wordwithA="And";
		boolean output=ex.or(word).test(wordwithA);
		System.out.println(output);
	}
	public static void main(String []args)
	{
		predicate_or();
	}
}