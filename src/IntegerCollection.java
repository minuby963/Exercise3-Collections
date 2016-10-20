import java.util.*;

public class IntegerCollection {

	public static void main(String[] args) {
		List<Integer> ints  = new ArrayList<Integer>();
		ints.add(new Integer(1));
		ints.add(new Integer(2));
		ints.add(new Integer(5));
		ints.add(new Integer(4));
		ints.add(new Integer(3));
		ints.add(new Integer(7));
		ints.add(new Integer(11));
		ints.add(new Integer(52));
		ints.add(new Integer(5));
		ints.add(new Integer(31));
		System.out.println("Unsorted:");
		
		for(Integer i : ints){
			System.out.println("i: "+i);
		}

		Comparator<Integer> cmp1= NewComparators.reverseOrder();
		
		Collections.sort(ints, cmp1);

		System.out.println("\nReverse Order:");
		for(Integer i : ints){
			System.out.println("i: "+i);
		}
		
		Comparator<Integer> cmp2= NewComparators.oddEvenOrder();
		
		Collections.sort(ints, cmp2);

		System.out.println("\nOdd Even Order:");
		for(Integer i : ints){
			System.out.println("i: "+i);
		}
	}

}
