package com.example.demo.contracts;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;


@AiService
public interface AiLayer {

    @UserMessage("wish with good will include the {{name}} in the content")
    public String getAiMessage(String name);
}
