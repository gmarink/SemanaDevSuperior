package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SellerDTO seller;

    public SaleDTO(Sale entity){
        
       this.id = entity.getId();
       this.visited = entity.getVisited();
       this.deals = entity.getDeals();
       this.amount = entity.getAmount();
       this.date = entity.getDate();
       this.seller = new SellerDTO(entity.getSeller());

    }

}
