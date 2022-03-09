import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.print("Enter the radius: ");
	    int r = sc.nextInt();
	    double area =  (3.14*r*r);
		System.out.print("Area of the circle =");
		System.out.print(area);
	}
}
