package com.text.spring.boot.dao;

import com.text.spring.boot.domain.Resources;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by jack.wang on 2017/6/20.
 */
public interface ResourceDao extends CrudRepository <Resources,Long>{

    @Query(value = "select r from Resources r where r.resType = ?1")
    List<Resources> getAllByResType(String type);
}
