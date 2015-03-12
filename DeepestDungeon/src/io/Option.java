package io;

/**
 *
 * @author Jono Chan
 */
public class Option {
    public String text;
    public Option(String text){
        this.text = text;
    }
    public void execute(){//IF THIS OPTION IS SELECTED:
        
    }
    public String text(){//RETURN THE TEXT OF THIS OBJECT. ALSO MODIFY TEXT PARAM
        return text;
    }
}
