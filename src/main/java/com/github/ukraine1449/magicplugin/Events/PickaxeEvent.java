package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PickaxeEvent implements Listener {
    @EventHandler
    public static void onBlockBreak(BlockBreakEvent event){
            Player player = event.getPlayer();
        if(player.getItemInHand().getItemMeta() == null){
                return;
            }else{
                String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
                if(mainhand.equals(ChatColor.GOLD + "Excavator")){
                    System.out.println("Test");
                    Location loc = event.getPlayer().getLocation();
                    World w = player.getWorld();
                    w.createExplosion(loc, 2, false);
                }else{
                    return;
                }
            }
    }
}
