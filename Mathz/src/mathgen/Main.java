package mathgen;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
	ArrayList<Component> menuScreen = new ArrayList<>();
	ArrayList<Component> questionScreen = new ArrayList<>();
	MainUI ui;
	Container cp;
	public static void main(String[] args) {
		Main main = new Main();
		
	}
	private void run() {
		MainUI ui = MainUI.getInstance();
		initQuestionScreen();
		initMenuScreen();

		cp =  ui.getContentPane();
		ui.setSize(800,600);
		ui.setLocation(500,200);
		ui.loadNewState(menuScreen);
		ui.setVisible(true);
		
		
		
	}
	
	public void initMenuScreen(Component... args){
		for(Component c : args){
			menuScreen.add(c);
		}
		Button b1 = new TransitionButton("test", questionScreen,ui); 
		b1.setLocation(100,100);
		menuScreen.add(b1);
		Debug.printIterable(menuScreen);
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