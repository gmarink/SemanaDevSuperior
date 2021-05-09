package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public SellerDTO(Seller entity){

        this.id = entity.getId();
        this.name = entity.getName();

    }
    
}
