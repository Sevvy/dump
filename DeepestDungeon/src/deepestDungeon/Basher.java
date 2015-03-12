package deepestDungeon;

public class Basher extends Adventurer {

	public Basher(int hp, int energy, int attack) {
		super(hp, energy, attack);
		this.movez.add(new BashAttack());
	}
	
	public Basher(){
		super();
		this.movez.add(new BashAttack());
	}

}
