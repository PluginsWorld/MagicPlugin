package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.List;

public class HammerEvent implements Listener {
    @EventHandler
    public void onHammer(PlayerInteractEvent event) {
        if (event == null){
            return;
        }else{
            Player player = event.getPlayer();
            if(player.getItemInHand().getItemMeta() == null){
                return;
            }else{
                String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
                if(mainhand.equals(ChatColor.RED + "The great fuck you hammer")){
                    List<Entity> entities = player.getNearbyEntities(3, 2, 3);
                    if(!entities.isEmpty()){
                        for(int i = 0; entities.size() > i; i++){
                            Entity entity = entities.get(i);
                            entity.setFallDistance(10);
                        }
                    }else{
                        return;
                    }
                }else if (mainhand == null){
                    return;
                }else{
                    return;
                }
            }
        }
    }

}

