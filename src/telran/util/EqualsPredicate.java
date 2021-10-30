package telran.util;

import java.util.function.Predicate;

public class EqualsPredicate<T> implements Predicate<T> {
	private T pattern;

	public EqualsPredicate(T pattern) {
		this.pattern = pattern;
	}

	@Override
	public boolean test(T t) {
		
		return t.equals(pattern);
	}

}