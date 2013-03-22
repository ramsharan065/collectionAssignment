package assignment.first;

import java.util.HashSet;
import java.util.Set;

public class UsingHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 1) {
			System.out.println("no argument is entered");
			return;
		}
		Set<String> duplicateWords = new HashSet<>();
		Set<String> distinctWords = new HashSet<>();
		for (String s : args) {
			if (distinctWords.add(s) == false) {
				duplicateWords.add(s);
			}
		}
		if (duplicateWords.size() >0) {
			System.out.println("The duplicate words are : ");
			for (String s : duplicateWords) {
				System.out.println(s);
			}
		}
		else {
			System.out.println("There is no duplicate word");
		}
		System.out.printf("\nThe number of distinct words are : %d\n",
				distinctWords.size());
		System.out.println("\nThe distinct words are : ");
		for (String s : distinctWords) {
			System.out.println(s);
		}

	}

}
