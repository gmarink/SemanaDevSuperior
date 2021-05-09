package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;


import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repository.SaleRepository;
import com.devsuperior.dsvendas.repository.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;
 
    /*public List<SaleDTO> findAll(){
        List<Sale> result = repository.findAll();

        return result.stream().map(x -> new SaleDTO(x)).collect(Collectors.toList());
    }*/
    @Autowired
    private SellerRepository sellerRepository;

    //com paginação
    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);

        return result.map(x -> new SaleDTO(x));
    }
}
