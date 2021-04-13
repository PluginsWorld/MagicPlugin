package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class NukeEvent implements Listener {

    @EventHandler
    public void onNukeDetonate(PlayerDropItemEvent event){
        Player player = event.getPlayer();
        String itemdrop = event.getItemDrop().getItemStack().getItemMeta().getDisplayName();
        if(itemdrop == ChatColor.RED + "A portable fucking nuke"){
            World w = player.getWorld();
            Location loc = event.getItemDrop().getLocation();
            w.createExplosion(loc, 100, true);
        }else{
            return;
        }
    }

}
