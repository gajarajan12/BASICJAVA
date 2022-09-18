package Arrays;
import java.util.Arrays;
public class SelectionSorting {
	
	public void selectionProcess(int []arr1)
	{
	   for(int i=0;i<arr1.length;i++)
	   {
		  for(int j=0;j<arr1.length;j++)
		  {
			  if(arr1[i]<arr1[j])
			  {
				arr1[i]^=arr1[j];
				arr1[j]^=arr1[i];
				arr1[i]^=arr1[j];
			  }					  
	      }   
	   }
	}
	public static void main(String[] args)
	{
		
		int[] arr= {55,20,50,10,24};
		System.out.println(Arrays.toString(arr));
		SelectionSorting obj=new SelectionSorting();
		obj.selectionProcess(arr);
		System.out.println("after interchanging"+Arrays.toString(arr));
		
	}
       
}
