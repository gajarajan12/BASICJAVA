package Arrays;
import java.util.Arrays;
public class SelectionSorting {
	public void SelectionProcess(int [] arr1)
	
	{
		for (int i=0;i<arr1.length;i++)
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
		
       int arr[]= {56,21,54,11,31};
       System.out.println(Arrays.toString(arr));
	   SelectionSorting obj=new SelectionSorting();
	   obj.SelectionProcess(arr);
	   System.out.println("after the sorting a array value"+Arrays.toString(arr));
		
		
	}

}
