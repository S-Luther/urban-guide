package App;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


import Cultures.Gibberish;
import Cultures.HermitCrabPeople;
import Cultures.Jedi;
import Cultures.Klingon;
import Cultures.Rakis;
import Cultures.Space;
import Cultures.Viltrumites;

public class App {
    static ArrayList<SpaceStation> Stations = new ArrayList<>();
    public static void main(String[] args){

        boolean go = true;
        int counter = 0;

        Random r = new Random(1);

        for(int i = 0; i<2; i++){
            switch(r.nextInt(7)){
                case 0:
                    Stations.add(new SpaceStation<Klingon>(new Klingon()));
                    break;

                case 1:
                    Stations.add(new SpaceStation<Jedi>(new Jedi()));
                    break;

                case 2:
                    Stations.add(new SpaceStation<HermitCrabPeople>(new HermitCrabPeople()));
                    break;

                case 3:    
                    Stations.add(new SpaceStation<Rakis>(new Rakis()));
                    break;

                case 4:
                    Stations.add(new SpaceStation<Gibberish>(new Gibberish()));
                    break;

                case 5:
                    Stations.add(new SpaceStation<Space>(new Space()));
                    break;

                case 6:
                    Stations.add(new SpaceStation<Viltrumites>(new Viltrumites()));
                    break;

            }

  
        }

        while(go){
            for(SpaceStation s: Stations){
                s.simulate();
            }
            counter++;
            if(counter==10){
                go = false;
            }

        }
        
    }
}
