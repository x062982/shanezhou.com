package com.shaneZhou.SpringBootDemo.controller;

import com.shaneZhou.SpringBootDemo.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author ZhouWX
 * @createDate 2020/5/26
 */
@Controller
public class BootController {

    @RequestMapping("toThymeleaf")
    public String toThymeleaf(Map<String, Object> map) {
        map.put("welcome", "<h3>welcome欢迎 Thymeleaf</h3>");    // 给request域中放入welcome的值
        List<Product> list = new ArrayList<>();
        list.add(new Product("a", 10, 100));
        list.add(new Product("b", 40, 300));
        list.add(new Product("c", 1310, 500));
        map.put("prods", list);
        return "thymeleaf";
    }
}
