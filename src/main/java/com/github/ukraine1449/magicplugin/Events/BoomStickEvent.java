package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class BoomStickEvent implements Listener {
    @EventHandler
    public void onBoom(EntityDamageByEntityEvent event){

        if(event.getDamager() instanceof Player){
            Player player = (Player) event.getDamager();
            if(player.getItemInHand().getItemMeta() == null){
                return;
            }else{
                String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
                if(mainhand.equals(ChatColor.RED + "Boom Stick")){

                    World w = player.getWorld();
                        Location loc = event.getEntity().getLocation();
                        w.createExplosion(loc, 2, false);
                        player.getEquipment().setItemInMainHand(null);
                }
            }
        }else{
            return;
        }


    }


}
