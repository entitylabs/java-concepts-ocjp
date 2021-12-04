package org.entitylabs.streams.takewhile;

import org.entitylabs.streams.dish.DishProvider;

public class TakeWhileParallel {

	public static void main(String[] args) {

		Long startTime = System.currentTimeMillis();

		DishProvider.getDishes().parallelStream().takeWhile(dish -> {

			System.out.println("Testing for condition until dish match but in parallel: " + dish.getName());
			return dish.getCalories() > 500;
		}).forEach(dish-> System.out.println("Terminal operation-->"+dish.getName()));

		Long endTime = System.currentTimeMillis();

		System.out.println("Total time take while parallel operation " + (endTime - startTime));

	}
}
