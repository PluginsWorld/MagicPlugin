package com.github.ukraine1449.magicplugin.Events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MainHand;
import org.bukkit.inventory.meta.ItemMeta;

public class HammerEvent implements Listener {
    @EventHandler
    public void onHammer(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
        if(mainhand.equals(ChatColor.RED + "The great fuck you hammer")){
            int XC = player.getLocation().getBlockX();
            int ZC = player.getLocation().getBlockZ();
            int YC = player.getLocation().getBlockY();
        }else{
            return;
        }
    }

}

