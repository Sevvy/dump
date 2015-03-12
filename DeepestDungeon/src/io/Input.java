package io;

import java.util.Scanner;

public abstract class Input {
	private static Scanner sc = new Scanner(System.in);
	private Input(){};
	public static String getNext(){
		return sc.nextLine();
	}

	public static int getNextInt(boolean manualCheck){ //only accepts ints >= 0, returns -1 if invalid int, -2 if invalid input.
		while(true){
			String s = sc.nextLine();
			int i = -2;
			try{
				i = Integer.parseInt(s);
			}
			catch(Exception e){
				if(manualCheck){
					return -2;
				}
				System.out.println("Please input a valid number.");
				continue;
			}
			if(i < 0){
				if(manualCheck){
					return -1;
				}
				System.out.println("Please input a number greater than -1.");
				continue;
			}
			return i;
		}
	}
	
	public static int getNextInt(){
		return getNextInt(false);
	}
	public static boolean isInt(String input) {
		// TODO Auto-generated method stub
		return false;
	}

}
