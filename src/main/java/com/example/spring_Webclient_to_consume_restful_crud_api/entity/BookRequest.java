package com.example.spring_Webclient_to_consume_restful_crud_api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

    private int bookingId;

    private String userName;

    private String showName;
    @JsonFormat(pattern = "dd/MM/yyyy", shape=JsonFormat.Shape.STRING,timezone = "Asia/Dhaka")
    private Date bookingTime;

    private  int userCount;

    private double price;


}
