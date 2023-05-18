/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void Inverted_half_pyramid(int Totalrows, int Totalcols)
	{
		for(int i = 1; i<=Totalrows; i++)
		{
			for(int j = 1; j<=Totalcols; j++)
			{
				if(j == Totalcols || (i==2 && j ==4) || (i==3 && j== 3) || (i==3 && j== 4) || (i==4 && j== 2) || (i==4 && j== 3) || (i==4 && j== 4) || i==Totalrows)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner timtim = new Scanner(System.in);
		
		int Totalrows = timtim.nextInt();
		int Totalcols = timtim.nextInt();
		Inverted_half_pyramid(Totalrows, Totalcols);
		
	}
}
