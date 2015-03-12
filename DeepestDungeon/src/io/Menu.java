package io;

import java.util.ArrayList;
/**
 *
 * @author Jono Chan
 */
public class Menu {
    ArrayList<Option> options = new ArrayList<Option>();
    public Menu(Option[] o){
        for (Option p : o){
            options.add(p);
        }
    }
    
    public void getResponse(){//DO I WANT THIS TO CHANGE? MAY CHANGE WITH CHILD CLASSES
        String input = Input.getNext();
        if(Input.isInt(input)){
            
        }
        else{error();}
    }
    
    public void error(){
        System.out.println("============INPUT ERROR==============");
                
    }
    
    public void display(){
        for(int i = 0; i < options.size(); i++){
            System.out.println(i + "|\t"+options.get(i).text());
        }
    }
}
