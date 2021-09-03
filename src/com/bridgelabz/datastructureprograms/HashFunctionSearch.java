package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.datastructures.Node;
import com.bridgelabz.datastructures.SortedLinkedList;

public class HashFunctionSearch {
	public static void main(String[] args) {
		SortedLinkedList<Integer>[] linkedLists = new SortedLinkedList[11];
		for(int index=0;index<11;index++) {
			linkedLists[index] = new SortedLinkedList<Integer>();
		}
		String input = "47 37 24 26 40";
		String numbers[] = input.split(" ");
		for(int i=0;i<numbers.length;i++) {
			int number = Integer.parseInt(numbers[i]);
			int index = getIndex(number);
			linkedLists[index].add(new Node(number));
		}
		
		printArrays(linkedLists);
		
		System.out.println("Enter number to search:");
		Scanner scanner = new Scanner(System.in);
		int key = Integer.parseInt(scanner.nextLine());
		int keyIndex = getIndex(key);
		if(linkedLists[keyIndex].search(key)!=null) {
			linkedLists[keyIndex].deleteNode(key);
			printArrays(linkedLists);
		} else {
			linkedLists[keyIndex].add(new Node(key));
			linkedLists[keyIndex].printList();
			printArrays(linkedLists);
		}
	}
	
	public static void printArrays(SortedLinkedList<Integer>[] linkedLists) {
		for(int i=0;i<11;i++) {
			System.out.print(i+" --> ");
			linkedLists[i].printList();
		}
	}
	
	public static int getIndex(int number) {
		return number%11;
	}
}
