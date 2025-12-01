package com.appdeveloperblog.ws.ProductsMicroservice.services;

import com.appdeveloperblog.ws.ProductsMicroservice.models.CreateProductRestModel;

public interface ProductService {

    String productService(CreateProductRestModel productRestModel);
}
