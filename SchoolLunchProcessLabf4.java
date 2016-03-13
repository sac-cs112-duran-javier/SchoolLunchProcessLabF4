import java.util.Scanner;

public class SchoolLunchProcessLabf4 {
	public static void main (String[]args) 
	{
		Scanner input = new Scanner(System.in);
		int thirsty;
		int breakfast;
		
	System.out.println("You are hungry");
	System.out.println("You get in line");
	System.out.println("You decide to buy lunch");
	System.out.println("Are you thirsty? (yes=1,no=2) : ");

	thirsty = input.nextInt();
	if (thirsty ==1)
	{
		if(thirsty ==1)
		{
			System.out.println("Did you have breakfast (yes=1, no=2):");
			breakfast = input.nextInt();
			
			if (breakfast==1)
		System.out.println("You are thirsty and you buy a diet coke for yourself");
	if (breakfast ==2)
		System.out.println("You had breakfast and you will buy a coke");
	}
	}
	else if (thirsty==2)
		
		System.out.println("You only get a water");
	System.out.println("You eat your lunch.");
	System.out.println("You return your tray");
	System.out.println("You leave the area");
	}
}
