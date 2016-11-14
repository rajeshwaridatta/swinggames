package rajeshwari.codes.inheritance;
import java.util.List;



public class SortDupFinder extends BaseDupFinder {

	@Override
	protected boolean checkDup(List<Integer> numberList, int i) {
		if (numberList.get(i).equals(numberList.get(i+1))) {
			return true;
		}
		return false;
	}
}