package mathgen;

import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.Icon;

public class TransitionButton extends Button {
	
	public ArrayList<Component> target;

	public TransitionButton(ArrayList<Component> target, MainUI owner) {
		super(owner);
		this.target = target;
	}

	public TransitionButton(Icon arg0, ArrayList<Component> target, MainUI owner) {
		super(arg0, owner);
		this.target = target;
	}

	public TransitionButton(String arg0, ArrayList<Component> target, MainUI owner) {
		super(arg0, owner);
		this.target = target;
	}

	public TransitionButton(Action arg0, ArrayList<Component> target, MainUI owner) {
		super(arg0, owner);
		this.target = target;
	}

	public TransitionButton(String arg0, Icon arg1, ArrayList<Component> target, MainUI owner) {
		super(arg0, arg1, owner);
		this.target = target;
	}
	
	public void onClick(){
		owner.loadNewState(target);
		System.out.println("transitionbutton");
	}
}
