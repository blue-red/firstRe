package com.text.spring.boot.controller;

import com.text.spring.boot.domain.Resources;
import com.text.spring.boot.result.RestResultModule;
import com.text.spring.boot.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by jack.wang on 2017/6/20.
 */
@RestController("resourceController")
@RequestMapping("/jpa")
public class ResourceController {

    @Resource(name = "resourceService")
    private ResourceService resourceService;

    @Autowired
    private HttpServletResponse response;

    @RequestMapping("/info/{id}")
    public RestResultModule getResourceInfo(@PathVariable Long id){
        RestResultModule restResultModule = new RestResultModule();
        Resources resources = resourceService.getResourcesInfo(id);
        restResultModule.putData("200",resources);
        return restResultModule;
    }

    @RequestMapping("/info/add")
    public RestResultModule addResourceInfo(){
        RestResultModule restResultModule = new RestResultModule();
        List<Resources> list = resourceService.addResources();
        restResultModule.putData("200",list);
        return restResultModule;
    }

    @RequestMapping("/info/list")
    public RestResultModule getListInfo(){
        RestResultModule restResultModule = new RestResultModule();
        List<Resources> list = resourceService.getResourceInfo();
        restResultModule.putData("200",list);
        return restResultModule;
    }
}
