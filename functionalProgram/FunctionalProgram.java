package com.bridgelabz.functionalProgram;

import com.bridgelab.utility.FunctionalUtility;

public class FunctionalProgram {
	public static void main(String[] args) {
		//create object of FunctionalUtility class
		FunctionalUtility functionalutilty = new FunctionalUtility();
		int m=0, n=0, select;		
		boolean exit=false;
		do {
			//User Menu
			System.out.println("\n1. 2D Array");
			System.out.println("2. Sum Of Three Integer Adds To Zero");
			System.out.println("3. Calculate Euclidean Distance");
			System.out.println("4. Quadratic");
			System.out.println("5. Wind Chill");
			System.out.println("6. Exit");
			System.out.println("Slect Program to Run From Above: ");
			//call method using object
			select = functionalutilty.getIntValue();
			//taking menu option from the user to pass to switch
			if( select > 0 && select <= 5)
			{
				switch(select)
				{
				case 1:
					System.out.println("Enter the number of columns in array: ");
					m = functionalutilty.getIntValue();

					System.out.println("Enter the number of rows in array: ");
					n = functionalutilty.getIntValue();
					System.out.println("\n _________________________");

					System.out.println("1. Int 2-D Array");
					System.out.println("2. Double 2-D Array");
					System.out.println("3. Boolean 2-D Array");
					System.out.println("Slect Type of Array From Above: ");
					select = functionalutilty.getIntValue();
					//taking menu option from the user to pass to switch
					if( select > 0 && select <= 3)
					{						
						switch(select)
						{
						case 1:

							//Integer is the wrapper class
							Integer [][] array = functionalutilty.getInt2DArray(m,n);
							functionalutilty.printArray(array,m,n);
							break;

						case 2:
							Double [][] array1 = functionalutilty.getDouble2DArray(m,n);
							functionalutilty.printArray(array1,m,n);
							break;

						case 3:
							Boolean [][] array2 = functionalutilty.boolean2DArray(m,n);
							functionalutilty.printArray(array2,m,n);
							break;
						}
					}	
					break;

				case 2:
					System.out.print("Enter the number of elements you want to store in array: ");
					int N = functionalutilty.getIntValue();
					int [] array = functionalutilty.getArray(N);
					functionalutilty.getSumOfInt(array,N);
					break;

				case 3:
					//calculating Euclidean distance using distance=sqrt(x*x + y*y)
					System.out.println("Enter value of 1st number: ");
					int x = functionalutilty.getIntValue();
					System.out.println("Enter value of 2nd number: ");
					int y = functionalutilty.getIntValue();
					functionalutilty.euclideanDistance(x,y);
					break;

				case 4:
					System.out.println("Enter value of 1st number: ");
					double a = functionalutilty.getIntValue();
					System.out.println("Enter value of 2nd number: ");
					double b = functionalutilty.getIntValue();
					System.out.println("Enter value of 3rd number:  ");
					double c = functionalutilty.getIntValue();
					functionalutilty.quadraticRoots(a,b,c);
					break;

				case 5:
					System.out.println("In progress...");
					break;
					
				case 6:
					exit=true;
					System.out.println("EXIT");
					break;
				}//switch

			}//if
			else
			{
				System.out.println("Invalid Selection");
			}
		}while(!exit);
	}
}
