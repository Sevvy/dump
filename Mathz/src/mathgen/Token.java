package mathgen;

import java.util.ArrayList;


public abstract class Token {
	public int value;
	public Token(String... args){
		validate(args);
	}
	protected static boolean validate(String[] args) {
		return true;
	}
	protected static boolean isOperater(String s){
		if(s.equals("/") || s.equals("+") || s.equals("-") || s.equals("*") || s.startsWith("\\")){return true;}
		return false;
	}
	protected static boolean isAlphaNum(String s){
		
	}
	protected final ArrayList<String> compress(ArrayList<String> a){
		
	}
	protected static ArrayList<String> format(String... args){ //Formats string by stripping spaces, then splitting into array based off individual symbols. single alphanumeric groups are 1 symbol, symbols are 1 symbol.
		ArrayList<String> token = new ArrayList<String>();
		for(String s : args){
			for(String t : s.split(" ")){
				for(String u : t.split("((?<=[-0-9()/*^+])(?=[-a-zA-Z()+/^*]))|((?<=[a-zA-Z])(?=[-a-zA-Z()*/^+]))|((?<=[-a-zA-Z()+*^/])(?=[0-9]))")){
					token.add(u);
				}					
			}
		}
		return token;
	}
	public static Token getToken(String[] args){
		Token t;
		if(validate(args)){
			t = getType(args);
			
		}
		else{
			return null;
		}
		return t;
	}
	private static Token getType(String[] args) {
		Token t;
		//will test for all currently implemented token subclasses.
		if(EndToken.validate(args)){
			t = new EndToken(args);
		}
		
		else{t = new EndToken(args);}
		
		
		return t;
		
	}
	
}
