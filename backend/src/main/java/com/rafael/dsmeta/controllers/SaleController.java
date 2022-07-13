package com.rafael.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.dsmeta.entities.Sale;
import com.rafael.dsmeta.servicies.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<List<Sale>> findSales() {
		List<Sale> sales = saleService.findSales();
		return ResponseEntity.status(HttpStatus.OK).body(sales);
	}

}
