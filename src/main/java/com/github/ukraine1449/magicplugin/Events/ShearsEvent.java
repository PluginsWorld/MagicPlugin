package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class ShearsEvent implements Listener {

    @EventHandler
    public void onPlayerKilled(PlayerDeathEvent event){
        Player player = event.getEntity();
        if(player.getKiller() instanceof Player){
            Player killer = player.getKiller();
            if(killer.getEquipment().getChestplate().getItemMeta() == null){
                return;
            }else{
                String mainhand = killer.getEquipment().getItemInHand().getItemMeta().getDisplayName();
                if(mainhand.equals(ChatColor.RED + "Guillotine")){






                }else if (mainhand == null){
                    return;
                }else{
                    return;
                }
            }
        }else{
            return;
        }
    }

}
