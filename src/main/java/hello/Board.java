package hello;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-03-29.
 */
public class Board {

    private List<Region> regions = new ArrayList<>();

    public Board(){
        regions.add(new Region("g1","Columbia"));
        regions.add(new Region("g2","Russian America"));
        regions.add(new Region("g3","Northwest Territories"));
        regions.add(new Region("g4","Alberta"));
        regions.add(new Region("g5","Nunavut"));
        regions.add(new Region("g6","Quebec"));
        regions.add(new Region("g7", "Ontario"));
        regions.add(new Region("g8","Eastern USA"));
        regions.add(new Region("g9","Central USA"));
        regions.add(new Region("g10","Western USA"));
        regions.add(new Region("g11","Southern USA"));
        regions.add(new Region("g12","Mexico"));
        regions.add(new Region("g13","Cuba"));
        regions.add(new Region("g14","Jamaica"));
        regions.add(new Region("g15","Haiti"));
        regions.add(new Region("g16","Puerto Rico"));
        regions.add(new Region("g17","Guatemala"));
        regions.add(new Region("g18","Belize"));
        regions.add(new Region("g19","El Salavador"));
        regions.add(new Region("g20","Honduras"));
        regions.add(new Region("g21","Nicaragua"));
        regions.add(new Region("g22","Costa Rica"));
        regions.add(new Region("g23","Granada"));
        regions.add(new Region("g24","Venezuela"));
        regions.add(new Region("g25","Guiana"));
        regions.add(new Region("g26","Brazil"));
        regions.add(new Region("g27","Ecuador"));
        regions.add(new Region("g28","Peru"));
        regions.add(new Region("g29","Bolivia"));
        regions.add(new Region("g30","Paraguay"));
        regions.add(new Region("g31","Chile"));
        regions.add(new Region("g32","Argentine Republic"));
        regions.add(new Region("g33","Uruguay"));
        regions.add(new Region("g34","Patagonia"));
        regions.add(new Region("g35","Tierra del Fuego"));
        regions.add(new Region("g36","Falkland Isles"));
        //regions.add(new Region("g202","Hawaii");
        
        //return regions;
    }

    public List<Region> getRegions(){
        return regions;
    }
}
