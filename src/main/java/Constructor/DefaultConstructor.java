package Constructor;

public class DefaultConstructor {
   
	int a;
	String name;
	
	public void DefaultConstructor()
	{
		System.out.println("my name is GAJARAJAN");	
	}
	public DefaultConstructor()
	{
		System.out.println(a);
		System.out.println(name);
		System.out.println("My name is Gajarajan");
	}
	public static void main(String[] args)
	{
		DefaultConstructor obj=new DefaultConstructor();
		
	}

}
