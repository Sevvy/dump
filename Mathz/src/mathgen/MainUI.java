package mathgen;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class MainUI extends JFrame implements ActionListener, ItemListener, KeyListener, MouseListener{//and inside was a bootiful singleton class
	
	static MainUI mainUI;
	
	public static MainUI getInstance(){
		if(mainUI != null){return mainUI;}
		return new MainUI();
	}
	
	private MainUI() {
		super("MathPr");
		this.setBackground(new Color(0, 0, 0));
		this.getContentPane().setLayout(null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof Button){
			((Button) e.getSource()).onClick();
		}
		if(e.getSource() instanceof Typer){
			
		}
		
	}
	
	public void loadNewState(ArrayList<Component> a){	//clears the screen and presents the next display
		this.getContentPane().removeAll();
		for(Component c : a){
			this.getContentPane().add(c);
		}
		this.repaint();
		
	}
	public void paint(Graphics g){
		super.paint(g);
//		for(Component c:this.getContentPane().getComponents()){
//			c.setLocation((int)(Math.random()*1000),(int)(Math.random()*1000));
//		}
	}

}
