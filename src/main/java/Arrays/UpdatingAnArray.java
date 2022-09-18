package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class UpdatingAnArray {

	public static void main(String[] args)
	
{
  String[]namess= {"ramasamy","jaya","iniyaranjani","gajarajan"};
  System.out.println("before updating");
  System.out.println(Arrays.toString(namess));
	
   Scanner scan=new Scanner(System.in);
   System.out.println("which position you will be change");
   int pos=scan.nextInt();
   System.out.println("enter a new names");
   String name=scan.next();
  
   namess[pos]=name;
   System.out.println("after updating");
   System.out.println(Arrays.toString(namess));
}



}
