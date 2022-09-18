package Arrays;
import java.util.Arrays;
public class BubbleSorting {
	
	public void bubble(int[]arr1)
	{
	 for (int i=0;i<arr1.length;i++)
	 {
		 for (int j=0;j<arr1.length-i-1;j++)
		 {
			 if(arr1[j]>arr1[j+1])
			 {
				 int swap= arr1[j];
				 arr1[j]=arr1[j+1];
				 arr1[j+1]=swap;
			 }
		 }
	 }
	}

	public static void main(String[] args)
	{
		int arr []= {6,4,1,8,2};
		Arrays.sort(arr);
     	System.out.println(Arrays.toString(arr));
		BubbleSorting obj=new BubbleSorting();
		obj.bubble(arr);
        System.out.println("After change the value:"+Arrays.toString(arr));
        
        
	}

}
