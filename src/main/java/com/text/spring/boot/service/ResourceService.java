package com.text.spring.boot.service;

import com.text.spring.boot.dao.ResourceDao;
import com.text.spring.boot.domain.Resources;
import com.text.spring.boot.mapper.ResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by jack.wang on 2017/6/20.
 */
@Service
public class ResourceService {

    @Autowired
    ResourceMapper resourceMapper;

    @Autowired
    private ResourceDao resourceDao;

    public Resources getResourcesInfo(Long id){
        Resources resources = resourceDao.findOne(id);

        return resources;
    }

    public List<Resources> addResources(){
        List<Resources> list = new ArrayList<Resources>();
        for(int i=0; i<=50; i++){
            Resources resources = new Resources();
            resources.setResTitle("我是标题"+i);
            resources.setResType("YY");
            resources.setResUuid(UUID.randomUUID().toString());
            list.add(resources);
            resourceDao.save(resources);
        }
        return list;
    }

    public List<Resources> getResourceInfo(){
        List<Resources> list = resourceDao.getAllByResType("YY");

        return list;
    }

    /***
     * mybatis查询
     * @return
     */
    public Long selectResourceInfo(){
        System.out.println(resourceMapper);
        Long resources = resourceMapper.select();
        return resources;
    }

    public List<Resources> selectResourceList(){

        List<Resources> list = resourceMapper.selectResourcesList();

        return list;
    }




}
