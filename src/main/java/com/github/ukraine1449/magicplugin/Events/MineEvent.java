package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class MineEvent implements Listener {

    public void onPlayerStep(PlayerInteractEvent event){
        Player player = event.getPlayer();
        ItemStack mine = new ItemStack(Material.PAINTING);
        if(event.getItem() == mine){
            if(event.getItem().getItemMeta() == null){
                return;
            }else{
                String name = event.getItem().getItemMeta().getDisplayName();
                if(name == ChatColor.BLACK + "Mine"){
                    World w = player.getWorld();
                    Location loc = event.getClickedBlock().getLocation();
                    w.createExplosion(loc, 5, false);
                    event.setCancelled(true);
                }else{
                    return;
                }
            }
        }else{
            return;
        }
    }
}
