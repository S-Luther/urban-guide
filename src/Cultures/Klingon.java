package Cultures;

import java.util.Random;

import App.Culture;

public class Klingon implements Culture{

    Random r = new Random();

    public stance strategy() {
        if(r.nextBoolean()){
            return stance.AGGRESSIVE;
        }else{
            return stance.BALANCED;
        }
    }


    public stance diplomacy() {
        return stance.AGGRESSIVE;
    }

    public void special(){
        System.out.println("We need blood!");
    }
    
}
