package ConditionalStatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		{System.out.println("Please enter any one digit number");}
		String name=scan.nextLine();
		switch(name)
		{
		case"1":
		System.out.println("you choose option 'One'"); 
		break;
		case"2":
			System.out.println("You choose option 'Two'");
			break;
		case"3":
			System.out.println("You choose option 'Three'");
			break;
			
		default:System.out.println("No more value is here");	
	}
		
	}

}
