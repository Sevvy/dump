package mathgen;

import java.util.ArrayList;

public class Question {
	public String answer;
	public ArrayList<Token> tokenz;
	public Question(Token... tokens){
		for(Token t : tokens){
			tokenz.add(t);
		}
		
	}
}
