package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.datastructures.DEQueue;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = scanner.nextLine();
		if(isPalindrome(input.toLowerCase())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
	
	public static boolean isPalindrome(String string) {
		DEQueue<Character> queue = new DEQueue();
		for(int index=0;index < string.length();index++) {
			queue.enQueue(string.charAt(index));
		}
		StringBuilder builder = new StringBuilder();
		for(int index=0;index<string.length();index++) {
			builder.append((char)(queue.deQueueReverse()));
		}
		String result = builder.toString();
		return result.equals(string);
	}
}
