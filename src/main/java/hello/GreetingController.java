package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GreetingController {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelmodel = new ModelAndView("index");
        return modelmodel;
    }

    @GetMapping("/map")
    public ModelAndView map(){
        ModelAndView modelmodel = new ModelAndView("map");
        return modelmodel;
    }

    @MessageMapping("/endTurn")
    @SendTo("/topic/gameRoom")
    public Greeting greeting(HelloMessage message) throws Exception {
        return new Greeting("Hello, " + message.getName() + "!");
    }

}
