package com.lockedme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeProj {

	static final String folderPath = "C:\\Users\\User\\Downloads\\FJSD\\Projects\\Phase1\\LockedMeFiles";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Getting File Names
		List<String> fileNames = FileManager.getAllFilenames(folderPath);
		// Printing File Names
		fileNames.forEach(System.out::println);
		
		//Variable Declaration
		Scanner scn = new Scanner(System.in);
		String fileName =""; 
		int linesCount=0;
		List<String> content = new ArrayList<>();
		
		//Read file name from User
		System.out.println("Enter the File Name:");
		fileName=scn.nextLine();
		
		//Read number of lines from user
		System.out.println("Enter how many lines in the file:");
		linesCount=Integer.parseInt(scn.nextLine());
		
		//Read Lines form User
		for(int i=1;i<=linesCount;i++) {
			System.out.println("Enter line "+i+":");
			content.add(scn.nextLine());
		}
		
		//save the content into the file
		boolean isSaved = FileManager.createToFile(folderPath, fileName, content);
		
		if(isSaved)
			System.out.println("File and data saved successfully");
		else 
			System.out.println("Somer error occured. Please admint@lockme.com");
		scn.close();		
	}

}
