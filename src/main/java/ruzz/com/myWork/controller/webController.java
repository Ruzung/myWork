package ruzz.com.myWork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/myWork")
public class webController {
    
    @ResponseBody
    @RequestMapping(value={"/hello"},method=RequestMethod.GET)
    public String webHelloWork() {
        
        System.out.println("hello world!");
        return "hello world";
    }
    
}
