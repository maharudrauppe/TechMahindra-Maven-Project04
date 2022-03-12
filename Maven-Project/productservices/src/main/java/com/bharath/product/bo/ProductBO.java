package com.bharath.product.bo;

import com.bharath.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
