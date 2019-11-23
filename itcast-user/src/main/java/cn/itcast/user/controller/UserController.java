package cn.itcast.user.controller;

import cn.itcast.user.pojo.UtoStorageEntity;
import cn.itcast.user.service.UtoStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * <code>UserController</code>
 * </p>
 *
 * @author huiwang45@iflytek.com
 * @description
 * @date 2019/10/15 17:26
 */

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UtoStorageService utoStorageService;

    @ResponseBody
    @RequestMapping("test")
    public String test(){
        return  "hello user!";
    }

    @RequestMapping("query-list")
    public String queryList(Model model)
    {
        List<UtoStorageEntity> utoStorageList = utoStorageService.queryList();
        model.addAttribute("utoStorageList",utoStorageList);
        return  "utoStorageList";
    }


}
