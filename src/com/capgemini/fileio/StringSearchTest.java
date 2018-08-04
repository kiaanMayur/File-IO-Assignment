package com.capgemini.fileio;

import java.io.IOException;
import java.util.Scanner;

public class StringSearchTest {

	public static void main(String[] args) throws IOException {
		
		StringSearch stringSearch = new StringSearch();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the location of the file: \n");
		String location = scanner.nextLine();
		
		System.out.println("Enter the string to search:\n");
		String search = scanner.nextLine();
		
		stringSearch.SearchString(search, location);
	}

}
