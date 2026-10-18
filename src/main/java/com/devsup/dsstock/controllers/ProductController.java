package com.devsup.dsstock.controllers;

import com.devsup.dsstock.entities.Product;
import com.devsup.dsstock.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping(value = "/products")
    public class ProductController {

        @Autowired
        private ProductRepository productRepository;

        @GetMapping
        public Page<Product> getProducts(Pageable pageable) {
            return productRepository.findAll(pageable);
        }
    }

