import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter a number: ");
	    int a = sc.nextInt();
	    switch(a){
	        case 1: System.out.println("hi");
	        break;
	        case 2: System.out.println("hello");
	        break;
	        case 3: System.out.println("namaste");
	        break;
	        default : System.out.println("Invalid");
	    }
	}
}
