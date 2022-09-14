package Constructor;

public class ParameterizedCnstructor {
  
	int a;
	String name;
	
	public ParameterizedCnstructor(int a1,String name1)
	{
	  a=a1;
	  name=name1;
	  System.out.println("my number is"+a);
	  System.out.println("my name is"+ name);
	}

	public static void main(String[] args) {
		
		ParameterizedCnstructor obj=new ParameterizedCnstructor(25,"GAJARAJAN");
		
	}

}
