import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter an number: ");
	    int n = sc.nextInt();
	    if(n%2==0)
	    {
	        System.out.print(n);
	        System.out.println(" is a even number.");
	    }
	    else 
	    {
	        System.out.print(n);
	        System.out.println(" is odd number.");
	    }
	}
}
