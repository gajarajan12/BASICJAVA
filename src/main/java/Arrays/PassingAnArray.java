package Arrays;

import java.util.Arrays;

public class PassingAnArray 
{
	public void PassingArray(double[] salary1)
	{
		salary1[3]=12222.7;
		salary1[0]=999999.9;
		System.out.println(Arrays.toString(salary1));
	}
	/*public void PassingArray2(String name1)
	{
		System.out.println("Welocme");
	}*/
	
	public static void main(String[] args) 
	{
		
		double[] salary= {12.3,5.6,4.3,3.2,2.4};
		PassingAnArray pass=new PassingAnArray();
		pass.PassingArray(salary);
		
		
	}

}