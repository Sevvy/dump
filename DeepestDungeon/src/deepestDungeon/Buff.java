package deepestDungeon;

public abstract class Buff {
	int duration;
	boolean isPerm = false;
	public Buff(int duration) {
		this.duration = duration;
		if(duration < 0){
			isPerm = true;
		}
	}
	
	public final void tick(){
		if(!isPerm){duration--;}
		onTick();
	}
	
	protected abstract void onTick();//the thing that happens when it ticks down.
	
	public void onRemove(){
		
	}
	
	public void onApply(){
		System.out.println("apply the pliers");
	}
	public abstract int onDamage(int i, int type); //any damage modifier that occurs.
}
