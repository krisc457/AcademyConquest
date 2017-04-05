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
    MajorNation usa = new MajorNation("USA");
    MajorNation france = new MajorNation("FRANCE");
    MajorNation britain = new MajorNation("BRITAIN");
    MajorNation germany = new MajorNation("GERMANY");
    MajorNation japan = new MajorNation("JAPAN");
    MajorNation russia = new MajorNation("RUSSIA");
    List<MajorNation> majorNations = new ArrayList<>();

    public List<MajorNation> getMajorNations() {
        return majorNations;
    }

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
}