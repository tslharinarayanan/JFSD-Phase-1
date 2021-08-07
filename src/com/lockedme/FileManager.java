package com.lockedme;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	/**
	 * This method will return the file names from the folder
	 * @param folderPath
	 * @return List<String>
	 */
	public static List<String> getAllFilenames(String folderPath) {
		//Creating File Object
		File fl = new File(folderPath);
		
		//Getting all the files into FileArray
		File[] listOfFiles = fl.listFiles();
		
		//Declare a list to store file names
		List<String> fileNames = new ArrayList<>();
		
		for(File f: listOfFiles)
			fileNames.add(f.getName());
			
		//return File Name list
		return fileNames;
	}
}
