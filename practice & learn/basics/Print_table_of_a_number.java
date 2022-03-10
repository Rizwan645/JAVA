import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter a number : ");
	    int a = sc.nextInt();
	    System.out.print("Table of ");
	     System.out.println(a);
	    for (int i=1;i<=10;i++){
	        System.out.print(a); 
	        System.out.print("*");
	        System.out.print(i);
	        System.out.print(" = ");
	        System.out.println(a*i);
	    } 
		
	}
}
