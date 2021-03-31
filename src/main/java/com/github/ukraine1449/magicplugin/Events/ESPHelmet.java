package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class ESPHelmet implements Listener {

    @EventHandler
    public void EH(PlayerMoveEvent event){
        Player player = event.getPlayer();
        if(player.getEquipment().getHelmet() == null){
            return;
        }else{
            String Helmet = player.getEquipment().getHelmet().getItemMeta().getDisplayName();
            if(Helmet.equals(ChatColor.BLUE + "The all seeing helmet")){
                List<Entity> entities = player.getNearbyEntities(10, 3, 10);
                if(!entities.isEmpty()){
                    for(int i = 0; entities.size() > i; i++){
                        Entity entity = entities.get(i);
                        if(entity instanceof Player){
                            Player tp = (Player) entity;
                            tp.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 200, 1));
                        }
                    }
                }else{
                    return;
                }
            }else if (Helmet == null){
                return;
            }else{
                return;
            }
        }
    }

}
