package day_3;
import java.util.Scanner;
public class Atm_login_checker {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		int i;
		for(i=0;i<=3;i++)
		{
		System.out.println("enter the password");
		int n=s.nextInt();
		if(n==123)
			
			break;
	
		}
		
		System.out.println("password accepted");

	
		if(i==4)
			System.out.println("your card is blocked");
		
		
	}
	

}
