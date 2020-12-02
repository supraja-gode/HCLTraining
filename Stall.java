package overloading;
import java.util.Scanner;

public class Stall {
protected String name;
protected String detail;
protected String ownerName;
Stall(String name,String detail,String owner){
    this.name = name;
    this.detail = detail;
    this.ownerName = owner;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getDetail() {
    return detail;
}
public void setDetail(String detail) {
    this.detail = detail;
}
public String getOwnerName() {
    return ownerName;
}
public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
}
public Double computeCost(String stallType,Integer squareFeet) {
    double d = 0;
    if(stallType.equals("Platinum")) {
        d = 200*squareFeet;
    }
    else if(stallType.equals("Diamond")) {
        d = 150*squareFeet;
    }
    else if(stallType.equals("Gold")) {
        d = 100*squareFeet;
    }
    return d;
}
public Double computeCost(String stallType,Integer squareFeet,Integer numberOfTV) {
    double d = 0;
    if(stallType.equals("Platinum")) {
        d = (200*squareFeet)+(numberOfTV*10000);
    }
    else if(stallType.equals("Diamond")) {
        d = (150*squareFeet)+(numberOfTV*10000);
    }
    else if(stallType.equals("Gold")) {
        d = (100*squareFeet)+(numberOfTV*10000);
    }
    return d;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of stall");
    String a = sc.nextLine();
    System.out.println("Enter the details of stall");
    String b = sc.nextLine();
    System.out.println("Enter the owner");
    String c = sc.nextLine();
    System.out.println("Enter stallType");
    String type = sc.nextLine();
    System.out.println("Enter size of stall");
    int size = Integer.parseInt(sc.nextLine());
    System.out.println("Does have TV(y/n)?");
    String TV = sc.nextLine();
    System.out.println("Enter number of TV");
    int noTV = Integer.parseInt(sc.nextLine());
    double cost=0;
    Stall st = new Stall(a,b,c);
    if(TV.equals("y")) {
    cost = st.computeCost(type, size, noTV);
    }
    else if(TV.equals("n")) {
    cost = st.computeCost(type, size);
    }
    System.out.println("The cost of stall is "+ cost);
}
}
