package com.personalForDav.portfolioSite.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lettore {

	private static Scanner keyboardIN = new Scanner(System.in);
	private static Scanner fileIN;
	

	public static void closeKeyboard() {
		keyboardIN.close();
	}
	
	private static void closeFile() {
		fileIN.close();
	}

	public static String readKeyboard() {
		return keyboardIN.nextLine();
	}
	
	public static int leggiInt() {
		int ris = 0;
		boolean trovato = false;

		do {
			try {
				ris = Integer.parseInt(readKeyboard());
				trovato = true;
			} catch(NumberFormatException e) {
				System.out.println("ERRORE: Formato numero non corretto, riprova...");
				// e.printStackTrace();
			}

		} while(!trovato);

		return ris;
	}
	
	public static double leggiDouble() {
		double ris = 0;
		boolean trovato = false;

		do {
			try {
				ris = Double.parseDouble(readKeyboard());
				trovato = true;
			} catch(NumberFormatException e) {
				System.out.println("ERRORE: Formato numero non corretto, riprova...");
				// e.printStackTrace();
			}

		} while(!trovato);

		return ris;
	}
	
	public static boolean leggiBoolean() {
		String s = keyboardIN.nextLine();
		boolean ris = false;

		switch (s.toLowerCase()) {

		case "si": 		ris = true;		break;
//		case "s�": 		ris = true;		break;
		case "true": 	ris = true;		break;
		case "y": 		ris = true;		break;
		case "s": 		ris = true;		break;
		case "1": 		ris = true;		break;
		case "vero": 	ris = true;		break;
		case "yes": 	ris = true;		break;
		case "ja": 		ris = true;		break;
		case "oui": 	ris = true;		break;

		}

		return ris;
	}
	
	public static ArrayList<String> leggiFile(File file){
		ArrayList<String> list = new ArrayList<String>();
//		String file = "";
		try {
			fileIN = new Scanner(file);

			while(fileIN.hasNextLine()) {
				list.add(fileIN.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println("ERRORE: File non trovato, percorso non corretto...");
			 e.printStackTrace();
		}  catch (NullPointerException e) {
			System.out.println("ERRORE: Percorso non valido...");
			 e.printStackTrace();
		} finally {
			if (fileIN != null)
				closeFile();
		}

		return list;
	}
	
	public static String fileToHTML(File file){
		ArrayList<String> list = new ArrayList<String>();
		String fileString = "";
		try {
			fileIN = new Scanner(file);
			
			while(fileIN.hasNextLine()) {
				list.add(fileIN.nextLine());
			}
			for (String s : list) {
				fileString += s + "\n";
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("ERRORE: File non trovato, percorso non corretto...");
			e.printStackTrace();
		}  catch (NullPointerException e) {
			System.out.println("ERRORE: Percorso non valido...");
			e.printStackTrace();
		} finally {
			if (fileIN != null)
				closeFile();
		}
		
		return fileString;
	}
	
	public static String fileToString(File file){
		ArrayList<String> list = new ArrayList<String>();
		String fileString = "";
		try {
			fileIN = new Scanner(file);
			
			while(fileIN.hasNextLine()) {
				list.add(fileIN.nextLine());
			}
			for (String s : list) {
				fileString += s;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("ERRORE: File non trovato, percorso non corretto...");
			e.printStackTrace();
		}  catch (NullPointerException e) {
			System.out.println("ERRORE: Percorso non valido...");
			e.printStackTrace();
		} finally {
			if (fileIN != null)
				closeFile();
		}
		
		return fileString;
	}

}
