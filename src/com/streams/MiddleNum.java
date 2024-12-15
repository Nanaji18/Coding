package com.streams;

import java.util.stream.IntStream;

public class MiddleNum {

	
	private static boolean isSumEqualToMiddle(int number) {
        // Convert the number to a string to easily access digits
        String numStr = String.valueOf(number);
        
        // Extract digits
        int firstDigit = Character.getNumericValue(numStr.charAt(0));
        int middleDigit = Character.getNumericValue(numStr.charAt(1));
        int lastDigit = Character.getNumericValue(numStr.charAt(2));
        
        // Check if the sum of the first and last digits equals the middle digit
        return (firstDigit + lastDigit) == middleDigit;
    }
	
	public static void main(String[] args) {
        IntStream.rangeClosed(100, 200)
                .filter(MiddleNum::isSumEqualToMiddle)
                .forEach(System.out::println);
    }
}
