package assignment.fifth;

import java.util.LinkedList;
import java.util.List;

public class UsingLinkList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> one = new LinkedList<>();
		List<String> two = new LinkedList<>();
		//adding values to LinkedList one and two
		one.add("one");
		one.add("two");
		one.add("three");
		one.add("four");
		one.add("five");
		two.add("six");
		two.add("seven");
		two.add("eight");
		two.add("nine");
		two.add("ten");
		printListOne(one);
		printListTwo(two);
		//adding words from two to one
		one.addAll(two);
		System.out.println("After adding words from two to one");
		printListOne(one);
		printListTwo(two);
		//Remove every second word from two means
		//removing every words from two other than first
		while(true){
			try{
				two.remove(1);
			}catch(IndexOutOfBoundsException e){
				break;
			}
		}
		System.out.println("After removing every words from LinkedList 'two' other than first");
		printListOne(one);
		printListTwo(two);
		//removing words from one which are in two
		one.removeAll(two);
		System.out.println("After removing words from LinkedList 'one' which are in LinkedList 'two'");
		printListOne(one);
		printListTwo(two);
		
	}
	private static void printListOne(final List<String> list){
		System.out.println("The words in LinkedList 'one' are : ");
		for(String s : list){
			System.out.println(s);
		}
	}
	private static void printListTwo(final List<String> list){
		System.out.println("The words in LinkedList 'two' are : ");
		for(String s : list){
			System.out.println(s);
		}
	}
}
