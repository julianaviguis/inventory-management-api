package com.devsup.dsstock.services;
import com.devsup.dsstock.entities.Product;
import com.devsup.dsstock.repositories.ProductRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<Product> findAll(){
        return repository.findAll();

    }
}
