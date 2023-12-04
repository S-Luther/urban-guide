package Cultures;

import java.util.Random;

import App.Culture;

public class Space implements Culture{

    Random r = new Random ();

    public stance strategy(){
        if(r.nextBoolean()){
            return stance.DEFENSIVE;
        }
        else{
            return stance.BALANCED;
        }
    }
    public stance diplomacy(){
        return stance.DEFENSIVE;
    }

    public void special(){
        System.out.println("Mwahahahahaha");
    }

    public String name(){
        return "Space";
    }
}
