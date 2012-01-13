//******************************************************************************
// CashBallTest.java
// Java Programming Final driver class
// Liam Boyle
// CIS 149-57Z1
// 06 Dec 2011
// lboyle0004@kctcs.edu liampboyle@gmail.com
//******************************************************************************

public class CashBallTest
{
	public static void main(String[] args)
	{
		System.out.println("=============================="
				+" CashBall Lottery"+"==============================");
		System.out.println();
		System.out.println("Players pick four numbers from 1 to 33"+
		" called Cash Ball numbers.");
		System.out.println("These numbers must be unique from each other.");
		System.out.println();
		System.out.println("Players then pick a fifth number from 1 to 31"
				+" which is the 'Cash Ball' itself.");
		System.out.println("Kicker is a new feature which lets players get"
				+" in on an extra drawing.");
		System.out.println();
		
		CashBall test1 = new CashBall();
		test1.readInput();
		test1.writeOutput();
		test1.kicker();
	}

}
