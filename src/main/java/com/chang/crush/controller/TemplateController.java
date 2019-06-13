package com.chang.crush.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TemplateController {

    @ApiOperation(value="Thymeleaf模版", notes="1")
    @RequestMapping("/Thymeleaf")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://www.thymeleaf.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
    @RequestMapping("/FreeMarker")
    public String indexFtl(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://www.freemarker.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "indexFtl";
    }

    @RequestMapping("/")
    public String security() {
        return "security";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
