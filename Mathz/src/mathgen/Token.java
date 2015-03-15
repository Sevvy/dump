package mathgen;

public abstract class Token {
	public int value;
	public Token(String... args){
		validate(args);
	}
	protected static boolean validate(String[] args) {
		return true;
	}
	protected static String format(String... args){ //Formats string by stripping spaces, then splitting into array based off individual symbols. alphanumeric groups are 1 symbol, symbols are 1 symbol.
		String token = "";
		for(String s : args){
			for(String t : s.split(" ")){
				for(String u : t.split("([a-zA-Z]*\|[0-9])"))
				token.concat(t);
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
		}
		
		else{t = new EndToken(args);}
		
		
		return t;
		
	}
	
}
