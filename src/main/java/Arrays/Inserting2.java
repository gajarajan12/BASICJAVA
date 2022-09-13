package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Inserting2
{

	public static void main(String[] args)
	{
     int[]value=new int [20];
     value[2]=100;
     value[3]=200;
     value[4]=400;
     {  
      System.out.println(Arrays.toString(value));
     }
    
     Scanner scan=new Scanner(System.in);
   for (int gaja=0;gaja<value.length;gaja+=1)
   {
	   System.out.println("enter one digit value");
	   value[gaja]=scan.nextInt();
	   
   }
		
       
		
	}
}


