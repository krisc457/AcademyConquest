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
    String activeCountry = "USA"; /*Hårdkodad lösning för att ha USA som "active country" och jämför då med länder ägda av USA
                                    bör göras dynamisk. Funkar för alla länder.*/

    @GetMapping("/map")
    public ModelAndView map(HttpSession session) {
        ModelAndView mapmodel = new ModelAndView("map");
        List<Region> gameStuff = createInitBoard.getRegions();
        if (session.getAttribute("user") == null) {
            return new ModelAndView("redirect://index.html");
        }
        return mapmodel;
    }

    @MessageMapping("/endTurn")
    @SendTo("/topic/gameRoom")
    public RegionInfo region(SelectedRegionObject regionIdObject) throws Exception {
        //Vi använder teckenkombination !1 för att kunna använda split i Javascript och dela upp

        String gID = regionIdObject.getName().substring(1);
        int gInt = Integer.parseInt(gID)-1;

        String result = "";
        String temp = "";
        String currLand = activeGameBoard.get(gInt).getName() + " !1Troops " + activeGameBoard.get(gInt).getTroops() + " <br>Networth " + activeGameBoard.get(gInt).getNetworth();

        if (activeCountry.equalsIgnoreCase("usa")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (majorNation.getCountriesOwnedByUsa().contains(item)) {
                    result += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("britain")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (majorNation.getCountriesOwnedByBritain().contains(item)) {
                    result += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("france")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (majorNation.getCountriesOwnedByFrance().contains(item)) {
                    result += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("germany")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (majorNation.getCountriesOwnedByGermany().contains(item)) {
                    result += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("russia")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (majorNation.getCountriesOwnedByRussia().contains(item)) {
                    result += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }
        else if (activeCountry.equalsIgnoreCase("japan")) {
            for (String item : activeGameBoard.get(gInt).getAdjacentRegions()) {
                if (majorNation.getCountriesOwnedByJapan().contains(item)) {
                    result += "!2" + activeGameBoard.get(Integer.parseInt(item.substring(1)) - 1).getName();
                }
            }
        }

        for (String adjacent : activeGameBoard.get(gInt).getAdjacentRegions()) {
            temp +="!3"+ adjacent;
        }
        temp +="!3"+ regionIdObject.getName();


        System.out.println(currLand);
        currLand = currLand + "!split" + result + "!split" + temp;
        System.out.println(activeGameBoard.get(gInt).getAdjacentRegions());
        return new RegionInfo(currLand);
    }
}
