package collections12;
import java.util.Comparator;
public class EmailComparator implements Comparator<SearchUser>{

	@Override
	public int compare(SearchUser o1, SearchUser o2) {
		// TODO Auto-generated method stub
		return o1.getEmail().compareTo(o2.getEmail());
	}
	
}
