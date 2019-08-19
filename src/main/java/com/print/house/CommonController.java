package com.print.house;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
    @RequestMapping("/firstProductChoice")
    public String firstProductChoice() {
        return "firstProductChoice";
    }


}