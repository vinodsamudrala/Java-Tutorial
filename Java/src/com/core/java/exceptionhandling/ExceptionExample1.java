package com.core.java.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample1 {

	static String name = null;

	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) {

			System.out.println("Statement " + x);

			if (x == 5) {
				// System.out.println("String "+name+" length:"+ name.length());
			}

		}

		FileInputStream fis = null;
		/*
		 * This constructor FileInputStream(File filename) throws
		 * FileNotFoundException which is a checked exception
		 */
		try {
			System.out.println();
			try {

			} catch (Exception e) {

			}

			fis = new FileInputStream("D:/myfile.txt");
			int k;
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
			fis.close();

			if (false) {
				throw new IOException();
			}

			System.out.println("After throw");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	public static void main1(String[] args) {
		
		try {
				
				System.out.println("going to divide");
					
				try {
					
					int b = 39 / 0;
				
				} catch (Exception e) {
				
					e.printStackTrace();
				
				}
				
				String number = "two";
				
				int n =  Integer.parseInt(number);
				
				System.out.println(n);
				

		} catch (Exception e) {

		}

		finally{
		
			
		}

	}

}