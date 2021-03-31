package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ShieldEvent implements Listener {

    @EventHandler
    public void onShieldUse(EntityDamageByEntityEvent event){
            if(event.getDamager() instanceof Player){
                Player player = (Player) event.getDamager();
                if(player.getItemInHand().getItemMeta() == null){
                    return;
                }else{
                    String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
                    if(mainhand.equals(ChatColor.BLACK + "The shield of darkness")){
                        Entity target = event.getEntity();
                        if(target instanceof Player){
                            Player tp = (Player) target;
                            tp.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 200, 5));
                            tp.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 5));
                            tp.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 200, 3));
                        }

                    }
                }
            }else{
                return;
            }
    }

}