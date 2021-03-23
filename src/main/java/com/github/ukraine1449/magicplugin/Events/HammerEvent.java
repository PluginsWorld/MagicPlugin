package com.github.ukraine1449.magicplugin.Events;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HammerEvent implements Listener {
    @EventHandler
    public void onHammer(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack mainhand = player.getEquipment().getItemInMainHand();
        if(mainhand.getItemMeta().getDisplayName() == ChatColor.RED + "The great fuck you hammer"){
            Bukkit.broadcastMessage("Code 1119");
        }else{
            return;
        }
    }

}

