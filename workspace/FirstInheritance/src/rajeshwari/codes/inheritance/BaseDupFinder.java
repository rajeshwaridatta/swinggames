package rajeshwari.codes.inheritance;

import java.util.Collections;
import java.util.List;

public abstract class BaseDupFinder implements DupFinder {

	@Override
	public boolean dupPresent(List<Integer> numberList) {
		System.out.println("Inside class " + this.getClass().getName());
		Collections.sort(numberList);
		for (int i=0; i < numberList.size() - 1; i++) {
			boolean dupPresent = checkDup(numberList, i);
			if (dupPresent) {
				return true;
			}
		}
		return false;
	}

	protected abstract boolean checkDup(List<Integer> numberList, int i);
}
