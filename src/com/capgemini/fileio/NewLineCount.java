package com.capgemini.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// class to find total number of line in a file
public class NewLineCount {
	
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		int count = 0;
		String line = null;
		
		//buffer reader will receive a file from the given location
		BufferedReader file = new BufferedReader(new FileReader("C:\\Java Cloud\\File IO Assignment\\src\\com\\capgemini\\fileio\\NewLineCount.java"));
		
		try {
			while((line = file.readLine()) != null) {
		
			count++;	
		} } catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total number of new lines: " + count);
	
	}

}
