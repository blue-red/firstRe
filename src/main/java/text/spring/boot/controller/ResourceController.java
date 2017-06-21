package text.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import text.spring.boot.domain.Resources;
import text.spring.boot.result.RestResultModule;
import text.spring.boot.service.ResourceService;

import java.util.List;

/**
 * Created by jack.wang on 2017/6/20.
 */
@RestController("resourceController")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

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
}
