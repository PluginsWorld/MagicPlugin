package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class VestBigEvent implements Listener {

    @EventHandler
    public void onPlayerBoom(PlayerToggleSneakEvent event){

        Player player = event.getPlayer();
        if(player.getEquipment().getChestplate() == null){
            return;
        }else{
            String Chestplate = player.getEquipment().getChestplate().getItemMeta().getDisplayName();
            if(Chestplate.equals(ChatColor.RED + "Big suicide bomber vest")){

                World w = player.getWorld();
                Location loc = player.getLocation();
                if(player.getEquipment().getChestplate() == null){
                    return;
                }else{
                    player.getEquipment().setChestplate(null);
                }
                w.createExplosion(loc, 15, true);




            }else if(Chestplate.equals(ChatColor.RED + "Suicide bomber vest")){
                World w = player.getWorld();
                Location loc = player.getLocation();
                if(player.getEquipment().getChestplate() == null){
                    return;
                }else{
                    player.getEquipment().setChestplate(null);
                }
                w.createExplosion(loc, 10, true);
            }else{
                return;
            }
        }


    }


}
