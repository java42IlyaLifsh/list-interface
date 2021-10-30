package telran.util;

import java.util.Comparator;

public class ComparatorStr implements Comparator<String> {
	@Override
	public int compare(String str1, String str2) {
		
		return str1.compareTo(str2);
	}
}
