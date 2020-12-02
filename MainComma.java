package stringwithcomma;
import java.util.*;
public class MainComma {
	public static void main(String[] args)
	{
		String name;
		String country;
		String skill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player details: ");
		name=sc.nextLine();
		System.out.println("Player Details:");
		String Str[]=name.split(",");
		System.out.println("Name: "+Str[0]);
		System.out.println("Country: "+Str[1]);
		System.out.println("Skill: "+Str[2]);
		
	}
}
