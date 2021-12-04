package org.entitylabs.streams.dishnames;

import java.util.stream.Collectors;

import org.entitylabs.streams.dish.DishProvider;

public class TerminalOperations {

	public static void main(String[] args) {
		DishProvider.getDishes().stream().filter(dish -> {

			System.out.println("Intermediate operation Filtering dish:" + dish.getName());
			return dish.getCalories() < 400;
		}).map(dish ->

		{
			System.out.println("Intermediate operation Mapping dish:" + dish.getName());
			return dish.getName();

		}).limit(3).collect(Collectors.toList());

		DishProvider.getDishes().stream().filter(dish -> {

			System.out.println("Intermediate operation Filtering dish:" + dish.getName());
			return dish.getCalories() < 400;
		}).map(dish ->

		{
			System.out.println("Intermediate operation Mapping dish:" + dish.getName());
			return dish.getName();

		}).limit(3).forEach(dish -> System.out.println(dish));

		DishProvider.getDishes().stream().filter(dish -> {

			System.out.println("Intermediate operation Filtering dish:" + dish.getName());
			return dish.getCalories() < 400;
		}).map(dish ->

		{
			System.out.println("Intermediate operation Mapping dish:" + dish.getName());
			return dish.getName();

		}).limit(3).count();
	}
}
