package org.entitylabs.streams.takewhile;

import org.entitylabs.streams.dish.DishProvider;

public class TakeWhileSequential {

	public static void main(String[] args) {
		
		Long startTime = System.currentTimeMillis();

		DishProvider.getDishes().stream().takeWhile(dish -> {

			System.out.println("Testing for first take while dish match: " + dish.getName());
			return dish.getCalories() < 300;
		}).forEach(dish-> System.out.println("Terminal operation-->"+dish.getName()));

		Long endTime = System.currentTimeMillis();

		System.out.println("Total time take while sequential operation " + (endTime - startTime));
		
	}
}
  