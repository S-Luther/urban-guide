package App;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

import App.Culture.stance;
import Cultures.Gibberish;
import Cultures.HermitCrabPeople;
import Cultures.Jedi;
import Cultures.Klingon;
import Cultures.Rakis;
import Cultures.Space;
import Cultures.Viltrumites;

public class SpaceStation <T> {
    private String[][] map;
    private ArrayList<Thing> things = new ArrayList<>();
    private ArrayList<Being> citizens = new ArrayList<>();

    private T Culture;

    private ArrayList<SpaceStation> neighbors = new ArrayList<>();

    private int team;

    private Random r = new Random();

    public SpaceStation(T culture){
        Culture = culture;
        System.out.println("A Station of Culture: "+((Culture) Culture).name()+" has been created!");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        int rand = r.nextInt(50) + 10;


    
        for(int i = 0; i < rand; i++){
            switch(r.nextInt(7)){
                case 0:
                    citizens.add(new Being<Klingon>(new Klingon()));
                    break;

                case 1:
                    citizens.add(new Being<Jedi>(new Jedi()));
                    break;

                case 2:
                    citizens.add(new Being<HermitCrabPeople>(new HermitCrabPeople()));
                    break;

                case 3:    
                    citizens.add(new Being<Rakis>(new Rakis()));
                    break;

                case 4:
                    citizens.add(new Being<Gibberish>(new Gibberish()));
                    break;

                case 5:
                    citizens.add(new Being<Space>(new Space()));
                    break;

                case 6:
                    citizens.add(new Being<Viltrumites>(new Viltrumites()));
                    break;

            }
        }

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

    }

    public void simulate(){
        for(Being b: citizens){
            b.interact(citizens.get(r.nextInt(citizens.size())));
        }
    }


    public stance respond(){
        return null;
    }
}
