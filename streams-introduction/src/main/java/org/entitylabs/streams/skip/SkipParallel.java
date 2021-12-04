package org.entitylabs.streams.skip;

import org.entitylabs.streams.dish.DishProvider;

public class SkipParallel {

	public static void main(String[] args) {

		Long startTime = System.currentTimeMillis();

		DishProvider.getDishes().parallelStream().filter(dish -> {

			System.out.println("Filter in parallel: " + dish.getName());
			return dish.getCalories() > 500;
		})
		.skip(2)
		.forEach(dish-> System.out.println(dish.getName()));

		Long endTime = System.currentTimeMillis();

		System.out.println("Total time skip parallel operation " + (endTime - startTime));

	}
}
