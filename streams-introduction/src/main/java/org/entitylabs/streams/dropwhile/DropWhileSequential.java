package org.entitylabs.streams.dropwhile;

import org.entitylabs.streams.dish.DishProvider;

public class DropWhileSequential {

	public static void main(String[] args) {
		
		Long startTime = System.currentTimeMillis();

		DishProvider.getDishes().stream().dropWhile(dish -> {

			System.out.println("Testing for first drop dish match: " + dish.getName());
			return dish.getCalories() < 300;
		}).forEach(dish-> System.out.println(dish.getName()));

		Long endTime = System.currentTimeMillis();

		System.out.println("Total time drop while sequential operation " + (endTime - startTime));
		
	}
}
