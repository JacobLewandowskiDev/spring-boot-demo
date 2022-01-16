package com.example.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {

    private final DataService service;

    public DataController(DataService service) {
        this.service = service;
    }

    @GetMapping
    public List<Data> getAllData() {
        return service.getAllData();
    }

    @PostMapping
    public void addData(@RequestBody Data data) {
        service.addData(data);
    }
}
