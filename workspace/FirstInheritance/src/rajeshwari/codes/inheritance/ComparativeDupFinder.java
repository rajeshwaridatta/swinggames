package rajeshwari.codes.inheritance;
import java.util.List;



public class ComparativeDupFinder extends BaseDupFinder {

	@Override
	protected boolean checkDup(List<Integer> numberList, int i) {
		for (int j = 0; j< numberList.size(); j++) {
			if (numberList.get(i).equals(numberList.get(j))) {
				return true;
			}
		}
		return false;
	}	
}