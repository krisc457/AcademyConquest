package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

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
