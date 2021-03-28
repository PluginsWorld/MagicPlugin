package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ArrowBodyCountChangeEvent;

public class BowEvent implements Listener {

    @EventHandler
    public void bowUse(ArrowBodyCountChangeEvent event){
            if(event.getEntity() instanceof Player){
                Player player = (Player) event.getEntity();

                Bukkit.broadcastMessage("Vars are: " + event.getEntity() + " 2nd var is " + event.getNewAmount()+ " " + event.getOldAmount());
            }

    }

}
