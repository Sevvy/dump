package mathgen;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class Main {
	ArrayList<Component> menuScreen = new ArrayList<>();
	ArrayList<Component> questionScreen = new ArrayList<>();
	ArrayList<Component> testGenScreen = new ArrayList<>();
	MainUI ui;
	Container cp;
	public static void main(String[] args) {
		Main main = new Main();
		
	}
	private void run(){
		ui = MainUI.getInstance();
		ui.setSize(800,600);
		ui.setLocation(500,200);
		initQuestionScreen();
		initMenuScreen();
		initTestGenScreen();
		cp =  ui.getContentPane();

		ui.loadNewState(menuScreen);
		ui.setVisible(true);
			try {
				while(true){Thread.sleep(10);ui.repaint();}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
		
	
	public void initMenuScreen(Component... args){
		for(Component c : args){
			menuScreen.add(c);
		}
		Button b1 = new TransitionButton("Setup Test", testGenScreen,ui); 
		b1.setLocation(10,100);
		menuScreen.add(b1);
		

	}
	
	public void initTestGenScreen(Component... args){
		for(Component c: args){
			testGenScreen.add(c);
		}
		Button b = new GenButton("Generate",ui);
		b.setSize(200,40);
		b.setLocation(b.getLocation().x,200);
		b.setCentre();
		testGenScreen.add(b);
		
		Typer t = new Typer(ui);
		t.setBounds(0,100,400,30);
		t.setCentre();
		testGenScreen.add(t);
		
	}
	
	public void initQuestionScreen(Component... args){
		for(Component c : args){
			questionScreen.add(c);
		}
		Button b = new TransitionButton("back", menuScreen,ui);
		questionScreen.add(b);
		
		
	}
	private Main(){run();}//couldn't think of a better way to remove static things if I decide to add methods to Main


}