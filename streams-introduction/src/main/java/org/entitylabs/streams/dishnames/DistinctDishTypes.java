package org.entitylabs.streams.dishnames;

import java.util.stream.Collectors;

import org.entitylabs.streams.dish.DishProvider;

public class DistinctDishTypes {

	public static void main(String[] args) {

		var collectedDishes = DishProvider.getDishes().stream().filter(dish -> dish.getCalories() < 400)
				.map(dish -> dish.getType()).distinct().collect(Collectors.toList());

		System.out.println(collectedDishes);
	}
}
