package deepestDungeon;

/**
 *
 * @author Jono Chan
 */
public abstract class Item {
    public String name;
    public int cost;
    public Item(String name, int cost){
        this.name = name;
        this.cost = cost;
    }
    public Item(String name){
        this.name = name;
        this.cost = -1;
    }
    public abstract void onHit();
}
