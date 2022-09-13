package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class NewUpdates {

	public static void main(String[] args) 
	{
	String[]games= {"volleyball","hockey","basketball","cricket"};
	System.out.println("before updating");
	System.out.println(Arrays.toString(games));
	
	Scanner scan=new Scanner(System.in);
	System.out.println("tell me which position will be change");
	int pos=scan.nextInt();
	
	System.out.println("enter the new names.");
	String name=scan.next();
   
	games[pos]=name;
	System.out.println("after updating");
	System.out.println(Arrays.toString(games));
    
	
	
	
		

	}

	}

