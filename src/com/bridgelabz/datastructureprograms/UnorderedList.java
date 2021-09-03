package com.bridgelabz.datastructureprograms;

import com.bridgelabz.datastructures.*;
import java.util.Scanner;

public class UnorderedList {
	public static void main(String[] args) {
		String sentence = "This is a test sentence";
		String[] words = sentence.toLowerCase().split(" ");
		LinkedList<String> wordList = new LinkedList<>();
		for(String word : words) {
			wordList.append(new Node<String>(word));
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word to search");
		String word = scanner.next();
		wordList.printList();
		
		if(wordList.search(word)==null) {
			wordList.append(new Node(word));
			wordList.printList();
		} else {
			wordList.deleteNode(word);
			wordList.printList();
		}
	}
}
