package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class BootsFallEvent implements Listener {

    @EventHandler
    public void onBootsUse(PlayerMoveEvent event){
        Player player = event.getPlayer();
        if(player.getEquipment().getBoots() == null){
            return;
        }else{
            String Boots = player.getEquipment().getBoots().getItemMeta().getDisplayName();
            if(Boots.equals(ChatColor.BOLD + "Pillow boots")){
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 60, 1));
            }else if (Boots == null){
                return;
            }else{
                return;
            }
        }


        if(player.getEquipment().getHelmet() == null){
            return;
        }else{
            String Helmet = player.getEquipment().getHelmet().getItemMeta().getDisplayName();
            if(Helmet.equals(ChatColor.LIGHT_PURPLE + "Porta-shield")) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 20));
                player.getEquipment().setBoots(null);
            }else{
                return;
            }
        }
    }

}
