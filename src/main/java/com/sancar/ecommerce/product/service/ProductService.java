package com.sancar.ecommerce.product.service;

import com.sancar.ecommerce.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductService extends JpaRepository<Product, Long> {
}
