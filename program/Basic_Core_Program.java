package com.bridgelab.program;

import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Basic_Core_Program {
	public static void main(String[] args) {

		Utility utility = new Utility();		
		boolean exit=false;

		do{
			//User Menu
			System.out.println("1. FLIP COIN AND CALCULATE PERCENTAGE OF HEAD & TAIL");
			System.out.println("2. LEAP YEAR");
			System.out.println("3. POWER OF 2");
			System.out.println("4. HARMONIC NUMBER");
			System.out.println("5. PRIME FACTORS");
			System.out.println("6. COMPUTE QUOTIENT AND REMAINDER");
			System.out.println("7. SWAP TWO NUMBERS");
			System.out.println("8. CHECK WHETHER A NUMBER IS EVEN OR ODD");
			System.out.println("9. CHECK WHETHER AN ALPHABET IS VOWEL OR CONSONANT");
			System.out.println("10. FIND LARGEST AMONG THREE NUMBERS");
			System.out.println("11. EXIT");
			System.out.println("Slect Program to Run From Above: ");
			//call method using object
			int select = utility.getIntValue();
			//taking menu option from the user to pass to switch
			if( select > 0 && select <= 11)
			{
				switch(select)
				{
				case 1://flip coin
					System.out.println("Enter the number of coin toss: ");
					int numberOfFlips = utility.getIntValue();
					utility.flipCoinPercent(numberOfFlips);
					break;

				case 2://leap year
					Scanner yr = new Scanner(System.in);
					System.out.println("Enter the year value: ");
					int year = yr.nextInt();
					utility.checkLeapYear(year);
					break;

				case 3:
					System.out.println("Enter power value of 2: ");
					int powerValue = utility.getIntValue();
					utility.powerOfTwo(powerValue);
					break;

				case 4:
					System.out.println("Enter the number to check the Harmonic number:");
					int number = utility.getIntValue();
					utility.getHarmonicNumber(number);
					break;

				case 5:
					System.out.println("Enter the number to find Prime Factors: ");
					int num = utility.getIntValue();
					utility.primeFactor(num);
					break;

				case 6:
					System.out.println("Computing Quotient And Remainder\n");
					System.out.println("Enter the Dividend: ");
					int dividend = utility.getIntValue();
					System.out.println("Enter the Divisor:");
					int divisor = utility.getIntValue();
					utility.quotientRemainder(dividend,divisor);
					break;

				case 7:
					System.out.println("Enter value of 1st number: ");
					int number1 = utility.getIntValue();
					System.out.println("Enter value of 2nd number: ");
					int number2 = utility.getIntValue();
					utility.swapNumbers(number1,number2);
					break;

				case 8:
					System.out.println("Enter the number to check if its Even or Odd:  ");
					int number3 = utility.getIntValue();
					utility.evenOdd(number3);
					break;

				case 9:
					System.out.println("Enter the Alphabet : ");
					char alphabet = utility.getCharValue();
					utility.alphabetConsonant(alphabet);
					break;

				case 10:
					System.out.println("Enter value of 1st number: ");
					int num1 = utility.getIntValue();
					System.out.println("Enter value of 2nd number: ");
					int num2 = utility.getIntValue();
					System.out.println("Enter value of 3rd number:  ");
					int num3 = utility.getIntValue();
					utility.largestNumber(num1,num2,num3);
					break;

				case 11:
					exit=true;
					System.out.println("EXIT");
					break;

				}//switch

			}//if
			else {
				System.out.println("Enter Valid Option\n");
			}
		}while(!exit);

	}
}
