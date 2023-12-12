package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApiAddingUsingReduce {
	public static void main(String[] args) {
		
//		-------1st--------------------
		
//		 final List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//
//	        final int ans = list.stream().reduce(0, (value, sum) -> sum += value);
//
//	        System.out.println("Sum: " + ans);
	        
//	        --------2nd -------------------
	        final List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//			list.parallelStream().forEach(System.out::println);
	        final int ans = list.stream().reduce(0, (sum, value) ->{ System.out.println("value "+value+" sum "+sum);sum += value;return sum;});

			 
			 System.out.println("ANS "+ans);
			 
	}

}
