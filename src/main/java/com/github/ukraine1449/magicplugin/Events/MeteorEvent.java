package com.github.ukraine1449.magicplugin.Events;

import com.github.ukraine1449.magicplugin.MagicPlugin;
import org.bukkit.*;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class MeteorEvent implements Listener {
MagicPlugin plugin;

    public MeteorEvent(MagicPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBowHit(ProjectileHitEvent event){

        if(event.getEntity() instanceof Arrow){
            if(event.getEntity().getShooter() instanceof Player){
                Player player = (Player) event.getEntity().getShooter();
                    Location orl = event.getEntity().getLocation();
                if(player.getItemInHand().getItemMeta() == null){
                    return;
                }else{
                    String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
                    if(mainhand.equals(ChatColor.BOLD + "Meteor bow")){
                        Random random = new Random();
                        Bukkit.getScheduler().runTaskLater(plugin, () -> {
                            for(int i = random.nextInt();i < 11; i++){
                                ArmorStand stand = (ArmorStand) player.getWorld().spawnEntity(event.getEntity().getLocation().add(0,10,0), EntityType.ARMOR_STAND);
                                stand.setInvisible(true);
                                ItemStack met = new ItemStack(Material.PLAYER_HEAD);
                                stand.setHelmet(met);
                                Bukkit.getScheduler().runTaskLater(plugin, () -> {
                                    World w = player.getWorld();
                                    Location loc = player.getLocation();
                                    w.createExplosion(loc, 3, true);
                                    stand.remove();
                                }, 200L);
                            }                        }, 600L);




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
