package Constructor;

 public class DefaultConstructor {
     
	 double d;
	 long l;
	 
	 public void DefaultConstructor()
	 {
		System.out.println(d);
		 System.out.println(l);
		 System.out.println("my real name is R.GAJARAJAN");
	 }
	 
	 public DefaultConstructor()
	 {
		 System.out.println(d);
		 System.out.println(l);
		 System.out.println("my real name is R.GAJARAJAN");
	 }
		 
	 
		public static void main(String[] args)
	{
		DefaultConstructor obj=new DefaultConstructor();
	}

}
