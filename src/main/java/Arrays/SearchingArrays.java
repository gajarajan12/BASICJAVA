package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class SearchingArrays {

	public static void main(String[] args)
{
	String [] names= {"ramasamy","jaya","iniya","gaja"};
	Scanner scan=new Scanner(System.in);
	System.out.println("who is your fav person");
	System.out.println(Arrays.toString(names));
	
	String name=scan.nextLine();
	System.out.println("your fav person is"+name);
	
	for(int i=0;i<names.length;i++)
	{
		if(name.equalsIgnoreCase(names[i]))
		{  
	      System.out.println(name+"has founded");
	      return;
	     
		}
	}
	
	System.out.println(name+"has not founded");
	
	
	
	
}
}
	

