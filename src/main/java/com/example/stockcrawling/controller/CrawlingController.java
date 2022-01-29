package com.example.stockcrawling.controller;

import java.util.List;

import com.example.dto.ResponseDTO;
import com.example.stockcrawling.model.StockEntity;
import com.example.stockcrawling.service.CrawlingService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/crawling")
public class CrawlingController {
    @Autowired
    private CrawlingService service;
    
  /*  @GetMapping("/stockinfo")
    public String Stockinfo() {
        
        String str = service.StockData();
        return str;
    }*/
    
    @GetMapping("/stockinfojson")
    public ResponseEntity<?> CStock2() {

        List<StockEntity> list = service.StockData();

        ResponseDTO<StockEntity> response = ResponseDTO.<StockEntity>builder().data(list).build();

        return ResponseEntity.badRequest().body(response);
    }
}