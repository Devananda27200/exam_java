import java.util.*;
import java.io.*;

class shape
{
	public static void main(String[] args)
	{
		int a,l,b,r,s,c;
		Shapes obj1=new Shapes();
		Shapes obj2=new Shapes();
		Shapes obj3=new Shapes();
		System.out.println("enter length and breadth:");
		Scanner sc1=new Scanner(System.in);
		l=sc1.nextInt();
		b=sc1.nextInt();
		System.out.println("rectangle:");
		obj1.rectangle(l,b);
		System.out.println("enter side of square:");
		Scanner sc2=new Scanner(System.in);
		a=sc2.nextInt();
		System.out.println("Square:");
		obj2.square(a);
		System.out.println("enter radius of circle:");
		Scanner sc3=new Scanner(System.in);
		r=sc3.nextInt();
		System.out.println("Circle:");
		obj3.circle(r);
	}
}

class Shapes
{

 void rectangle(int l,int b)
 {
 	int r;
 	
 	
 	r=2*(l+b);
 	System.out.println(""+r);
 	
 }	
 void square(int a)
 {
 	int s;
 	
 	s=4*a;
 	System.out.println(""+s);
 	
 }
 void circle(int r)
 {
 	double c;
 	
 	
 	c=2*3.14*r;
 	System.out.println(""+c);
 	
 }
}

