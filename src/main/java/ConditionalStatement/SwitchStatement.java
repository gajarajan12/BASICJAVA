package ConditionalStatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		{System.out.println("Please enter any one digit number");}
		String names=scan.nextLine();
		switch(names)
		{
		case"volleyball":
		System.out.println("you choose option 'One'"); 
		break;
		case"kabaddi":
			System.out.println("You choose option 'Two'");
			break;
		case"hockey":
			System.out.println("You choose option 'Three'");
			break;
			
		default:System.out.println("No more value is here");	
	}
		
	}

}
