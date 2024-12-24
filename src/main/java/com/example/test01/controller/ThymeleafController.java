package com.example.test01.controller;

import com.example.test01.dto.MemberDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Slf4j
public class ThymeleafController {
    @GetMapping("/th/ex01")
    public String ex01(Model model){
        model.addAttribute("member", MemberDto.builder().name("aaa").age(10).build());
        return "th/ex01";
    }

    @GetMapping("/th/ex02")
    public String ex02(){
        return "th/ex02";
    }

    @GetMapping("/th/ex03")
    public String ex03(@ModelAttribute MemberDto member){
        log.info(member.toString());
        return "th/ex03";
    }

    @GetMapping("/th/ex04/{name}/{age}")
    public String ex04(@PathVariable String name, @PathVariable Integer age){
        log.info("{}", MemberDto.builder().name(name).age(age).build().toString());
        return "th/ex04";
    }
}
