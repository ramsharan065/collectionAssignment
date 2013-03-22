package assignment.third;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("no argument is entered");
		}
		List<String> list = new ArrayList<>();
		for (String s : args) {
			list.add(s);
		}
		Collections.shuffle(list);
		System.out.println("The shuffled list are : ");
		for (String s : list) {
			System.out.println(s);
		}
	}

}
