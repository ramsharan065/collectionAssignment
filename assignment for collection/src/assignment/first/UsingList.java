package assignment.first;

import java.util.ArrayList;
import java.util.List;

public class UsingList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length<1){
			System.out.println("no argument is entered");
			return;
		}
		List<String> duplicateWords = new ArrayList<>();
		List<String> distinctWords = new ArrayList<>();
		for(String s:args){
			if(distinctWords.contains(s)){
				if(duplicateWords.contains(s)==false){
					duplicateWords.add(s);
				}
			}
			else{
				distinctWords.add(s);
			}
		}
		if(duplicateWords.size()>0){
		System.out.println("The duplicate words are : ");
		for(String s : duplicateWords){
			System.out.println(s);
		}
		}
		else{
			System.out.println("There is no duplicate word");
		}
		System.out.println("\nThe size of distinct words is : "+distinctWords.size());
		System.out.println("\nThe distinct words are : ");
		for(String s : distinctWords){
			System.out.println(s);
		}
	}
}
