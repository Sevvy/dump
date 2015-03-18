package mathgen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public abstract class Button extends JButton {	//a better version of JButton class with an OnClick() method.
	
	public MainUI owner;		//basically the MainUI that holds this JButton. This is so that onClick can modify the things of the thing.
	
	public Button(MainUI owner) {
		super();
		init(owner);
	}

	public Button(Icon arg0, MainUI owner) {
		super(arg0);
		init(owner);	
	}

	public Button(String arg0, MainUI owner) {
		super(arg0);
		init(owner);
	}

	public Button(Action arg0, MainUI owner) {
		super(arg0);
		init(owner);
	}

	public Button(String arg0, Icon arg1, MainUI owner) {
		super(arg0, arg1);
		init(owner);
	}
	
	protected void init(MainUI owner){ //too lazy to edit all the constructors, sooooooooo:
		this.owner=owner;
		System.out.println(owner);
		this.addActionListener(owner);
//		this.addActionListener(new ActionListener(){
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				onClick();
//				
//			}
//			
//		});
		this.setSize(300,100); //default size
		this.setVisible(true);
		this.setLocation(0,0);//default place
	}
	
	public void onClick(){System.out.println("test");}

}
