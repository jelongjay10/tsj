package com.jelong.tsj;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController("/")
public class JelongController {


    @GetMapping("/first")
    @ResponseBody
    public String getStr(HttpServletRequest request, HttpServletResponse response){
        return "jelong";
    }
}
