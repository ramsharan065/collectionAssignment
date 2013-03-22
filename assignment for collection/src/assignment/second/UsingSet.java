package assignment.second;

import java.util.HashSet;
import java.util.Set;

public class UsingSet {

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
		Set<String> occurOnlyOnce = distinctWords;
		distinctWords = null;
		occurOnlyOnce.removeAll(duplicateWords);
		if (occurOnlyOnce.size() > 0) {
			System.out.println("The words occuring only once are : ");
			for (String s : occurOnlyOnce) {
				System.out.println(s);
			}
		} else {
			System.out.println("No words are occuring only once.");
		}
		if (duplicateWords.size() > 0) {
			System.out.println("\nThe duplicate words are : ");
			for(String s : duplicateWords){
				System.out.println(s);
			}
		}
		else{
			System.out.println("\nNo words are duplicate.");
		}
	}

}
