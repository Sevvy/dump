package io;

import deepestDungeon.Item;

/**
 *
 * @author Jono Chan
 */
public class ShopOption extends Option{
    Item item;
    int cost;
    public ShopOption(String text, Item i, int cost){
        super(text);
        this.item = i;
        this.cost = cost;
    }
    public ShopOption(Item i, int cost){
        super(i.name);
        this.cost = cost;
    }
    
    @Override
    public String text(){
        return text + "$" + cost;
    }
    
    @Override
    public void execute(){
        System.out.println("\n\n\n\n\nYAY YOU BOUGHT THIS "+item.name+"!!!!!1!1!!!!\n\n\n\n\n\n");
    }
}
