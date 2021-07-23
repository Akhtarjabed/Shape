package assignment3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Raduis of the Circle=");
		int r=sc.nextInt();
		System.out.print("\nEnter Length of the Rectangle=");
		int l=sc.nextInt();
		System.out.print("\nEnter Breadth of the Rectangle=");
		int b=sc.nextInt();
		System.out.print("\nEnter Side of the Square=");
		int s=sc.nextInt();
		
		
		circle c=new circle();
		c.carea(r);
		c.cperiphery(r);
		
		rectangle rect=new rectangle();
		rect.rarea(l,b);
		rect.rperiphery(l,b);
		
		square sq=new square();
		sq.area(s);
		sq.periphery(s);
	}

}
