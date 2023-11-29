package Cultures;

import java.util.Random;

import App.Culture;

public class Viltrumites implements Culture{

    Random r = new Random();

    public stance strategy() {
        return stance.AGGRESSIVE;
    }


    public stance diplomacy() {
        if(r.nextBoolean()){
            return stance.AGGRESSIVE;
        }
        else {
            return stance.DEFENSIVE;
        }
    }

    public void special(){
        
    }
}
