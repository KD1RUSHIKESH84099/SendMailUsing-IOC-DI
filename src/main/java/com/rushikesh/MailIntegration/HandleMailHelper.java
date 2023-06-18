package com.rushikesh.MailIntegration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HandleMailHelper {
    @Bean
    public HandleMail getHandleMail(){
        return new HandleMail();
    }
}
