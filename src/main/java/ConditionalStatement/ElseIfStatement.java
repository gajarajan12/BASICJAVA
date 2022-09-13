package ConditionalStatement;

public class ElseIfStatement {
	public static void main(String[] args) {
		
	String state="tamilnadu";
	int a=100;
	int b=1000;
	
	if(state=="andrapradesh")
	{
      System.out.println("this is my state");
	}
	else if(state!="tamilnadu")
	{
	System.out.println("is this my state"+state);
	}
	else if (a>=b)
	{
		System.out.println("a is lesser than b");
	}
	else if (a==b)
	{
		System.out.println("this is equal value");
	}
	else 
	{
		System.out.println("no one value is corrected ");
	}
	}
}
