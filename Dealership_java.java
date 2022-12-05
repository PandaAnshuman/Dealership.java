import java.util.Scanner;
public class Dealership_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To 'JAVA' Dealership Project In Java::");
		System.out.println("Type 'a' If You Want To Buy A Car :");
		System.out.println("Type 'b' If You Want To Sell A Car :");
		String opt = sc.nextLine();
		System.out.println("You Yove Choosen " + opt);
		switch (opt) {
		case "a" : System.out.println("Whats Your Budjet ?? :");
		int bud = sc.nextInt();
		if(bud>=10000) {
		System.out.println("Great ! We have A Nissan Alto !!!");
		
		System.out.println("Do you have Insurance ?? (yes or no)");
		sc.nextLine();
		String ins = sc.nextLine();
		System.out.println("Do YOu HAve License ? ? ");
		String lic = sc.nextLine();
		System.out.println("Whats Your Credit card Score :");
		int cs = sc.nextInt();
		if (ins.equals("yes") && lic.equals("yes") && cs>=500) {System.out.println("Great !! Having Pleasure to Deal with YOu ");
		}else {System.out.println("Sorry You Are Not Eligible....");}
		}
		else {System.out.println("\nWe Dont sell cars below $10000");}break;
		
		case "b" :System.out.println("\nNow Enter The details of the car you want sell :");
		System.out.println("\nWhat is the value of your car ??");
		int val = sc.nextInt();
		System.out.println("\nWhat is the price of the car ???");
		int pri = sc.nextInt();
		sc.close();
		if (val>pri && pri <30000) {System.out.println("\nGreat !! We Are Interested In Your Deal .\nFeeling Pleasure to deal with You");}
		else {System.out.println("\nSorry The Deal doesnt Seems good !!");}break;
		default : System.out.println("\nEnter 'a' or 'b' else it will be error");break;	}
	
	}

}
