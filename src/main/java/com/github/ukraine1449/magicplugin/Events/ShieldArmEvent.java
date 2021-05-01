package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ShieldArmEvent implements Listener {

    @EventHandler
    public void portashield(PlayerMoveEvent event){
        Player player = event.getPlayer();
        if(player.getEquipment().getBoots() == null){
            return;
        }else{
            String Helmet = player.getEquipment().getBoots().getItemMeta().getDisplayName();
            if(Helmet.equals(ChatColor.LIGHT_PURPLE + "Porta-shield")){
                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 20));
                player.getEquipment().setBoots(null);
            }else if (Helmet == null){
                return;
            }else{
                return;
            }
        }
    }

}
