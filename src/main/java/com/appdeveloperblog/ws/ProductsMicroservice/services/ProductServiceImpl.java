package com.appdeveloperblog.ws.ProductsMicroservice.services;

import com.appdeveloperblog.ws.ProductsMicroservice.models.CreateProductRestModel;
import com.core.core.ProductCreatedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService{

    private final KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate;


    @Override
    public String productService(CreateProductRestModel productRestModel) throws Exception{

        String productId = UUID.randomUUID().toString();
        ProductCreatedEvent productCreatedEvent = new ProductCreatedEvent(productId,productRestModel.getTitle(),productRestModel.getPrice(),productRestModel.getQuantity());
                

        SendResult<String, ProductCreatedEvent> result = kafkaTemplate
                .send("product-created-event-topic", productId, productCreatedEvent).get();

//        future.whenComplete((result,exe) -> {
//            if(exe != null){
//               log.error("Failed to send the message :" +exe.getMessage());
//            }else {
//                log.error("Message sent successfully :" + result.getRecordMetadata());
//            }
//        });

        return productId;
    }

}
