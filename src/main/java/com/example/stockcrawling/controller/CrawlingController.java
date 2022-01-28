package com.example.stockcrawling.controller;

import com.example.stockcrawling.service.CrawlingService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/crawling")
public class CrawlingController {
    @Autowired
    private CrawlingService service;
    
    @GetMapping("/stockinfo")
    public String Stockinfo() {
        
        String str = service.StockData();
        return str;
    }
}
