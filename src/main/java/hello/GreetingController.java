package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    @GetMapping("/")
    public ModelAndView index(){
        int abc = 1;
        int patrik = 7;
        int efg = 99;
        ModelAndView modelmodel = new ModelAndView("index");
        return modelmodel;
    }


    @GetMapping("/map")
    public ModelAndView map() {
        ModelAndView mapmodel = new ModelAndView("map");
        return mapmodel;
    }

    @MessageMapping("/endTurn")
    @SendTo("/topic/gameRoom")
    public Greeting greeting(HelloMessage message) throws Exception {
        return new Greeting("Hello, " + message.getName() + "!");
    }

}
