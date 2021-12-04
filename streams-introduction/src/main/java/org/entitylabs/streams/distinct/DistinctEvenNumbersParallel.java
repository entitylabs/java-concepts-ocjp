package org.entitylabs.streams.distinct;

import java.util.Arrays;

public class DistinctEvenNumbersParallel {

	public static void main(String[] args) {
		
		Long startTimeParallel= System.currentTimeMillis();
		Arrays.asList(12,22,12,23,3,3,4,5,6,7,8,6,5,4,3,5,6,3,21,3,3,45)
		.parallelStream().filter(num-> {
			System.out.println("Filtering-->"+num);
			return num%2==0;
					})
		.distinct()
		.forEach(System.out::println);
		
		Long endTimeParallel= System.currentTimeMillis();
		
		System.out.println("Total time parallel operation "+ (endTimeParallel - startTimeParallel));
	}
}
