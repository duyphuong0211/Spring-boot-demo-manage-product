package com.example.model.rabbit;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MessageBusDTO implements Serializable {
    private String messageId;
    private String message;
    private Date messageDate;
}
