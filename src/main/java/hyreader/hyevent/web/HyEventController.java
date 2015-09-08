package hyreader.hyevent.web;

import hyreader.hyevent.domain.HyEvent;
import hyreader.hyevent.service.HyEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by HYU on 2015-08-20.
 */
@Controller
@RequestMapping("hyEvents")
public class HyEventController {
    @Autowired
    HyEventService hyEventService;

    @RequestMapping("index")
    String index(){
        return "hyEvents/index";
    }

    @RequestMapping(method = RequestMethod.GET)
    String list(Model model) {
        List<HyEvent> hyEvents = hyEventService.findAll();
        model.addAttribute("hyEvents", hyEvents);
        return "hyEvents/list";

    }
}
