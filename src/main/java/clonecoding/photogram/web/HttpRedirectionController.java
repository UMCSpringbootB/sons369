package clonecoding.photogram.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;

@Controller
public class HttpRedirectionController {

    @GetMapping("/home")
    public String home(){
        //1만줄 가정
        return "home";
    }

    @GetMapping("/away")
    public String away(){
        //다른 코드


        return "redirect:home"; //리다이렉션된다.
    }
}
