package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class TPBEvent implements Listener {

    @EventHandler
    public void onBowHit(ProjectileHitEvent event){

        if(event.getEntity() instanceof Arrow){
            if(event.getEntity().getShooter() instanceof Player){
                Player player = (Player) event.getEntity().getShooter();
                Bukkit.broadcastMessage("tpb 1");
                if(player.getItemInHand().getItemMeta() == null){
                    return;
                }else{
                    Bukkit.broadcastMessage("tpb 2");
                    String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
                    if(mainhand.equals(ChatColor.DARK_BLUE + "Teleport bow")){
                        Bukkit.broadcastMessage("tpb 3");
                        Location loc = event.getEntity().getLocation();
                        player.teleport(loc);
                    }else{
                        return;
                    }
                }
            }else{
                return;
            }
        }else{
            return;
        }
    }
}
