package com.siva.files;
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileHandeling file = new FileHandeling();
		File f = file.createFile("Sample File.txt");
//		System.out.println(f.getAbsolutePath());
//		file.displayFileInformation(f);
//		file.writeIntoFile(f);
		
		
		file.deleteFile(f);
		
		file.readFromFile(f);
		
		
		
		
	}
	
//	public static void readFile() {
//		
//		try {
//			File input = 
//			Scanner read = new Scanner();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//	}
	
	public static void writeIntoFile() {
		Scanner sc = new Scanner(System.in);
		File output = new File("Customers.txt");
		String name ;
		System.out.println("Enter the First Customer Name: ");
		name = sc.nextLine();
		
		try {
			PrintWriter out = new PrintWriter(output);
			while(name.equalsIgnoreCase("done") == false) {
				out.println(name);
				System.out.println("Enter the name or \"Done\" to exit.");
				name = sc.nextLine();
			}
			System.out.println("Exiting File");
			out.close();
			return;
		}
		catch (Exception e) {
			System.out.println("Error encountered: "+ e.toString());
		}
		sc.close();
	}

}
