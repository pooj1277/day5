package com.bridgelab.utility;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Utility {
	//create scanner object
	Scanner scanner ;
	public Utility(){
		scanner = new Scanner(System.in);
		System.out.println("");
	}

	public int getIntValue() {

		return scanner.nextInt();
	}

	public char getCharValue() {
		return scanner.next().charAt(0);		
	}

	//FLIP COIN AND CALCULATE PERCENTAGE OF HEAD AND TAIL
	public void flipCoinPercent(int numberOfFlips) {		
		double head = 0 , tail = 0, headPercent=0;
		for(int i=0; i<numberOfFlips; i++){
			double side=Math.random();
			if(side>0.5)
			{
				head++;
			}
			else
			{
				tail++;
			}
			headPercent=head*100/numberOfFlips;
			System.out.println("Flip " +(i+1));
			System.out.println("Percentage of head = "+headPercent);

			System.out.println("Percentage of tail = "+(100-headPercent) + " \n");
		}
	}

	//TO CHECK LEAP YEAR
	public void checkLeapYear(int year)	{
		if (year % 4 == 0 && year % 400 == 0 || year % 100 ==0) {
			System.out.println("It is leap year");
		}
		else {
			System.out.println("It is not a leap year");
		}

	}

	//HARMONIC NUMBER
	public void getHarmonicNumber(int number)
	{
		double harmonicNumber = 0;
		for(double i=1; i<=number;i++){
			harmonicNumber = harmonicNumber + (1/i);
		}
		//return harmonicNumber;
		System.out.println("n'th Harmonic Number of " +number + " = " +harmonicNumber);
	}

	//POWER OF 2
	public void powerOfTwo(int powerValue) {
		int N=2;		
		if(0<=powerValue && powerValue<31) {
			System.out.println("The power of 2 upto 2^"+powerValue);
			for(int i=0;i<=powerValue;i++) {
				double power = Math.pow(N, i); 
				System.out.println("2^"+i +"= " +power);
			}
		}
		else {
			System.out.println("Please enter power value greater than zero and smaller than 31");
		}

	}

	public void primeFactor(int num) {
		List primeFactors = new ArrayList();
		for(int i=2;i<=num;i++) {
			while(num%i==0) {
				primeFactors.add(i);
				num=num/i;
			}

		}
		System.out.println("Prime Factors of "+num+ " are "+primeFactors );
	}

	public void quotientRemainder(int dividend, int divisor) {
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("Quotient = "+quotient);
		System.out.println("Remainder = "+remainder);
	}

	public void swapNumbers(int number1, int number2) {
		System.out.println("Before Swapping Numbers "+number1 + " , " +number2);
		int temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("After Swapping Numbers "+number1 + " , " +number2);

	}

	public void evenOdd(int number3) {
		if (number3 % 2 == 0) {
			System.out.println("The Entered Number "+number3+" Is Even ");
		} else {
			System.out.println("The Entered Number "+number3+" Is Odd");

		}

	}

	public void alphabetConsonant(char alphabet) {
		if( alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o'|| alphabet == 'u' ) {
			System.out.println("Entered Alphabet "+alphabet+ " Is a Vowel");
		}
		else{
			System.out.println("Entered Alphabet "+alphabet+ " Is a Consonant");
		}

	}

	public void largestNumber(int number1, int number2, int number3) {
		int temp, largest;
		temp = number1>number2 ? number1:number2;
		largest = number3>temp ? number3:temp;
		System.out.println("The Largest Of Three Numbers "+number1 +" , " + number2+ " , " +number3 +" Is: " +largest);
	}




}
