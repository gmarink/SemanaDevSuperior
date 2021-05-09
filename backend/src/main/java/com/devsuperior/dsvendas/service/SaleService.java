package com.devsuperior.dsvendas.service;

import com.devsuperior.dsvendas.repository.SaleRepository;
import com.devsuperior.dsvendas.repository.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;
    
}
