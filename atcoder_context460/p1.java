import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        //System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        while(num2 > 0)
	{
	   num2 = num1 % num2;
	   count++;
	}
        scanner.close();
	System.out.println(count);
    }
}
