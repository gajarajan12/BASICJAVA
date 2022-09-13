package ConditionalStatement;

import java.util.Scanner;

public class AllJava

{ public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Welcome to Gaja enterprises");
	System.out.println("tell me which type of phones you need");
	String usage=scan.nextLine();
	switch(usage)
	{ 
	case"iphone":
		System.out.println("you choose iphone is currently available");
		System.out.println("please choose how much amount you need");
		int price=scan.nextInt();
		if(price>30000&&price<90000)
		{
			System.out.println(price+"of is 5,6,7,8,10 phone is available ");
			String model=scan.next();
			switch(model)
			{
			case"5": 
				System.out.println("you choose iphone 5 is best security");
			break;
			case"6":
				System.out.println("you choose iphone 6 is best feautures");
			break;
			case"7":
				System.out.println("yopu choose iphone 7 is best dimensions");
			break;
			
				}
		}
		
	break;
	
	case"vivo":
		System.out.println("you choose vivo phone is currently available");
	    System.out.println("which amount of gadjets you need price");
	    int amount=scan.nextInt();
	    if(amount>20000&&amount<60000)
	    {
	    	System.out.println("you choose this amount you are(4gbram+16memory)");
	    System.out.println("tell me which model you need");
	    String model=scan.next();
	    switch(model)
	    {case"y30":
	    	System.out.println("you choose vivoy30");
	    	break;
	    	
	    }
	    }
		
		
		
		break;
	
	
	
	case"oppo":
		System.out.println("you choose oppo phone is currently available");
	break;
	
	case"samsung":
		System.out.println("you choose samsung phone is currently unavailable");
	break;
		
	default:System.out.println(" no stock ");
	}

}
}



