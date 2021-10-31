package telran.util;

import java.util.function.Predicate;

public class EqualsPattern<T> implements Predicate<T> {
T pattern;

	public EqualsPattern(T pattern) {
	this.pattern = pattern;
}

	@Override
	public boolean test(T t) {
		
		return t.equals(pattern);
	}

}
