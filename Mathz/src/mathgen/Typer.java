package mathgen;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Typer extends JTextField {
	
	MainUI owner;
	
	public Typer(MainUI owner) {
		init(owner);
	}

	public Typer(String arg0, MainUI owner) {
		super(arg0);
		init(owner);
	}

	public Typer(int arg0, MainUI owner) {
		super(arg0);
		init(owner);
	}

	public Typer(String arg0, int arg1, MainUI owner) {
		super(arg0, arg1);
		init(owner);
	}

	public Typer(Document arg0, String arg1, int arg2, MainUI owner) {
		super(arg0, arg1, arg2);
		init(owner);
	}
	
	private void init(MainUI owner){
		this.owner = owner;
		this.setBounds(0,0,300,20);//default size
		this.getDocument().addDocumentListener(new DocumentListener() {	//for dynamic checking of the textbox
			  public void changedUpdate(DocumentEvent e) {
			    check();
			  }
			  public void removeUpdate(DocumentEvent e) {
			    check();
			  }
			  public void insertUpdate(DocumentEvent e) {
			    check();
			  }
		});
		this.addActionListener(owner);
	}
	
	protected void check(){	//TODO:proper resizing method
//		if(this.getText().length() > this.getBounds().width / 7){
//			this.setBounds(this.getBounds().x,this.getBounds().y,this.getBounds().width+200,this.getBounds().height);
//		}           x^2 + (x-1)^3 - 4 = 8
 	}
	
	public void onEnter(){
		Display d = new Display();
		owner.loadNewState(d); 
	}
	
	public void setCentre(){
		System.out.println(owner);
		System.out.println(owner.getSize().width);
		this.setBounds((owner.getSize().width - this.getBounds().width)/2,this.getBounds().y,this.getBounds().width,this.getBounds().height);
		
	}
}
