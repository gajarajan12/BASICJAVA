package Arrays;

public class JaggedArray {

	public static void main(String[] args) 
	{
   int arr[][]=new int [3][];
   
   arr[0]=new int[4];
   arr[2]=new int[5];
   arr[1]=new int[6];
   
   int count=3;
   
   for(int a=0;a<arr.length;a++)
   { 
	   for(int b=0;b<arr[a].length;b++)
		   
	   {
		   arr[a][b]=count;
	   }
   }
		   
   for(int a=0;a<arr.length;a++)	
   { 
	   for(int b=0;b<arr[a].length;b++)
	   {
		 System.out.print(arr[a][b]+" "); 
	   }
	   System.out.println();
		   
		   
	   }
   }
		
		
		
	  }

