package org.chen.controller;

import org.chen.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 * @create 2019-04-14 16:01
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/page")
    public String index(ModelMap map, @RequestParam String key) {

        personService.setKey("key", key);
        System.out.println(personService.getKey("key"));
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        map.addAttribute("key", personService.getKey("key"));
        // return模板文件的名称，对应src/main/resources/templates/index.html
        System.out.println("page");
        return "index";
//        return new ModelAndView("index", "messages", null);

    }


}