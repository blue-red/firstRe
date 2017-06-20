package text.spring.boot.dao;

import org.springframework.data.repository.CrudRepository;
import text.spring.boot.domain.Resources;

/**
 * Created by jack.wang on 2017/6/20.
 */

public interface ResourceDao extends CrudRepository <Resources,Long>{

}
