package com.capgemini.fileio;

import java.io.*;

//class to print the the total word count from a file
public class WordCount {
	
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		int wordCount = 0;
		BufferedReader file = new BufferedReader(new FileReader("C:\\Java Cloud\\File IO Assignment\\src\\com\\capgemini\\fileio\\NewLineCount.java"));
		
		
		
		String line = file.readLine();
		
		//loop to traverse the file
		while(line != null) {
			String[] count = line.split(" "); //this method will split the line whenever a " "(white space) will occur
			wordCount += count.length;
		}
		
		System.out.println("Total words in the file are: " + wordCount);
		file.close();
	}

}
