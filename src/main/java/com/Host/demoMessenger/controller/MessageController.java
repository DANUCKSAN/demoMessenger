package com.Host.demoMessenger.controller;

import com.Host.demoMessenger.domain.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/hello")
    public Message startMessage(@RequestParam(value="name", defaultValue="World") String name){
        return new Message(String.format("Hello %s!",name));

    }
    @GetMapping("/goodbye")
    public Message endMessage(@RequestParam(value = "name",defaultValue = "world")String name){
        return new Message(String.format("see you next time",name));
    }

    }

