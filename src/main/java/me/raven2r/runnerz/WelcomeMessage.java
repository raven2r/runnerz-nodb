package me.raven2r.runnerz;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String getWelcomeMessage() {
        return "Welcome to the String Boot me.raven2r.runnerz.Application";
    }
}
