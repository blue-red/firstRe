package text.spring.boot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import text.spring.boot.domain.Resources;

/**
 * Created by jack.wang on 2017/6/20.
 */

public interface ResourceDao extends CrudRepository <Resources,Long>{

}
