package com.jmoncayo.template.controller;

import com.jmoncayo.template.model.Template;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template")
public class TemplateController {
    
    @GetMapping
    public Template template(){
        return new Template("id", "name");
    }

}
