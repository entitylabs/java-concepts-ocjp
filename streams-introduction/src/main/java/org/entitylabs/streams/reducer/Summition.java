package org.entitylabs.streams.reducer;

import java.util.List;

public class Summition {

	public static void main(String[] args) {
		
		
		
		int result=List.of(1,2,3,4,5,6,7,8,9).stream().mapToInt(num-> num).sum();
		
		System.out.println(result);
	}
}
