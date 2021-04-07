package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class VestEvent implements Listener {
    @EventHandler
    public void onPlayerBoom(PlayerToggleSneakEvent event){

        Player player = event.getPlayer();
        if(player.getEquipment().getChestplate() == null){
            return;
        }else{
            String Chestplate = player.getEquipment().getChestplate().getItemMeta().getDisplayName();
            if(Chestplate.equals(ChatColor.RED + "Suicide bomber vest")){

                World w = player.getWorld();
                    Location loc = player.getLocation();
                    w.createExplosion(loc, 10, true);
                if(player.getEquipment().getChestplate() == null){
                    return;
                }else{
                    player.getEquipment().setChestplate(null);
                }




            }else if (Chestplate == null){
                return;
            }else{
                return;
            }
        }


    }

}
