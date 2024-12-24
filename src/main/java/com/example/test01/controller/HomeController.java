package com.example.test01.controller;

import com.example.test01.bean.Point;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "김남해");
        model.addAttribute("age", 18);
        return "home";
    }

    @GetMapping("/point1")
    @ResponseBody
    public Point getMethodName(@RequestParam("x") Integer x, @RequestParam("y") Integer y) {    // 파라미터 까먹지 말고
        return new Point(x, y);
    }

    @GetMapping("/point2")   // 위에꺼랑 비교
    // @ResponseBody
    public String getMethodName(@ModelAttribute("point") Point point, Model model) {   // @ModelAttribute("point")는 생략가능, 스프링이 알아서 new Point(); p.setX(); p.setY()
        model.addAttribute("point", point);
        return "home";
    }

    @GetMapping("/point3")   // 위에꺼랑 비교
    @ResponseBody
    public Map<String, String> mapShow(@RequestParam Map<String, String> map, Model model) {
        return map;
    }

    @GetMapping("/login")
    public String loginform() {
        return "loginform";
    }

    @GetMapping("/a")
    @ResponseBody
    public String a() {
        return "hello";
    }
}
