package com.github.ukraine1449.magicplugin.Events;

import com.github.ukraine1449.magicplugin.MagicPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class InvisEvent implements Listener {
MagicPlugin plugin;

    public InvisEvent(MagicPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onArmorEquip(PlayerToggleSneakEvent event){
        Player player = event.getPlayer();



        if(player.getEquipment().getHelmet() == null){
            return;
        }else if(player.getEquipment().getChestplate() == null){
            return;
        }
        else if(player.getEquipment().getLeggings() == null){
            return;
        }
        else if(player.getEquipment().getBoots() == null){
            return;
        }else{
            String Helmet = player.getEquipment().getHelmet().getItemMeta().getDisplayName();
            String Chestplate = player.getEquipment().getChestplate().getItemMeta().getDisplayName();
            String Leggings = player.getEquipment().getLeggings().getItemMeta().getDisplayName();
            String Boots = player.getEquipment().getBoots().getItemMeta().getDisplayName();
            if(Helmet.equals(ChatColor.BLACK + "Spy's hat") && Chestplate.equals(ChatColor.BLACK + "Spy's jacket") && Leggings.equals(ChatColor.BLACK + "Spy's pants") && Boots.equals(ChatColor.BLACK + "Spy's sneaky boots")){
                if(plugin.vanished.contains(player)){
                    plugin.vanished.remove(player);
                    for(Player people : Bukkit.getOnlinePlayers()){
                        people.showPlayer(plugin, player);
                    }
                    player.showPlayer(player);
                }else if(!plugin.vanished.contains(player)){
                    plugin.vanished.add(player);
                    for(Player people : Bukkit.getOnlinePlayers()){
                        people.hidePlayer(plugin, player);
                    }
                    player.hidePlayer(player);
                }else{
                    return;
                }
            }else{
                return;
            }
        }

    }


}