package org.entitylabs.streams.distinct;

import java.util.Arrays;

public class DistinctEvenNumbersSequential {

	public static void main(String[] args) {
		
		Long startTime= System.currentTimeMillis();
		Arrays.asList(1,2,2,2,3,3,4,5,6,7,8,6,5,4,3,5,6,3,21,3,3,45)
		.stream().filter(num-> {
			System.out.println("Filtering-->"+num);
			return num%2==0;
					})
		.distinct()
		.forEach(System.out::println);
		
		Long endTime= System.currentTimeMillis();
		
		System.out.println("Total time sequental operation "+ (endTime - startTime));
		
	}
}
