package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

import java.util.List;

public class SnowBallHitEvent implements Listener {

    @EventHandler
    public void onBowHit(ProjectileHitEvent event){

        if(event.getEntity() instanceof Snowball){
            if(event.getEntity().getShooter() instanceof Player){
                Player player = (Player) event.getEntity().getShooter();

                if(player.getItemInHand().getItemMeta() == null){
                    return;
                }else{
                    if(((Snowball) event.getEntity()).getItem().getItemMeta().getDisplayName() == ChatColor.DARK_GREEN + "Porta-house"){
                     Location original = event.getHitBlock().getLocation();
                     original.getBlock().setType(Material.COBBLESTONE);

                     Location zpo = original.add(0, 0, 1);
                     zpo.getBlock().setType(Material.COBBLESTONE);

                     original.add(0, 0,2).getBlock().setType(Material.COBBLESTONE);
                     original.add(0, 0,2).getBlock().setType(Material.COBBLESTONE);


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
