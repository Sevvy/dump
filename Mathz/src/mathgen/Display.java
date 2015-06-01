package mathgen;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;

public class Display {
	public MainUI owner;
	public ArrayList<Component> elements;
	public Display() {
		this.elements = new ArrayList<Component>();
	}
	public Display(Component... e){
		this.elements = new ArrayList<Component>();
		for (Component c : e){
			this.elements.add(c);
			
		}
	}
	public Display(ArrayList<Component> a){
		this.elements = a;
	}
	
	public void update(ArrayList<Component> a){
		this.elements = a;
	}
	public void update(Display d){
		update(d.elements);
	}
	public void add(Component c){
		this.elements.add(c);
	}
	public void clear(){
		this.elements.clear();
	}

}
