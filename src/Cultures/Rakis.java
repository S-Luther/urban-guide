package Cultures;

import App.Culture;
import java.util.Random;

public class Rakis implements Culture{

    Random r = new Random();

    @Override
    public stance strategy(){
        return stance.AGGRESSIVE;
    }

    @Override 
    public stance diplomacy(){
        if (r.nextBoolean()){
            return stance.AGGRESSIVE;
        } else {
            return stance.BALANCED;
        }
    }

    public void special(){
        
    }
}