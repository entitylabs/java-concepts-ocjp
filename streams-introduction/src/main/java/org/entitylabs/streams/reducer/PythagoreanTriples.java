package org.entitylabs.streams.reducer;

import java.util.EnumSet;
import java.util.stream.IntStream;

public class PythagoreanTriples {

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 100).boxed()
				.flatMap(num1 -> IntStream.range(1, 100).filter(num2 -> Math.sqrt(num2 * num2 + num1 * num1) % 1 == 0)
						.mapToObj(num2 -> new int[] { num1, num2, (int) Math.sqrt(num2 * num2 + num1 * num1) }))
				.forEach(nums -> System.out.println("[" + nums[0] + "," + nums[1] + "," + nums[2] + "]"));
	}
}
