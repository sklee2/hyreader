package hyreader.api;

import hyreader.domain.HyEvent;
import hyreader.service.HyEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by MyiMac on 15. 8. 23..
 */
@RestController
@RequestMapping("api/hyevent")
public class HyEventRestController {
    @Autowired
    HyEventService hyEventService;

    @RequestMapping(method = RequestMethod.GET)
    List<HyEvent> getHyEvents() {
        List<HyEvent> hyEvents = (List<HyEvent>) hyEventService.findAll();
        return hyEvents;
    }

    @RequestMapping(value = "{event_seq}", method = RequestMethod.GET)
    HyEvent getEvent(@PathVariable Long event_seq){
        HyEvent hyEvent = hyEventService.findOne(event_seq);
        return hyEvent;
    }


}
