package com.demo.naninani;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the filename: ");
		String filename = scanner.nextLine();

		// Find the last occurrence of the dot character
		
		//nani.pdf
		int dotIndex = filename.lastIndexOf('.');
		System.out.println(dotIndex);
		System.out.println(filename.length());

		// Check if the dot exists and is not the first or last character
		if (dotIndex > 0 && dotIndex < filename.length() - 1) {
			// Extract and print the extension
			String extension = filename.substring(dotIndex+1);
			System.out.println("File extension: " + extension);
		} else {
			System.out.println("No valid file extension found.");
		}

		// Close the scanner
		scanner.close();
	}

}
