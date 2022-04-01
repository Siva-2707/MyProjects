package com.siva.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileHandeling {

	public  File createFile(String str) {
		// TODO Auto-generated method stub
			File f = new File(str);
			try {
				if(f.createNewFile()) {
					System.out.println("File created: "+ f.getName());
				}
				else{
					System.out.println("File Already exists.");
				}
			}
			catch (IOException e) {
				System.out.println(e);
			}
		return f;
		
		}
	
	public void deleteFile(File f) {
		
		try {
			if(f.delete()) {
				System.out.println("File deleted: "+ f.getName());
			}
			else
				System.out.println("File does not exist.");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void displayFileInformation(File f) {
		
		System.out.println("--------------File Details-------------");
		System.out.println("File Name: "+f.getName());
		System.out.println("Absolute Path: "+f.getAbsolutePath());
		System.out.println("Writeable: "+f.canWrite());
		System.out.println("Readable: "+f.canRead());
		System.out.println("File size: "+f.length());
		
	}
	
	public void writeIntoFile(File f) {
		
		try {
			FileWriter writer = new FileWriter(f);
			writer.write("Entering Write Mode \n");
			System.out.println("Enter data that you wish. To exit write mode type \"Done\" and press enter.");
			Scanner sc = new Scanner(System.in);
			PrintWriter myWriter = new PrintWriter(writer);
			String input = sc.nextLine();
			while(input.equalsIgnoreCase("Done") == false) {
				myWriter.println(input);
				input = sc.nextLine();
			}
			myWriter.write("Exiting Write Mode");
			myWriter.close();
			sc.close();
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void readFromFile(File f) {
		
		try {
			Scanner reader = new Scanner(f);
			while(reader.hasNextLine()) {
				String result  = reader.nextLine();
				System.out.println(result);
			}
			reader.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
		

}
