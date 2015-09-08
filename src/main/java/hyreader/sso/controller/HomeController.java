package hyreader.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by MyiMac on 15. 9. 5..
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("/")
    String index(){
        return "index";
    }
}
