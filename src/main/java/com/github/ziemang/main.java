package com.github.ziemang;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class main {

    public static void main (String[] args){

        DiscordApi api = new DiscordApiBuilder()
            .setToken("token")
            .login().join();

        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!gamer")) {
                event.getChannel().sendMessage("TIME");
            }
        });


    }
}
