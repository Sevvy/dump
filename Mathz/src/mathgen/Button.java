package mathgen;

import java.awt.Container;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class Button extends JButton {	//a better version of JButton class with an OnClick() method.
	
	public Container owner;		//basically the container that holds this JButton. This is so that onClick can modify the things of the thing.
	
	public Button(Container owner) {
		super();
		init(owner);
	}

	public Button(Icon arg0, Container owner) {
		super(arg0);
		init(owner);	
	}

	public Button(String arg0, Container owner) {
		super(arg0);
		init(owner);
	}

	public Button(Action arg0, Container owner) {
		super(arg0);
		init(owner);
	}

	public Button(String arg0, Icon arg1, Container owner) {
		super(arg0, arg1);
		init(owner);
	}
	
	private void init(Container owner){ //too lazy to edit all the constructors, sooooooooo:
		this.owner=owner;
	}
	
	public void onClick(){}

}
