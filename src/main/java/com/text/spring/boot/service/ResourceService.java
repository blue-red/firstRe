package com.text.spring.boot.service;

import com.text.spring.boot.dao.ResourceDao;
import com.text.spring.boot.domain.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by jack.wang on 2017/6/20.
 */
@Service("resourceService")
public class ResourceService {

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

}
