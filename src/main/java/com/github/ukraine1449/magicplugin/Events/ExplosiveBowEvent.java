package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ExplosiveBowEvent implements Listener {

    @EventHandler
    public void onBowHit(ProjectileHitEvent event){

        if(event.getEntity() instanceof Arrow){
            if(event.getEntity().getShooter() instanceof Player){
                Player player = (Player) event.getEntity().getShooter();










            }else{
                return;
            }
        }else{
            return;
        }



    }

}
