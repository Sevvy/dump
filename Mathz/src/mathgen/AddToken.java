package mathgen;

import java.util.ArrayList;

public class AddToken extends Token {

	public AddToken(String... args) {
		super(args);
		// TODO Auto-generated constructor stub
	}
	protected static boolean validate(String[] args) {
		ArrayList<String> a = format(args);
		if(!isOperater(a.get(0))){
			return false;
		}
		int i;
		for(i=0;i < a.size(); i++){
			if(!isAlphaNum(a.get(i))){
				
			}
		}
		return true;

	}
	

}
