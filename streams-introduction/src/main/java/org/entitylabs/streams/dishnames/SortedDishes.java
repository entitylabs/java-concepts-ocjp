package org.entitylabs.streams.dishnames;

import java.util.stream.Collectors;

import org.entitylabs.streams.dish.DishProvider;

public class SortedDishes {

	public static void main(String[] args) {

		DishProvider.getDishes().parallelStream().filter(dish -> {

			System.out.println("Intermediate operation Filtering dish:" + dish.getName());
			return dish.getCalories() < 400;
		}).map(dish ->

		{
			System.out.println("Intermediate operation Mapping dish:" + dish.getName());
			return dish.getName();

		}).sorted((dish1, dish2) -> {

			System.out.println("Intermediate operation Sorting dish:" + dish1);
			return dish1.compareTo(dish2);

		}).map(dish -> {
			System.out.println("Stream replayed: " + dish);
			return dish;
		}).collect(Collectors.toList());

	}
}
