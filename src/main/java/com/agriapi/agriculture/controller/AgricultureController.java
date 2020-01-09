package com.agriapi.agriculture.controller;

import com.agriapi.agriculture.service.AgricultureService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*  REST Controller
*/
@RestController
@RequestMapping("/api")

public class AgricultureController {

    private final AgricultureService agricultureService;

    /**
     * Constructeur
     */
    public AgricultureController(AgricultureService agricultureService) {
        this.agricultureService = agricultureService;
    }
}
