package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class InsertingAnArray {

	public static void main(String[] args) 
	{
		int [] demo=new int[10];
		
//		demo[1]=100;
//		demo[2]=200;
//		demo[3]=300;
//		demo[4]=400;
//		demo[5]=500;
//		demo[6]=600;
//		demo[8]=800;
//		demo[9]=1000;
//		demo[0]=800;
		//System.out.println(Arrays.toString(demo));
		
		Scanner scan=new Scanner(System.in);
		
	for(int i=0;i<demo.length;i+=1)
	{
		System.out.println("number is");
		demo[i]=scan.nextInt();
	}
	
	for(int Lokesh:demo)
	{
		System.out.println(Lokesh);
	
	}
	

		
		
		
	}

}

