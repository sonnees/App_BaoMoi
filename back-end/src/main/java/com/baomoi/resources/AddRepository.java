package com.baomoi.resources;

import com.baomoi.entity.Publisher;
import com.baomoi.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/publisher")
public class AddRepository {
    private final PublisherService service;

    @Autowired
    public AddRepository(PublisherService service) {
        this.service = service;
    }

    @GetMapping
    public List<Publisher> getAll(){
        return service.getAll();
    }

    @GetMapping("/str")
    public String getString(){
        return "hi";
    }
}
