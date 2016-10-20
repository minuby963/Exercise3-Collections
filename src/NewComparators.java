import java.util.Comparator;

public class NewComparators{
	static Comparator<Integer> reverseOrder(){
		Comparator<Integer> cmp= new ReverseOrderComparator(); 
		return cmp;
	}
	static Comparator<Integer> oddEvenOrder(){
		Comparator<Integer> cmp= new OddEvenOrderComparator(); 
		return cmp;
	}
}
