package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int track = 0;
		for (String word : eggs) {
			if (word.equals("cracked")) {
				return track;
			}
			track++;
		}
		return -1;
	}

	public static int countPearls(List<Boolean> clams) {
		int count = 0;
		for (Boolean b : clams) {
			if (b == true) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> heights) {
		double hold = 0.0;
		for (double d : heights) {
			if (d > hold) {
				hold = d;
			}
		}
		return hold;
	}

	public static String findLongestWord(List<String> words) {
		String output = "";
		for (String s : words) {
			if (s.length() > output.length()) {
				output = s;
			}
		}
		return output;
	}

	public static boolean containsSOS(List<String> morse) {
		for (String s : morse) {
			if (s.equals(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}

	public static ArrayList<Double> sortScores(List<Double> scores) {
		ArrayList<Double> alist = new ArrayList<Double>();
		boolean swap = false;
		double holder = 0;
		for (double d : scores) {
			alist.add(d);
		}
		for (int i = 1; i < alist.size(); i++) {
			if (alist.get(i - 1) > alist.get(i)) {
				holder = alist.get(i - 1);
				alist.set(i - 1, alist.get(i));
				alist.set(i, holder);
				swap = true;
			}
		}
		List<Double> newList = Arrays.asList(new Double[alist.size()]);
		for (int i = 0; i < alist.size(); i++) {
			newList.add(i, alist.get(i));
		}
		if (swap == true) {
			sortScores(newList);
		}
		return alist;
	}

}