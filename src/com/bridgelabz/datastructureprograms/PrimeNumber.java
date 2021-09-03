package com.bridgelabz.datastructureprograms;

public class PrimeNumber {
	public static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] primeNumbers = new int[10][100];
		for (int number = 2; number <= 1000; number++) {
			if (isPrime(number)) {
				primeNumbers[number/100][number%100] = number;
			}
		}
		
		printNumbers(primeNumbers);
	}
	
	public static void printNumbers(int[][] primeNumbers) {
		for(int i=0;i<primeNumbers.length;i++) {
			for(int j=0;j<primeNumbers[0].length;j++) {
				if(primeNumbers[i][j]!=0) {
					System.out.print(primeNumbers[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
