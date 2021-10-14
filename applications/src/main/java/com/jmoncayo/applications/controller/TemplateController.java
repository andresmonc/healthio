package com.jmoncayo.template.controller;

import java.rmi.ServerException;
import java.util.List;

import com.jmoncayo.template.model.Template;
import com.jmoncayo.template.repository.TemplateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template")
public class TemplateController {
    
    @Autowired
    TemplateRepository templateRepository;

    @GetMapping
    public List<Template> getTemplates(){
        return templateRepository.findAll();
    }

    @GetMapping("/{id}")
    public List<Template> getTemplateByID(@PathVariable("id") final int id){
        return templateRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Template> addTemplate(@RequestBody Template newTemplate){
        Template template = templateRepository.save(newTemplate);
        return new ResponseEntity<>(template, HttpStatus.CREATED);
    }

}
