package com.jmoncayo.applications.repository;

import com.jmoncayo.applications.model.Template;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepository extends MongoRepository<Template, String> {
    
    @Query("{name:'?0'}")
    Template findItemByName(String name);
    
    public long count();
}
