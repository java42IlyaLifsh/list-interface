package telran.util;

import java.util.function.Predicate;

public class RemoveRetainPredicate<T> implements Predicate<T> {

	private List<T> others;
	private boolean removeRetain;

	public RemoveRetainPredicate(List<T> others, boolean removeRetain) {
		this.others = others;
		this.removeRetain = removeRetain;
	}

	@Override
	public boolean test(T t) {
		if(removeRetain) {
			return !others.contains(t);
		}
		return others.contains(t);
	}
}