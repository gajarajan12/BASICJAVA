package Scanner;

import java.util.Scanner;

public class scannerdemos {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String name="Gajarajan";
	System.out.println("my name is "+name);
	String nameA=scan.nextLine();
	System.out.println("my self"+nameA);
	System.out.println("what is you age");
	int age=scan.nextInt();
	System.out.println("my age is "+age);
	System.out.println("tell me your mobile number");
	long number=scan.nextLong();
	System.out.println("my mobile number is "+number);
}

	}
