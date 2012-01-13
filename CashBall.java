//******************************************************************************
// CashBall.java
// Java Programming Final base class
// Liam Boyle
// CIS 149-57Z1
// 06 Dec 2011
// lboyle0004@kctcs.edu liampboyle@gmail.com
//******************************************************************************

import java.util.Scanner;

public class CashBall 
{
	//Class variable declarations
	private int lottoNum[] = new int [4];
	private int cashBallNum;
	private int kickerNum[] = new int [4];
	private int kickerBackNum;
	
	//Class methods
	
	//default constructor
	public CashBall()
	{
		for (int i=0; i<4; i++)
			lottoNum[i]=0;
	}
	
	//user I/O methods
	public void readInput()
	{
		//declare scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//declare input variables
		int inputNum[] = new int[4];
		int ballNum;
		
		//body of method
		for (int i=0; i<4; i++)
		{
			int dispNum = i+1;
			System.out.println("Please Enter Number For LottoCash Ball "
					+dispNum);
			inputNum[i] = keyboard.nextInt();
			
			//determine good input
			while (inputNum[i]<=0)
			{
				System.out.println("Numbers must be 1 or greater.");
				System.out.println("Please Enter Number For LottoCash Ball "
						+dispNum);
				inputNum[i] = keyboard.nextInt();
			}
			
			while (inputNum[i]>33)
			{
				System.out.println("Numbers cannot be greater than 33");
				System.out.println("Please Enter Number For LottoCash Ball "
						+dispNum);
				inputNum[i] = keyboard.nextInt();
			}
			
			//check for repeated numbers
			if(i>0) //no need to check if initial value is repeated
			{
				for(int j=0; j<i; j++)
				{
					while (inputNum[i]==inputNum[j])
					{
						System.out.println("Numbers must be unique,"
								+" no repeats");
						System.out.println("Please Enter Number For "
								+"LottoCash Ball "+dispNum);
						inputNum[i] = keyboard.nextInt();
					}
				}
			}
		}
		
		for (int i=0; i<4; i++)
		{
			lottoNum[i]=inputNum[i];
		}
		
		System.out.println("Please Enter a number between 1 and 31 "
				+"for a CashBall Number");
		ballNum = keyboard.nextInt();
		
		//determine good input
		while((ballNum<1)||(ballNum>31))
		{
			System.out.println("Number must be between 1 and 13");
			System.out.println("Please Enter a number between 1 and 31 "
					+"for a CashBall Number");
			ballNum = keyboard.nextInt();
		}
		cashBallNum = ballNum;
	}
	
	public void writeOutput()
	{
		System.out.println();
		System.out.print("Your CashBall numbers are: ");
		for(int i=0;i<4;i++)
			System.out.print(lottoNum[i]+" ");
		System.out.print(" CashBall: "+cashBallNum);
		System.out.println();
	}
	
	public void kickerWriteOutput()
	{
		System.out.println();
		System.out.print("Your kicker numbers are: ");
		for(int i=0;i<4;i++)
			System.out.print(kickerNum[i]+" ");
		System.out.print("Kicker: "+kickerBackNum);
		System.out.println();
	}
	
	//other class methods
	public void kicker()
	{
		//declare scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//declare method variable
		char kickerAns;
		
		//initialize int array
		for(int i=0; i<4; i++)
		{
			kickerNum[i]=0;
		}
		
		//method body
		System.out.println();
		System.out.println("Do you want Kicker? enter 'Y' or 'y' for yes or "
				+"any other character for no.");
		System.out.println("The first four numbers are from separate sets of "
				+"0 to 9 "+"and the fifth number is from a set of 0 to 4");
		System.out.println("Please enter Y or N");
		kickerAns = keyboard.next().charAt(0);
		if (kickerAns=='y'||kickerAns=='Y')
		{
			for(int i=0; i<4; i++)
				kickerNum[i]=(int)(10.0*Math.random());
			kickerBack();
			kickerWriteOutput();
		}
		else
			System.out.println("Kicker option declined.");
	}
	
	public void kickerBack()
	{
		kickerBackNum = (int)(5.0*Math.random());
	}
}
