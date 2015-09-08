package hyreader.hyevent.service;

import hyreader.hyevent.domain.HyEvent;
import hyreader.hyevent.domain.HyEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by MyiMac on 15. 8. 23..
 */

@Service
@Transactional
public class HyEventService {
    @Autowired
    HyEventRepository hyEventRepository;

    public List<HyEvent> findAll() {
        return (List<HyEvent>) hyEventRepository.findAll();

    }

    public HyEvent findOne(Long event_seq){
        return hyEventRepository.findOne(event_seq);

    }

    public HyEvent create(HyEvent hyEvent){
        return hyEventRepository.save(hyEvent);
    }

    public HyEvent update(HyEvent hyEvent){
        return hyEventRepository.save(hyEvent);
    }

    public void delete(Long event_seq){
        hyEventRepository.delete(event_seq);
    }
}
