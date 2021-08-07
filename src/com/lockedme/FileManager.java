package com.lockedme;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	/**
	 * This method will return the file names from the folder
	 * 
	 * @param folderPath
	 * @return List<String>
	 */
	public static List<String> getAllFilenames(String folderPath) {
		// Creating File Object
		File fl = new File(folderPath);

		// Getting all the files into FileArray
		File[] listOfFiles = fl.listFiles();

		// Declare a list to store file names
		List<String> fileNames = new ArrayList<>();

		for (File f : listOfFiles)
			fileNames.add(f.getName());

		// return File Name list
		return fileNames;
	}

	/**
	 * This method will create or append content into the file specified
	 * 
	 * @param folderPath
	 * @param fileName
	 * @param content
	 * @return boolean
	 */
	public static boolean createToFile(String folderPath, String fileName, List<String> content) {

		try {
			// Creating File Object
			File fl = new File(folderPath, fileName);
			// Creating file wirter object to
			FileWriter fow = new FileWriter(fl);

			// Writing content into file
			for (String s : content)
				fow.write(s + "\n");

			// Closing file writer object
			fow.close();
			return true;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	/**
	 * This method will delete the file if it is available
	 * @param folderPath
	 * @param fileName
	 * @return boolean
	 */
	public static boolean deleteFile(String folderPath, String fileName) {
		// Creating File Object
		File fl = new File(folderPath, fileName);
		//Deleting the file
		if (fl.delete())
			return true;
		else
			return false;
	}
}
