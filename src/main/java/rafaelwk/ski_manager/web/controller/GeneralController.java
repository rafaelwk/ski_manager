package rafaelwk.ski_manager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/home")
    public String login(){
        return "home";
    }

    @GetMapping("/loginform")
    public String loginForm(){
        return "login_form";
    }
}
