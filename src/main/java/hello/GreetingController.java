package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {
    List<Region> stuff = new ArrayList();
    Board boardstuff = new Board();
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelmodel = new ModelAndView("index");
        return modelmodel;
    }


    @GetMapping("/map")
    public ModelAndView map() {
        ModelAndView mapmodel = new ModelAndView("map");

        List<Region> gameStuff = boardstuff.getRegions();

        System.out.println("Land" + gameStuff.get(30).getName());

        return mapmodel.addObject(gameStuff.get(20).getRegionID());
    }

    @MessageMapping("/endTurn")
    @SendTo("/topic/gameRoom")
    public Greeting greeting(HelloMessage message) throws Exception {
        return new Greeting("Hello, " + message.getName() + "!");
    }

}
