package assignment.forth;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingShuffle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("no argument is entered");
		}
		List<String> list = Arrays.asList(args);
		Collections.shuffle(list);
		System.out.println("The shuffled list are : ");
		for(String s : list){
			System.out.println(s);
		}
	}

}
