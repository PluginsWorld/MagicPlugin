package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import java.util.HashMap;
import java.util.UUID;

public class BowEvent implements Listener {
public HashMap<UUID,Long> cooldown = new HashMap<UUID, Long>();
private int cooldowntime = 30;


    @EventHandler
    public void bowUse(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Arrow){
            LivingEntity shooter = (LivingEntity) ((Arrow)event.getDamager()).getShooter();
            Entity damaged = event.getEntity();
            if(shooter instanceof Player){
                Player player = ((Player) shooter).getPlayer();
                if(player.getItemInHand().getItemMeta() == null){
                    return;
                }else{

                    String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
                    if(mainhand.equals(ChatColor.LIGHT_PURPLE + "Cupid's Bow")){
                        if(cooldown.containsKey(player.getUniqueId())){
                            long secondsleft = ((cooldown.get(player.getUniqueId())/1000) + cooldowntime) - (System.currentTimeMillis()/1000);
                            if(secondsleft > 0){
                                event.setCancelled(true);
                                player.sendMessage("You are still on cooldown. There are " + secondsleft + " secconds left");
                            }else{
                                if(damaged instanceof Player){
                                    Player tp = (Player) damaged;
                                    tp.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 30, 5));
                                    tp.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 30, 3));
                                    tp.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1, 5));
                                }else{
                                    return;
                                }
                            }
                        }
                    }else if (mainhand == null){
                        return;
                    }else{
                        return;
                    }
                }
                }else{
                return;
            }
        }


    }

}