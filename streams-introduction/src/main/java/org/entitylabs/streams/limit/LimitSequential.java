package org.entitylabs.streams.limit;

import org.entitylabs.streams.dish.DishProvider;

public class LimitSequential {

	public static void main(String[] args) {
		
		Long startTime = System.currentTimeMillis();

		DishProvider.getDishes().stream().filter(dish -> {

			System.out.println("Sequential filter: " + dish.getName());
			return dish.getCalories() > 500;
		})
		.limit(2)
		.forEach(dish-> System.out.println(dish.getName()));

		Long endTime = System.currentTimeMillis();

		System.out.println("Total time limit sequential operation " + (endTime - startTime));
		
	}
}
