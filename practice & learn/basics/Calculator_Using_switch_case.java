import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter 1st number: ");
	    int a = sc.nextInt();
	    System.out.print("Enter 2nd number: ");
	    int b = sc.nextInt();
	    System.out.println("INPUT YOUR OPERATIONS");
	    System.out.println("   1 for addition");
	    System.out.println("   2 for substration");
	    System.out.println("   3 for multiplication");
	    System.out.println("   4 for division");
	    System.out.print("Input your operations: ");
	    int c= sc.nextInt();
	   
	    switch(c){
	        case 1: System.out.print("Ans = ");
	                System.out.print(a+b);
	        break;
	        case 2: System.out.print("Ans = ");
	                System.out.print(a-b);
	        break;
	        case 3: System.out.print("Ans = ");
	                System.out.print(a*b);
	        break;
	        case 4 :System.out.print("Ans = ");
	                System.out.print(a/b);
	        break;
	       default: System.out.print("Invalid operations");
	    }
	}
}
