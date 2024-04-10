/*Program1:Q.Write a JAVA program consists of 10 to 15 lines to print 1 to 10 no. & find out given no. is even or odd (give any integer no. from outside)*/
package program1;

import java.util.Scanner;
class Print1to10
{
	//Processing Part & Output Part
	void print()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(" "+i);
		}
	}
}

class OddEven             //main class
{
	public static void main(String args[])
	{
		//Declaration Part
		int n;
		
		//Input Part
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		n=sc.nextInt();
		
		//Processing Part
		Print1to10 obj=new Print1to10();
		obj.print();                  //1 to 10 print
		if(n%2==0)
		{
			System.out.println("Given no. is Even Number.....!");
		}
		else
		{
			System.out.println("Given no. is Odd Number.....!\"");
		}
	}
}

