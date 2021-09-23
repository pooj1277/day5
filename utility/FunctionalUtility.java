package com.bridgelab.utility;

import java.io.PrintWriter;
import java.util.Scanner;

public class FunctionalUtility {
	//create scanner object
	Scanner scanner ;
	public FunctionalUtility()
	{
		scanner = new Scanner(System.in);
		System.out.println("");
	}

	public int getIntValue() {

		return scanner.nextInt();
	}

	public double getDoubleValue() {

		return scanner.nextDouble();
	}

	private Boolean getBooleanValue() {			
		return scanner.nextBoolean();
	}
	public Integer[][] getInt2DArray(int m, int n) {

		Integer [][] array = new Integer[m][n];
		System.out.println("Entre:"+(m*n)+"Integer value in integer array");
		for(int i=0; i<m; i++)
		{
			for(int j=0 ; j < n; j++)
			{
				array [i][j] = getIntValue();
			}
		}
		return array;
	}

	//<t> generic method i.e all datatypes are accepted
	public <t> void printArray(t[][] array, int m, int n) {
		// TODO Auto-generated method stub
		PrintWriter writer = new PrintWriter(System.out);
		for (int i=0; i<m; i++){
			for (int j=0; j<n; j++) {
				writer.write(" arr[" + i + "][" + j + "] = "+array[i][j]);
				writer.flush();
			}
			System.out.println();
		}  
	}
	public Double[][] getDouble2DArray(int m, int n) {
		Double [][] array1 = new Double[m][n];
		System.out.println("Entre:"+(m*n)+"double value in integer array");
		for(int i=0; i<m; i++)
		{
			for(int j=0 ; j < n; j++)
			{
				array1 [i][j] = getDoubleValue();
			}
		}
		return array1;
	}
	public Boolean[][] boolean2DArray(int m, int n) {
		Boolean [][] array2 = new Boolean[m][n];
		System.out.println("Entre:"+(m*n)+"boolean value in integer array");
		for(int i=0; i<m; i++)
		{
			for(int j=0 ; j < n; j++)
			{
				array2 [i][j] = getBooleanValue();
			}
		}
		return array2;
	}

	public int[] getArray(int N) {
		int[] array =new int[N];
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<N; i++)  
		{			 
			array[i]=scanner.nextInt();  
		}  
		System.out.println("Array elements are: ");			  
		for (int i=0; i<N; i++)   
		{  
			System.out.println(array[i]);  
		}  
		return array;
	}

	public void getSumOfInt(int[] array, int n) {
		boolean found = false;
		System.out.println("Three Integers Which Adds To Zero Are");
		for (int i=0; i<n-2; i++)
		{
			for (int j=i+1; j<n-1; j++)
			{
				for (int k=j+1; k<n; k++)
				{
					if (array[i]+array[j]+array[k] == 0)
					{
						System.out.print(" ["+array[i]+ " , " +array[j]+ ","+array[k] +"]");
						found = true;
					}
				}
			}
		}
		// If no triplet with 0 sum found in array
		if (found == false)
			System.out.println(" Three Integers Which Adds To Zero Does not exist ");

	}

	public void euclideanDistance(int x, int y) {
		int N=2;
		double powerX = Math.pow(N, x);
		double powerY = Math.pow(N, y);
		double distance = Math.sqrt(powerX + powerY);
		System.out.println("Euclidian Distance from point ("+x+","+y+") to the origin is "+distance);

	}

	public void quadraticRoots(double a, double b, double c) {
		double delta= b * b - 4.0 * a * c;  
		if (delta> 0.0)   
		{  
		double root1 = (-b + Math.sqrt(delta)) / (2.0 * a);  
		double root2 = (-b - Math.sqrt(delta)) / (2.0 * a);  
		System.out.println("The roots are:");
		System.out.println("Root 1 of x = "+ root1 + " \n Root 2 of x = " + root2);  
		}			
	}
}

