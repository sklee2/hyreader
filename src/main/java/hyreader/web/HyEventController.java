package hyreader.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HYU on 2015-08-20.
 */
@Controller
public class HyEventController {
    @RequestMapping("/")
    String index(){
        return "index";
    }
}
