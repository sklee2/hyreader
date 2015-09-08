package hyreader.hyevent.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by HYU on 2015-08-20.
 */
@Repository
public interface HyEventRepository extends CrudRepository<HyEvent, Long> {
}
