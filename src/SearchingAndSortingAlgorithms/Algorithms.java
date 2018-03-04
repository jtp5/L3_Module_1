package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
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
		boolean swap = true;
		double holder = 0;
		for (double d : scores) {
			alist.add(d);
		}
		while (swap) {
			swap = false;
			for (int i = 1; i < alist.size(); i++) {
				if (alist.get(i - 1) > alist.get(i)) {
					holder = alist.get(i - 1);
					alist.set(i - 1, alist.get(i));
					alist.set(i, holder);
					swap = true;
				}
			}
		}

		return alist;
	}

	public static List<String> sortDNA(List<String> list) {
		String holder = "";
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i - 1).length() > list.get(i).length()) {
					holder = list.get(i - 1);
					list.set(i - 1, list.get(i));
					list.set(i, holder);
					swap = true;
				}
			}
		}
		return list;
	}

	public static List<String> sortWords(List<String> words) {
		String holder = "";
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 1; i < words.size(); i++) {
				if (words.get(i - 1).charAt(0) > words.get(i).charAt(0)) {
					holder = words.get(i - 1);
					words.set(i - 1, words.get(i));
					words.set(i, holder);
					swap = true;
				}
			}
		}

		int track = 0;
		boolean swap2 = true;
		while (swap2) {
			swap2 = false;
			for (int i = 1; i < words.size(); i++) {
				if (words.get(i - 1).charAt(0) == words.get(i).charAt(0)) {
					if (words.get(i - 1).charAt(1) > words.get(i).charAt(1)) {
						holder = words.get(i - 1);
						words.set(i - 1, words.get(i));
						words.set(i, holder);
						swap2 = true;
					}
				}
			}
			track++;
			if (track == words.size()) {
				swap2 = false;
			}
		}

		int track2 = 0;
		boolean swap3 = true;
		while (swap3) {
			swap3 = false;
			for (int i = 1; i < words.size(); i++) {
				if (words.get(i - 1).charAt(1) > words.get(i).charAt(1)) {
					if (words.get(i - 1).charAt(2) > words.get(i).charAt(2)) {
						holder = words.get(i - 1);
						words.set(i - 1, words.get(i));
						words.set(i, holder);
						swap3 = true;
					}
				}
			}
			track2++;
			if (track2 == words.size()) {
				swap3 = false;
			}
		}

		return words;
	}

}