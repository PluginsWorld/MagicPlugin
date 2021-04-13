package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class PlayerDeathEvent implements Listener {

    public static void onPlayerDeath(org.bukkit.event.entity.PlayerDeathEvent event){
            Player player = event.getEntity();
            if(player.getAllowFlight() == true){
                player.setAllowFlight(false);
            }else{
                return;
            }


    }

}
