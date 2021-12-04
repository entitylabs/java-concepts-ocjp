package org.entitylabs.streams.dish;

import java.util.List;

import org.entitylabs.commons.Dish;
import org.entitylabs.commons.Type;

public class DishProvider {

	public static List<Dish> getDishes() {

		return List.of(Dish.builder().calories(250).name("pork").vegetarian(false).type(Type.MEAT).build(),
				Dish.builder().calories(700).name("beef").vegetarian(false).type(Type.MEAT).build(),
				Dish.builder().calories(400).name("chicken").vegetarian(false).type(Type.MEAT).build(),
				Dish.builder().calories(530).name("french fries").vegetarian(true).type(Type.OTHER).build(),
				Dish.builder().calories(350).name("rice").vegetarian(true).type(Type.OTHER).build(),
				Dish.builder().calories(120).name("season fruit").vegetarian(true).type(Type.OTHER).build(),
				Dish.builder().calories(550).name("pizza").vegetarian(true).type(Type.OTHER).build(),
				Dish.builder().calories(300).name("prawns").vegetarian(false).type(Type.FISH).build(),
				Dish.builder().calories(450).name("salmon").vegetarian(false).type(Type.FISH).build());
	}
}
