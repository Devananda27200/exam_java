import java.util.*;
import java.io.*;

class Find
    {   
    	void find()
    	{
    	int sum=0,num,r;
    	//System.out.println("enter a number:");
    	Scanner sc=new Scanner(System.in);
    	num=sc.nextInt();
	while(num!=0)
		{
		r=num%10;
		if(r%2==0)
			{
			  sum=sum+num%10;
			}
		num=num/10;
		}
	 System.out.println("The sum of even digits are:"+sum);
	    
    	}
    }
class sum
{
public static void main(String[] args)
  { int sum=0,num,r;  
    Find obj=new Find();
    obj.find();
  }
}
