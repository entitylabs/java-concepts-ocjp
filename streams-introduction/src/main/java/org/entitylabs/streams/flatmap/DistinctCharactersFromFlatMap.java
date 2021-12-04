package org.entitylabs.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.entitylabs.streams.dish.DishProvider;

public class DistinctCharactersFromFlatMap {

	public static void main(String[] args) {
		
		List<String> distinctCharacters=DishProvider.getDishes().stream()
		.map(dish-> dish.getName().split(("")))
		.flatMap(Arrays::stream)
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println(distinctCharacters);
		
		
		
		List<int[]> pairs= Arrays.asList(1,2,3).stream().flatMap(element1-> Arrays.asList(3,4).stream()
				.filter(element2-> (element1+ element2)%3==0)
				.map(element2-> new int[] {element1, element2}))
		.collect(Collectors.toList());
		
		pairs.forEach(pair-> System.out.println("["+ pair[0]+ ","+ pair[1]+ "]"));
	}
}
