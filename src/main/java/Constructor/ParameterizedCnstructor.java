package Constructor;

public class ParameterizedCnstructor {
    int a;
    String name;
	public ParameterizedCnstructor(int a,String name)
	{
		this.a=a;
		this.name=name;
		System.out.println("my value is -"+a);
		System.out.println("my real name is -"+name);
	}
	
	
	public static void main(String[] args)
	{
		ParameterizedCnstructor obj=new ParameterizedCnstructor(1,"gajarajan");
		

	}

}
