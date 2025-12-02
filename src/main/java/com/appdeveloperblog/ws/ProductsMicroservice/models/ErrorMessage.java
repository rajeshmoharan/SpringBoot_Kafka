package com.appdeveloperblog.ws.ProductsMicroservice.models;

import lombok.*;

import java.util.Date;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class ErrorMessage {

    private Date timestamp;
    private String message;
    private String url;

}
