package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SlowStickEvent implements Listener {

    @EventHandler
    public void ScytheEvent(EntityDamageByEntityEvent event){

        if(event.getDamager() instanceof Player){
            Player player = (Player) event.getDamager();
            if(player.getItemInHand().getItemMeta() == null){
                return;
            }else{
                String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
                if(mainhand.equals(ChatColor.BOLD + "Feet whacker")){
                    Entity target = event.getEntity();
                    if(target instanceof Player){
                        Player tp = (Player) target;
                        tp.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 2));
                    }

                }
            }
        }else{
            return;
        }


    }

}
