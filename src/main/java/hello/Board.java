package hello;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-03-29.
 */
public class Board {

    private List<Region> regions = new ArrayList<>();

    public Board(){
        regions.add(new Region("g1","Columbia", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g2","Russian America", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g3","Northwest Territories", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g4","Alberta", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g5","Nunavut", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g6","Quebec", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g7", "Ontario", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g8","Eastern USA", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g9","Central USA", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g10","Western USA", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g11","Southern USA", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g12","Mexico", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g13","Cuba", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g14","Jamaica", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g15","Haiti", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g16","Puerto Rico", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g17","Guatemala", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g18","Belize", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g19","El Salavador", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g20","Honduras", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g21","Nicaragua", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g22","Costa Rica", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g23","Granada", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g24","Venezuela", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g25","Guiana", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g26","Brazil", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g27","Ecuador", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g28","Peru", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g29","Bolivia", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g30","Paraguay", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g31","Chile", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g32","Argentine Republic", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g33","Uruguay", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g34","Patagonia", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g35","Tierra del Fuego", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g36","Falkland Isles", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        //regions.add(new Region("g202","Hawaii");
        
        //return regions;
    }

    public int returnRandomIntRange(int max, int min){
        int i = (int)(Math.random()*(max-min)+min);
        return i;
    }

    public List<Region> getRegions(){
        return regions;
    }
}
