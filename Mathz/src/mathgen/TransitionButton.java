package mathgen;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.Icon;

public class TransitionButton extends Button {
	
	public Display target;

	public TransitionButton(Display target, MainUI owner) {
		super(owner);
		this.target = target;
	}

	public TransitionButton(Icon arg0, Display target, MainUI owner) {
		super(arg0, owner);
		this.target = target;
	}

	public TransitionButton(String arg0, Display target, MainUI owner) {
		super(arg0, owner);
		this.target = target;
	}

	public TransitionButton(Action arg0, Display target, MainUI owner) {
		super(arg0, owner);
		this.target = target;
	}

	public TransitionButton(String arg0, Icon arg1, Display target, MainUI owner) {
		super(arg0, arg1, owner);
		this.target = target;
	}
	
	public void onClick(){
		owner.loadNewState(target);
	}
}
