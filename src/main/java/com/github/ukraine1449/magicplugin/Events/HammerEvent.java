package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.BoundingBox;

import java.util.List;

import static org.bukkit.Axis.Y;

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
                if(mainhand.equals(ChatColor.RED + "Slammer")){
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

