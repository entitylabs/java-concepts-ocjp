package org.entitylabs.streams.reducer;

import java.util.List;
import java.util.Optional;

public class Summition {

	public static void main(String[] args) {
		
		
		int result=List.of(1,2,3,4,5,6,7,8,9).stream().mapToInt(num-> num).sum();
		System.out.println(result);
		
		int resultSum= List.of(1,2,3,4,5,6,7,8,9).stream().reduce(0, (a,b)-> a+b);
		System.out.println(resultSum);
		
		
		Optional<Integer> optionalInt= List.of(1,2,3,4,5,6,7,8,9).stream().reduce((a,b)-> a+b);
		System.out.println(optionalInt.get());
		
		
		int resultFact= List.of(1,2,3).stream().reduce(1, (a,b)-> a*b);
		System.out.println(resultFact);
		
		
		Optional<Integer> maxInt= List.of(1,2,3,4,5,6,7,8,9).stream().reduce((a,b)-> a>b?a:b);
		System.out.println(maxInt.get());
		
		Optional<Integer> maxIntInbuilt= List.of(1,2,3,4,5,6,7,8,9).stream().reduce(Integer::max);
		System.out.println(maxIntInbuilt.get());
		
	}
}
