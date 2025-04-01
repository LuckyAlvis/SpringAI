package com.shenzhen.dai.ai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 通用配置
 * @author: daiyifan
 * @create: 2025-04-01 21:47
 */
@Configuration
public class CommonConfiguration {
    @Bean
    public ChatClient chatClient(OllamaChatModel model) {
        return ChatClient
                .builder(model)
                .defaultSystem("你的名字叫贾维斯")
                .defaultAdvisors(new SimpleLoggerAdvisor())
                .build();

    }
}
