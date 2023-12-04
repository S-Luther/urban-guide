package Cultures;

import java.util.Random;

import App.Culture;

public class Gibberish implements Culture{

    Random r = new Random();

    public stance strategy(){


        if(r.nextBoolean()){
            return stance.AGGRESSIVE;
        }
        else{
            return stance.BALANCED;
        }
    }

    public stance diplomacy(){
        return stance.BALANCED;
    }

    public void special(){
        System.out.println("Arghhh!");
    }

    public String name(){
        return "Gibberish";
        
    }
    
}
