package deepestDungeon;

public abstract class Move {
	public String name;
	public boolean singleTarget;
	protected Move(String name) {
		this.name = name;
	}
	
	public abstract void use(Entity... target);
	
	public abstract Entity[] getTarget();

}
