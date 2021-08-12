package com.lockedme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.lockedme.exceptionhandler.LockedMeException;

public class LockedMeProj {

	static final String FOLDERPATH = "C:\\Users\\User\\Downloads\\FJSD\\Projects\\Phase1\\LockedMeFiles";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int ch = 0, proceed = 1;

		do {
			// Menu
			displayMenu();
			System.out.println("Enter your choice:");
			ch = Integer.parseInt(scn.nextLine());
			switch (ch) {
			case 1:
				getAllFiles();
				break;
			case 2:
				createFiles(scn);
				break;
			case 3:
				deleteFiles(scn);
				break;
			case 4:
				searchFile(scn);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Option");
			}
		} while (proceed > 0);
		scn.close();
	}

	/**
	 * This method will display the menu options for the application
	 */
	private static void displayMenu() {
		System.out.println("_*_*_*_*__*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
		System.out.println("\t\t Company Lockers Pvt. Ltd.");
		System.out.println("_*_*_*_*__*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");

		System.out.println("1. Display all files \n2. Add new file \n3. Delete a file \n4. Search a file\n5. Exit");
		System.out.println("_*_*_*_*__*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
	}

	/**
	 * This method will retrieve the files
	 */
	public static void getAllFiles() {
		// Getting File Names
		List<String> fileNames = FileManager.getAllFilenames(FOLDERPATH);
		// Sorting in assending order
		Collections.sort(fileNames);

		if (fileNames.isEmpty())
			// Handling empty folder
			System.out.println("There is no file available");
		else
			// Printing File Names
			fileNames.forEach(System.out::println);
	}

	/**
	 * This method will create/update the file
	 * 
	 * @param scn
	 */
	public static void createFiles(Scanner scn) {
		// Variable Declaration
		String fileName = "";
		int linesCount = 0;
		List<String> content = new ArrayList<>();

		// Read file name from User
		System.out.println("Enter the File Name:");
		fileName = scn.nextLine();

		// Read number of lines from user
		System.out.println("Enter how many lines in the file:");
		linesCount = Integer.parseInt(scn.nextLine());

		// Read Lines form User
		for (int i = 1; i <= linesCount; i++) {
			System.out.println("Enter line " + i + ":");
			content.add(scn.nextLine());
		}

		// save the content into the file
		boolean isSaved = FileManager.createToFile(FOLDERPATH, fileName, content);

		if (isSaved)
			System.out.println("File and data saved successfully");
		else
			System.out.println("Some error occured. Please admint@lockme.com");

	}

	/**
	 * This method will delete the file
	 * 
	 * @param scn
	 */
	public static void deleteFiles(Scanner scn) {
		System.out.println("Enter file name to be deleted:");
		String fileName = scn.nextLine();
		// delete the file
		boolean isDeleted = FileManager.deleteFile(FOLDERPATH, fileName);
		if (isDeleted)
			System.out.println("File deleted successfully");
		else
			System.out.println("Either file not there or some access issue");
	}

	/**
	 * This method will search the file
	 * 
	 * @param scn
	 */
	public static void searchFile(Scanner scn) {
		// Code for searching a file
		System.out.println("Enter file name to be searched:");
		String fileName = scn.nextLine();
		// search the file
		boolean isFound = FileManager.searchFile(FOLDERPATH, fileName);
		if (isFound)
			System.out.println("File is present in the folder");
		else
			System.out.println("File is not present in the folder");
	}
}
