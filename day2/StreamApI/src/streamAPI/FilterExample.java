package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
	public static void main(String[] args) {
		
//		---------1st Example------------
		
//		List <String> names=Arrays.asList("John","Niraj","Adam","Eve","Jacica");
//		List<String> filteredNames= names.stream()
//								.filter(name->name.startsWith("J") || name.startsWith("N"))
//								.map(String::toUpperCase)
//								.collect(Collectors.toList());
//		
//		System.out.println(filteredNames);
		
		
//		--------2nd Example------------	
		
//		System.out.println(Stream.of(1, 2, 3, 4, 5)
//				.filter(x -> x % 2 == 0)
//				.collect(Collectors.toList()));
		
		
//		--------3rd Example------------	
		
//		final List<Integer> list = new ArrayList<>(Arrays.asList(4,1, 1, 2, 2, 3));
//
//        final List<Integer> ans = list.stream()
//                .distinct()
//                .collect(Collectors.toList());
//
//        System.out.println("Distinct List: " + Arrays.toString(ans.toArray()));

		
//		-----------4th Example---------
		
//		 final List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//
//	        final List<Integer> ans = list.stream()
//	                .filter(value -> value % 2 == 0)
//	                .map(value -> {System.out.println("Filtered " + value);return value;})
//	                .peek(value -> System.out.println("Filtered " + value))
//	                .map(value -> value * 10)
//	                .collect(Collectors.toList());
//
//	        System.out.println(Arrays.toString(ans.toArray()));
	        
//		-----------5th Example---------
		 final List<Integer> list = new ArrayList<>(Arrays.asList(1, 7, 3, 4, 5));

	        final List<Integer> ans = list.stream()
	                .limit(3)
	                .collect(Collectors.toList());

	        System.out.println("Limited List: " + Arrays.toString(ans.toArray()));

		
		
	}

}
