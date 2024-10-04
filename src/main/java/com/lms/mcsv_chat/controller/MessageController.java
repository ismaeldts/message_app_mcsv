package com.lms.mcsv_chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;

public class MessageController {

  @MessageMapping("/chat.sendMessage")
  public String sendMessage(String message){
    return message;
  }
}
