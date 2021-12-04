package org.entitylabs.streams.match;

import org.entitylabs.commons.Type;
import org.entitylabs.streams.dish.DishProvider;

public class MatchOperations {

	public static void main(String[] args) {

		boolean anyMatch = DishProvider.getDishes().stream().anyMatch(dish -> dish.getType() == Type.MEAT);

		System.out.println(anyMatch);

		boolean allMatch = DishProvider.getDishes().stream().allMatch(dish -> dish.getType() == Type.MEAT);

		System.out.println(allMatch);

		boolean noneMatch = DishProvider.getDishes().stream().noneMatch(dish -> dish.getType() == Type.MEAT);

		System.out.println(noneMatch);
	}
}
