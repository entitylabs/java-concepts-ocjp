package org.entitylabs.streams.dishnames;

import java.util.stream.Collectors;

import org.entitylabs.commons.Dish;
import org.entitylabs.streams.dish.DishProvider;

/**
 * 
 * Streams are Declarative Composable Parallelizable
 * 
 * @author Sanyam Goel
 * @email sanyamgoyal007@gmail.com
 *
 */
public class DishNameFinder {

	public static void main(String[] args) {

		Long serialStreamStartTime = System.currentTimeMillis();

		DishProvider.getDishes().stream().filter(dish -> dish.getCalories() < 400).map(dish -> dish.getName())
				.collect(Collectors.toList());

		Long serialStreamEndTime = System.currentTimeMillis();
		System.out.println("Total procesing time serial stream: " + (serialStreamEndTime - serialStreamStartTime));

		Long parallelStreamStartTime = System.currentTimeMillis();

		DishProvider.getDishes().parallelStream().filter(dish -> dish.getCalories() < 400).map(dish -> dish.getName())
				.collect(Collectors.toList());

		Long parallelStreamEndTime = System.currentTimeMillis();

		System.out
				.println("Total procesing time parallel stream: " + (parallelStreamEndTime - parallelStreamStartTime));

		System.out.println(DishProvider.getDishes().parallelStream().collect(Collectors.groupingBy(Dish::getType)));
	}
}
