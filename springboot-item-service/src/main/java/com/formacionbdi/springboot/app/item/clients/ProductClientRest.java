package com.formacionbdi.springboot.app.item.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.formacionbdi.springboot.app.item.models.Product;

@FeignClient(name="product-service")
@RequestMapping("product")
public interface ProductClientRest {
	
	@GetMapping("/")
	public List<Product> list();
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable Long id);
	
}
