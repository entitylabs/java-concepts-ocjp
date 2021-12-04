package org.entitylabs.streams.find;

import java.util.Optional;

import org.entitylabs.commons.Dish;
import org.entitylabs.streams.dish.DishProvider;

public class FindFirstParallel {

	public static void main(String[] args) {
		Optional<Dish> dishFound = DishProvider.getDishes().parallelStream().filter(dish -> dish.getCalories() > 300)
				.findFirst();

		System.out.println(dishFound.get().getName());
	}
}
