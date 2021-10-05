package com.github.ziemang;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class main {

    public static void main (String[] args){

        DiscordApi api = new DiscordApiBuilder()
            .setToken("ODk1MDE2NzI2NDQwMzMzMzQz.YVybSA.L5SiL0gg1eWbH1P5C8FK7DtYm7g")
            .login().join();

        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!gamer")) {
                event.getChannel().sendMessage("TIME");
            }
        });


    }
}
