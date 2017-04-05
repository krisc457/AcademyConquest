package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GameController {
    //Startar länderna utanför för att skriva om länderna hela tiden
    Board createInitBoard = new Board();
    List<Region> activeGameBoard = createInitBoard.getRegions();
    MajorNation majorNation = new MajorNation();
    String activeCountry = "USA";

    @GetMapping("/map")
    public ModelAndView map(HttpSession session) {
        ModelAndView mapmodel = new ModelAndView("map");
        if (session.getAttribute("user") == null) {
            return new ModelAndView("redirect://index.html");
        }
        return mapmodel;
    }

    @MessageMapping("/makeMove")
    @SendTo("/topic/gameRoom")
    public RegionInfo region(SelectedRegionObject regionIdObject) throws Exception {
        //Vi använder teckenkombination !1 för att kunna använda split i Javascript och dela upp

        String gID = regionIdObject.getName().substring(1);
        int gInt = Integer.parseInt(gID)-1;
        String namesOfAttackRegions = "";
        String idsForAdjacentRegions = "";
        String currentLand = activeGameBoard.get(gInt).getName() + " !1Troops " + activeGameBoard.get(gInt).getTroops() + " <br>Networth " + activeGameBoard.get(gInt).getNetworth();

        if (activeCountry.equalsIgnoreCase("usa")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (majorNation.getRegionsOwnedByUsa().contains(item)) {
                    namesOfAttackRegions += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("britain")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (majorNation.getRegionsOwnedByBritain().contains(item)) {
                    namesOfAttackRegions += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("france")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (majorNation.getRegionsOwnedByFrance().contains(item)) {
                    namesOfAttackRegions += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("germany")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (majorNation.getRegionsOwnedByGermany().contains(item)) {
                    namesOfAttackRegions += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("russia")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (majorNation.getRegionsOwnedByRussia().contains(item)) {
                    namesOfAttackRegions += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("japan")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (majorNation.getRegionsOwnedByJapan().contains(item)) {
                    namesOfAttackRegions += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }

        for (String adjacent : activeGameBoard.get(gInt).getAdjacentRegions()) {
            idsForAdjacentRegions +="!3"+ adjacent;
        }
        idsForAdjacentRegions +="!3"+ regionIdObject.getName();
        return new RegionInfo(currentLand, namesOfAttackRegions, idsForAdjacentRegions);
    }
}
