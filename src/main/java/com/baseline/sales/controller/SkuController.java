package com.baseline.sales.controller;

import com.baseline.sales.dto.ResponseDto;
import com.baseline.sales.dto.SkuDto;
import com.baseline.sales.service.SkuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
@Slf4j
public class SkuController {

    private SkuService skuService;

    @PostMapping("/sku/add")
    public ResponseDto addNewItem(@RequestBody SkuDto request) {
        log.info("Create sku request {}", request);
        SkuDto sku = skuService.createSku(request);
        log.info("Sku added to database with ID {}", sku.getId());
        return ResponseDto.ok(sku);
    }

    @GetMapping("/sku/all")
    public ResponseDto getAllSku() {
        return ResponseDto.ok(skuService.getAll());
    }

    @GetMapping("/sku/stock")
    public ResponseDto getStock() {
        return ResponseDto.ok(skuService.getStock());
    }

    @Autowired
    public void setSkuService(SkuService skuService) {
        this.skuService = skuService;
    }
}
