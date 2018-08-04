package com.capgemini.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringSearch {

	public void SearchString(String string, String file) throws IOException {
		
		int countBuffer=0, countLine=0, count=0;
		String lineNumber = null;
		BufferedReader fileRead = new BufferedReader(new FileReader(file));
		String search = null;
		
		try {
			
			while((search = fileRead.readLine()) != null) {
			
					//incrementing the line number
				countLine++;
            
					//store all the words of a line
				String[] words = search.split(" ");
             
					//traversing the loop to check the word in each line
				for (String word : words) {
					if (word.equals(string)) { 	//if found
						count++;
						countBuffer++;
					}
				}

				if(countBuffer > 0)
				{
					countBuffer = 0;
					lineNumber += countLine + ",";
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
				System.out.println("Times found at--"+count);
				System.out.println("Word found at--"+lineNumber);	}
	

}
