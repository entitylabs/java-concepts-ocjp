package org.entitylabs.streams.find;

import java.util.Optional;

import org.entitylabs.commons.Dish;
import org.entitylabs.streams.dish.DishProvider;

public class FindAnySequential {

	public static void main(String[] args) {
		
		Optional<Dish> dishFound=DishProvider.getDishes().stream().filter(dish-> dish.getCalories()>300)
		.findAny();
		
		System.out.println(dishFound.get().getName());
	}
}
