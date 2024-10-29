package com.example.demo.controller;

import com.example.demo.contracts.AiLayer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AiController {

    private final AiLayer aiLayer;

    @GetMapping("/ai/chat")
    public String getAiMessage(@RequestParam("name") String name){
        return aiLayer.getAiMessage(name);
    }

}
