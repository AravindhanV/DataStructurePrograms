package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.datastructures.SortedLinkedList;
import com.bridgelabz.datastructures.Node;

public class OrderedList {
	public static void main(String[] args) {
		String input = "47 37 24 26 40";
		String[] numbers = input.toLowerCase().split(" ");
		SortedLinkedList<Integer> numberList = new SortedLinkedList<>();
		for(String number : numbers) {
			numberList.add(new Node<Integer>(Integer.parseInt(number)));
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to search");
		int number = scanner.nextInt();
		numberList.printList();
		
		if(numberList.search(number)==null) {
			numberList.add(new Node<Integer>(number));
			numberList.printList();
		} else {
			numberList.deleteNode(number);
			numberList.printList();
		}
	}
}
