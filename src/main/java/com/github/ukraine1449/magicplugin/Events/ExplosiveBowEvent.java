package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ExplosiveBowEvent implements Listener {

    @EventHandler
    public void onBowHit(ProjectileHitEvent event){

        if(event.getEntity() instanceof Arrow){
            if(event.getEntity().getShooter() instanceof Player){
                Player player = (Player) event.getEntity().getShooter();

                if(player.getItemInHand().getItemMeta() == null){
                    return;
                }else{
                    String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
                    if(mainhand.equals(ChatColor.RED + "Boom bow")){

                        World w = player.getWorld();
                        Location loc = event.getHitBlock().getLocation();
                        w.createExplosion(loc, 2, false);





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
