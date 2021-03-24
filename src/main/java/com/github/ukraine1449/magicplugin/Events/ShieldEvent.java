package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ShieldEvent implements Listener {

    @EventHandler
    public void onShieldUse(EntityDamageByEntityEvent event){
            if(event.getDamager() instanceof Player){
                Player player = (Player) event.getDamager();
                String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
                if(mainhand.equals(ChatColor.BLACK + "The shield of darkness")){
                    Bukkit.broadcastMessage("The shield has been activated");
                }
            }
    }


    @EventHandler
    public void onShieldEquip(PlayerItemHeldEvent event){
        if(event == null){
            return;
        }else{
            Player player = event.getPlayer();
            String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
            if(mainhand.equals(ChatColor.BLACK + "The shield of darkness")){
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 2, 1));
            }
        }
    }

}