package playerdetails;
import java.util.*;
class PlayerDetails
{
public static void main(String[] s)
{
String name,country,skill;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the player name: ");
name=sc.nextLine();
System.out.println("Enter the country name: ");
country=sc.nextLine();
System.out.println("Enter the skill: ");
skill=sc.nextLine();
System.out.println("Player details: ");
System.out.println("Player Name: "+name);
System.out.println("Country Name: "+country);
System.out.println("Skill: "+skill);
}
}