package deepestDungeon;

public class BashAttack extends Move {
	
	public BashAttack(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public BashAttack() {
		super("Bash");
	}

	@Override
	public void use(Entity... target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Entity[] getTarget() {//single target.
		// TODO Auto-generated method stub
		return null;
	}

}
