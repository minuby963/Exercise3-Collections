import java.util.Comparator;


public class OddEvenOrderComparator implements Comparator<Integer> {
	
	@Override
	public int compare(Integer o1, Integer o2){
		System.out.print("compaering: o1: "+o1+" o2: "+o2+" ");
		int result = 0;
		if((o1%2 == 1) && (o2%2 == 1)){
			if(o1>o2)
				result = 1;
			else if(o1<o2)
				result = -1;
			else
				result = 0;
		}
		else if((o1%2 == 0) && (o2%2 == 0)){
			if(o1>o2)
				result = -1;
			else if(o1<o2)
				result = 1;
			else
				result = 0;
		}
		else if(o1%2 == 0){
			result = 1;
		}
		else{
			result = -1;
		}
		
		System.out.println("result: "+result);
		
		if(result == 1)
			return 1;
		else if(result == -1)
			return -1;
		else
			return 0;
	}



}
