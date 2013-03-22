package assignment.sixth;

import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=49;i++){
			list.add(new Integer(i));
		}
		Collections.shuffle(list);
		ArrayList<Integer> sublist = new ArrayList<>(list.subList(0, 6));
		Collections.sort(sublist);
		System.out.println("The final results are : ");
		for(Integer i : sublist){
			System.out.println(i);
		}
	}

}
