package org.entitylabs.commons;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Dish {

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

}
