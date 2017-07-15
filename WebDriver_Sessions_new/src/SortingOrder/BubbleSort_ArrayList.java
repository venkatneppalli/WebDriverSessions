package SortingOrder;

import java.util.*;

public class BubbleSort_ArrayList {
	public static void main(String args[]) {

		ArrayList<String> arr = new ArrayList<String>();

		arr.add("C");

		arr.add("D");

		arr.add("A");

		arr.add("R");

		arr.add("S");

		arr.add("O");

		for (int j = 0; j < arr.size(); j++) {

			for (int i = j + 1; i < arr.size(); i++) {

				if ((arr.get(i)).compareToIgnoreCase(arr.get(j)) < 0) {

					String t = arr.get(j);

					arr.set( j, arr.get(i));


					


				}

			}

			System.out.println(arr.get(j));

		}

	}

}
