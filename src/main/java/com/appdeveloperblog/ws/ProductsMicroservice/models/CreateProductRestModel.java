package com.appdeveloperblog.ws.ProductsMicroservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class CreateProductRestModel {

    private String title;
    private BigDecimal price;
    private Integer quantity;
}
