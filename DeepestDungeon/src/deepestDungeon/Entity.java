package deepestDungeon;

import java.util.ArrayList;

public abstract class Entity {
	public float[] resistz = new float[4];
	public int hp,chp,energy,cenergy;	//hp = max hp, chp = current hp, energy = max energy, cenergy = current energy
	public ArrayList<Buff> status;
	
	public Entity(int hp, int energy) {
		this.hp = hp;
		this.energy = energy;
	}
	
	public void turn(){
		for(Buff b : status){
			b.tick();
		}
	}
	
	public void damage(int i, int type){
		for(Buff b : status){
			b.onDamage(i,type);
		}
	}
	public void damage(int i){
		damage(i,0);
	}
	public abstract void getResponse();
	public abstract void onDeath();
	
	
}
