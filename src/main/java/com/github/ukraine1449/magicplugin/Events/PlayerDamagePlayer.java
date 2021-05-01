package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerDamagePlayer implements Listener {


    @EventHandler
    public static void onPlayerDamagePlayer(EntityDamageByEntityEvent event){

        if(event.getDamager() instanceof Player){

            if(event.getEntity() instanceof Player){
                Player player = (Player) event.getDamager();
                String mainhand = player.getItemInHand().getItemMeta().getDisplayName();


                if(mainhand.equals(ChatColor.BLACK + "Death's scythe")){
                    Entity target = event.getEntity();
                    if(target instanceof Player){
                        Player tp = (Player) target;
                        tp.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 72000, 8));
                        tp.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 72000, 1));
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 120, 10));
                    }else{
                        return;
                    }

                }else if(mainhand.equals(ChatColor.RED + "Boom Stick")){

                    World w = player.getWorld();
                    Location loc = event.getEntity().getLocation();
                    w.createExplosion(loc, 2, false);
                    player.getEquipment().setItemInMainHand(null);
                }

                else if(mainhand.equals(ChatColor.BOLD + "Feet whacker")){
                    Entity target = event.getEntity();
                    if(target instanceof Player){
                        Player tp = (Player) target;
                        tp.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 2));
                    }

                }else if(mainhand.equals(ChatColor.BLACK + "The shield of darkness")){
                    Entity target = event.getEntity();
                    if(target instanceof Player){
                        Player tp = (Player) target;
                        tp.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 200, 5));
                        tp.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 5));
                        tp.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 200, 3));
                    }else{
                        return;
                    }
                }


            }else{
                return;
            }

        }else{
            return;
        }


    }



}
