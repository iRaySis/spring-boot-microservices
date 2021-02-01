package com.formacionbdi.springboot.app.item.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

	public Item() {
	}

	public Item(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	private Product product;

	private Integer quantity;
	
	public Double getTotal() {
		if (product.getPrice() == null || this.quantity == null) {
			return -1.0;
		}
		return product.getPrice() * this.quantity.doubleValue();
	}

}
