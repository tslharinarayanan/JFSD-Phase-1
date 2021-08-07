package com.lockedme;

import java.util.List;

public class LockedMeProj {

	static final String folderPath = "C:\\Users\\User\\Downloads\\FJSD\\Projects\\Phase1\\LockedMeFiles";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Getting File Names
		List<String> fileNames = FileManager.getAllFilenames(folderPath);
		// Printing File Names
		fileNames.forEach(System.out::println);
	}

}
