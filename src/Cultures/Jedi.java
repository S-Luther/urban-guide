package Cultures;

import java.util.Random;

import App.Culture;

public class Jedi implements Culture{

    Random r = new Random();

    public stance strategy(){
       int strat = r.nextInt(3);
       switch (strat){
            case 0 :
                return stance.AGGRESSIVE;
            case 1:
                return stance.DEFENSIVE;
            case 2: 
                return stance.BALANCED;
            default:
                return stance.BALANCED;
       }
    }

    public stance diplomacy(){
        return stance.BALANCED;
    }

    public void special(){
        System.out.println("These are not the droids you're looking for");
    }
}