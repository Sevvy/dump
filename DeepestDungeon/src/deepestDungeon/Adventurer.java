package deepestDungeon;

import java.util.ArrayList;

public class Adventurer extends Entity{
	public ArrayList<Move> movez;
	public ArrayList<Quirk> quirkz;
	public int fear, threat, attack;
	public Adventurer(int hp, int energy, int attack) {
		super(hp,energy);
		this.attack = attack;
	}
	public Adventurer(){
		super(Mathz.random(10,40),Mathz.random(0, 20));
		this.attack = Mathz.random(4, 12);
	}
	@Override
	public final void getResponse() {
		// TODO Auto-generated method stub
		
	}
	public void damage(int i, int type){
		
	}
	@Override
	public void onDeath() {
		// TODO Auto-generated method stub
		
	}

}
