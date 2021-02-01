package com.formacionbdi.springboot.app.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.item.models.Item;
import com.formacionbdi.springboot.app.item.models.service.ItemService;

@RestController
@RequestMapping("item")
public class ItemController {
	
	@Autowired
	@Qualifier("serviceRestTemplate")
	private ItemService itemService;
	
	@GetMapping("/")
	public List<Item> list() {
		return itemService.findAll();
	}
	
	@GetMapping("/{id}/quantity/{qty}")
	public Item list(@PathVariable Long id, @PathVariable Integer qty) {
		return itemService.findById(id, qty);
	}

}
