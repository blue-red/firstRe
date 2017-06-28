package com.text.spring.boot.mapper;

import com.text.spring.boot.domain.Resources;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by jack.wang on 2017/6/23.
 */
@Component
public interface ResourceMapper {
    Long select();

    List<Resources> selectResourcesList();
}
