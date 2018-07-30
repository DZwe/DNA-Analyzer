 //*************************************************
//          GCContentCalc.java
//
//    Author: Zwe Phone Shein & Tyler Riedal
//
//             October 20, 2014
//
//  Calculates the %G-C Content of a DNA sequence.
//*************************************************
import java.util.Scanner;
import java.text.DecimalFormat;

public class GCContentCalc
{
	public static void main(String[] args)
	{
	    Scanner scan = new Scanner(System.in);
	    DecimalFormat roundToTwoDec = new DecimalFormat("0.00");

	    System.out.print("Enter a DNA sequence: ");
	    String dnaString = scan.next();

	    int totalA = countA(dnaString);
	    int totalT = countT(dnaString);
	    int totalC = countC(dnaString);
	    int totalG = countG(dnaString);
	    int totalBases = countBases(dnaString);

	    double gCContent = ((double) (totalC + totalG) / totalBases) * 100.0;

	    System.out.println("\nTotal A: " + totalA);
	    System.out.println("Total T: " + totalT);
	    System.out.println("Total G: " + totalG);
	    System.out.println("Total C: " + totalC);
	    System.out.println("Total Bases: " + totalBases);
	    System.out.println("%G~C content: " + roundToTwoDec.format(gCContent) + "%");

	    if (otherChar(dnaString))
	    {
	    	System.out.println("\nWARNING: This DNA sequence contains invalid characters!");
	    }

	    scan.close();
	}

	public static int countBases(String dnaString)
	{
		int total = 0;
		for (int i = 0; i < dnaString.length(); i++)
		{
			total++;
		}
		return total;
	}

	public static int countC(String dnaString)
	{
        int total = 0;
        for (int i = 0; i < dnaString.length(); i++)
        {
        	if (dnaString.charAt(i) == 'C')
        	{
        		total++;
        	}
        }
        return total;
	}

	public static int countG(String dnaString)
	{
        int total = 0;
        for (int i = 0; i < dnaString.length(); i++)
        {
        	if (dnaString.charAt(i) == 'G')
        	{
        		total++;
        	}
        }
        return total;
	}

	public static int countA(String dnaString)
	{
        int total = 0;
        for (int i = 0; i < dnaString.length(); i++)
        {
        	if (dnaString.charAt(i) == 'A')
        	{
        		total++;
        	}
        }
        return total;
	}

	public static int countT(String dnaString)
	{
        int total = 0;
        for (int i = 0; i < dnaString.length(); i++)
        {
        	if (dnaString.charAt(i) == 'T')
        	{
        		total++;
        	}
        }
        return total;
	}

	public static boolean otherChar(String dnaString)
	{
		boolean containsOtherChars = false;

			for (int i = 0; i < dnaString.length(); i++)
			{
				if ( !(Character.toUpperCase(dnaString.charAt(i)) == 'A' || Character.toUpperCase(dnaString.charAt(i)) == 'T' ||
							   Character.toUpperCase(dnaString.charAt(i)) == 'C' || Character.toUpperCase(dnaString.charAt(i)) == 'G') )
				{
					containsOtherChars = true;
				}
			}
		return containsOtherChars;
	}
}
