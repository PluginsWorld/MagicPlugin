package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class PlayerDeathEvent implements Listener {

    public static void onPlayerDeath(org.bukkit.event.entity.PlayerDeathEvent event){
            Player player = event.getEntity();
            if(player.getAllowFlight() == true){
                player.setAllowFlight(false);
            }else{
                return;
            }
        if(player.getKiller() instanceof Player){
            Player killer = player.getKiller();
            if(killer.getItemInHand().getItemMeta() == null){
                return;
            }else{
                String mainhand = killer.getEquipment().getItemInHand().getItemMeta().getDisplayName();
                if(mainhand.equals(ChatColor.RED + "Guillotine")){
                    ItemStack playerhead = new ItemStack(Material.PLAYER_HEAD);
                    SkullMeta phm = (SkullMeta) playerhead.getItemMeta();
                    phm.setOwningPlayer(Bukkit.getOfflinePlayer(player.getUniqueId()));
                    playerhead.setItemMeta(phm);
                    killer.getInventory().addItem(playerhead);



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
