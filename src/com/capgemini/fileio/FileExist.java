package com.capgemini.fileio;

import java.io.File;
import java.io.IOException;

// class to check whether a file exist or not
public class FileExist{
	
	public static void main(String[] args){
		// file object
		File file = new File("C:\\Users\\Mayur Tripathi\\FileExist.txt");
		
		//logic to check whether a file exists or not
		if(file.exists()) 
		System.out.println("File Exists");

		else
		System.out.println("file not exists");
	}

}
