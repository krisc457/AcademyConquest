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
    List<Region> stuff = new ArrayList();
    Board boardstuff = new Board();
    List<Region> gameStuff = boardstuff.getRegions();
    Player usa = new Player();

    @GetMapping("/map")
    public ModelAndView map(HttpSession session) {
        ModelAndView mapmodel = new ModelAndView("map");
        List<Region> gameStuff = boardstuff.getRegions();
        if (session.getAttribute("user") == null) {
            return new ModelAndView("redirect:/index.html");
        }
        return mapmodel.addObject(gameStuff.get(20).getRegionID());
    }

    @MessageMapping("/endTurn")
    @SendTo("/topic/gameRoom")
    public RegionInfo region(SelectedRegionObject regionIdObject) throws Exception {
        String gID = regionIdObject.getName().substring(1);
        //Vi använder teckenkombination !1 för att kunna använda split i Javascript och dela upp texten
        int gInt = Integer.parseInt(gID)-1;
        String currLand = gameStuff.get(gInt).getName() + "!1Troops " + gameStuff.get(gInt).getTroops() + "<br>Networth " + gameStuff.get(gInt).getNetworth();
//        System.out.println(gID + " Land " + currLand);

        if (gameStuff.get(gInt).getAdjacentRegions().contains("g1")) {
            System.out.println("Du kan attackera " + gameStuff.get(gInt).getName() + "!");
        }
        System.out.println(gameStuff.get(gInt).getAdjacentRegions());
        return new RegionInfo(currLand);
    }

}
