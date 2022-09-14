package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SearchAndUpdate {

	public static void main(String[] args)
{
	/*String [] names= {"gaja","lokesh","livin","surya","vimal"};
	Scanner scan=new Scanner(System.in);
	System.out.println("tell me which is your fav person");
	System.out.println(Arrays.toString(names));
	
	String name=scan.next();
	System.out.println("your fav person is"+name);
	for(int i=0;i<names.length;i++)
	{
		if(name.equalsIgnoreCase(names[i]))
		{   
			
			System.out.println(name+"has founded");
			return;
		}
	}
	 System.out.println(name+"has no founded");
	
	
}
}*/
		
	String[] names= {"gaja","lokesh","naveen","gokul"};
		System.out.println("before update");
		System.out.println(Arrays.toString(names));
		
		Scanner scan=new Scanner(System.in);
		System.out.println("which position will be change");
		int pos=scan.nextInt();
		System.out.println("you choose"+pos );
		 String name=scan.next();
		 
		 names[pos]=name;
		 System.out.println("after update");
		 System.out.println(Arrays.toString(names));
		

}
}


