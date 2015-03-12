package deepestDungeon;
public abstract class Mathz {

	private Mathz() {
		// TODO Auto-generated constructor stub
	}
	
	public static int random(int i, int j){
		int result = i + (int)((Math.abs(i - j)+1) * (float)Math.random()); //random must be converted to float, because it sucks. math(abs)+1 because typcast rounds down
		return result; //returns result
	}
	
}
