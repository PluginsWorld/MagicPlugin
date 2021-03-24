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
            double XC = player.getLocation().getX();
            double ZC = player.getLocation().getZ();
            double YC = player.getLocation().getY();
            double xp = XC+1;
            double xm = XC-1;
            double ZP = ZC+1;
            double ZM = ZC-1;


        }else{
            return;
        }
    }

}

