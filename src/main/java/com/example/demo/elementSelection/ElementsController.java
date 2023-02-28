package com.example.demo.elementSelection;

import com.example.demo.design.DesignService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;

@RestController
public class ElementsController {
    private final ElementsService elementsService;

    @Autowired
    public ElementsController(ElementsService elementsService) {
        this.elementsService = elementsService;
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @GetMapping(path = "/elementlist")
    public List<Map<String, Object>> getDesigns() {
        String sql = "select * from elements";
        return jdbcTemplate.queryForList(sql);
    }
}


