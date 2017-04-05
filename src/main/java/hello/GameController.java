package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GameController {
    //Startar länderna utanför för att skriva om länderna hela tiden
    Board createInitBoard = new Board();
    List<Region> activeGameBoard = createInitBoard.getRegions();
    List<MajorNation> majorNations = new ArrayList<>();
    MajorNation britain = new MajorNation("BRITAIN");
    MajorNation germany = new MajorNation("GERMANY");
    MajorNation france = new MajorNation("FRANCE");
    MajorNation usa = new MajorNation("USA");
    MajorNation japan = new MajorNation("JAPAN");
    MajorNation russia = new MajorNation("RUSSIA");

    String activeCountry = "usa";


    @GetMapping("/map")
    public ModelAndView map(HttpSession session) {
        initMajorNationsList();
        ModelAndView mapmodel = new ModelAndView("map");
        if (session.getAttribute("user") == null) {
            return new ModelAndView("redirect:/index.html");
        }
        return mapmodel;
    }

    @MessageMapping("/makeMove")
    @SendTo("/topic/gameRoom")
    public RegionInfo region(SelectedRegionObject regionIdObject) throws Exception {
        //Vi använder teckenkombination !1 för att kunna använda split i Javascript och dela upp
        System.out.println(regionIdObject.getMajorNationTurn());
        String gID = regionIdObject.getName().substring(1);
        int gInt = Integer.parseInt(gID)-1;
        String namesOfAttackRegions = "";
        String idsForAdjacentRegions = "";
        String currentLand = activeGameBoard.get(gInt).getName() + " !1Troops " + activeGameBoard.get(gInt).getTroops() + " <br>Networth " + activeGameBoard.get(gInt).getNetworth();

        /*
        if (activeCountry.equalsIgnoreCase("usa")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (usa.getRegionsOwnedByUsa().contains(item)) {
                    namesOfAttackRegions += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("britain")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (usa.getRegionsOwnedByBritain().contains(item)) {
                    namesOfAttackRegions += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("france")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (usa.getRegionsOwnedByFrance().contains(item)) {
                    namesOfAttackRegions += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("germany")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (usa.getRegionsOwnedByGermany().contains(item)) {
                    namesOfAttackRegions += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("russia")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (usa.getRegionsOwnedByRussia().contains(item)) {
                    namesOfAttackRegions += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("japan")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (usa.getRegionsOwnedByJapan().contains(item)) {
                    namesOfAttackRegions += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        */

        for (String adjacent : activeGameBoard.get(gInt).getAdjacentRegions()) {
            idsForAdjacentRegions +="!3"+ adjacent;
        }
        idsForAdjacentRegions +="!3"+ regionIdObject.getName();
        return new RegionInfo(currentLand, namesOfAttackRegions, idsForAdjacentRegions);
    }

    @MessageMapping("/attack")
    @SendTo("/topic/gameRoom")
    public RegionInfo attackedRegion(SelectedRegionObject regionIdObject) throws Exception {
        String gID = regionIdObject.getName().substring(1);
        int gInt = Integer.parseInt(gID)-1;
        return new RegionInfo(regionIdObject.getName());
    }

    public void initMajorNationsList() {
        if (britain != null){
            majorNations.add(britain);
        }
        if (germany != null){
            majorNations.add(germany);
        }
        if (france != null){
            majorNations.add(france);
        }
        if (usa != null){
            majorNations.add(usa);
        }
        if (japan != null){
            majorNations.add(japan);
        }
        if (russia != null){
            majorNations.add(russia);
        }
    }
}