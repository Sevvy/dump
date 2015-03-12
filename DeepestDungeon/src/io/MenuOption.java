package io;

/**
 *
 * @author Jono Chan
 */
public class MenuOption extends Option{
    public Menu menu;
    public MenuOption(String text, Menu menu){
        super(text);
        this.menu = menu;
    }
    @Override
    public void execute(){
        menu.display();
    }
}
