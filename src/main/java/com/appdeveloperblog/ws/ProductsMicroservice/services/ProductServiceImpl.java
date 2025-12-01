package com.appdeveloperblog.ws.ProductsMicroservice.services;

import com.appdeveloperblog.ws.ProductsMicroservice.models.CreateProductRestModel;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Override
    public String productService(CreateProductRestModel productRestModel) {
        return "";
    }

}
