package com.text.spring.boot.controller;

import com.text.spring.boot.domain.Resources;
import com.text.spring.boot.result.RestResultModule;
import com.text.spring.boot.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jack.wang on 2017/6/23.
 */

@RestController
@RequestMapping("/mybatis")
public class ResourcesMybatisController {

    @Autowired
    private ResourceService resourceService;

    @RequestMapping("/info/list/count")
    public RestResultModule selectListInfo(){
        RestResultModule restResultModule = new RestResultModule();
        Long resources = resourceService.selectResourceInfo();
        restResultModule.putData("info",resources);
        return restResultModule;
    }

    @RequestMapping("/info/list/all")
    public RestResultModule selectListAll(){
        RestResultModule restResultModule = new RestResultModule();
        List<Resources> list = resourceService.selectResourceList();
        restResultModule.putData("info",list);
        return restResultModule;
    }
}
