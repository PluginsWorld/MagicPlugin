package com.github.ukraine1449.magicplugin.Events;

import com.github.ukraine1449.magicplugin.MagicPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.UUID;

public class SnowBallHitEvent implements Listener {
    MagicPlugin plugin;
    private final ArrayList<UUID> delay = new ArrayList<>();

    public SnowBallHitEvent(MagicPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onHouseClick(PlayerInteractEvent event) {
        if (event == null){
            return;
        }else{
            Player player = event.getPlayer();
            Location original = player.getLocation();
            if(player.getItemInHand().getItemMeta() == null){
                return;
            }else{
                String mainhand = player.getItemInHand().getItemMeta().getDisplayName();
                if(mainhand.equals(ChatColor.DARK_GREEN + "Porta-house")){
                    if (delay.contains(player.getUniqueId())){
                        return;
                    }else{
                        Bukkit.broadcastMessage("1");
                            Material one = Material.COBBLESTONE;
                            delay.add(player.getUniqueId());
                            new BukkitRunnable() {
                                public void run() {
                                    delay.remove(player.getUniqueId());
                                }
                            }.runTaskLater(plugin, 600);
                            //Bottom level
                            original.add(0, 0,0).getBlock().setType(one);

                            original.add(0, 0,1).getBlock().setType(one);
                            original.add(0, 0,-1);

                            original.add(0, 0,2).getBlock().setType(one);
                            original.add(0, 0,-2);

                            original.add(0, 0,-1).getBlock().setType(one);
                            original.add(0, 0,1);

                            original.add(0, 0,-2).getBlock().setType(one);
                            original.add(0, 0,2);

                            original.add(1, 0,0).getBlock().setType(one);
                            original.add(-1, 0,0);

                            original.add(2, 0,0).getBlock().setType(one);
                            original.add(-2, 0,0);

                            original.add(-1, 0,0).getBlock().setType(one);
                            original.add(1, 0,0);

                            original.add(-2, 0,0).getBlock().setType(one);
                            original.add(2, 0,0);

                            original.add(-1, 0,-1).getBlock().setType(one);
                            original.add(1, 0,1);

                            original.add(-2, 0,-2).getBlock().setType(one);
                            original.add(2, 0,2);

                            original.add(-1, 0,-2).getBlock().setType(one);
                            original.add(1, 0,2);

                            original.add(-2, 0,-1).getBlock().setType(one);
                            original.add(2, 0,1);

                            original.add(1, 0,1).getBlock().setType(one);
                            original.add(-1, 0,-1);

                            original.add(2, 0,2).getBlock().setType(one);
                            original.add(-2, 0,-2);

                            original.add(1, 0,2).getBlock().setType(one);
                            original.add(-1, 0,-2);

                            original.add(2, 0,1).getBlock().setType(one);
                            original.add(-2, 0,-1);

                            original.add(-1, 0,1).getBlock().setType(one);
                            original.add(1, 0,-1);

                            original.add(-2, 0,2).getBlock().setType(one);
                            original.add(2, 0,-2);

                            original.add(-1, 0,2).getBlock().setType(one);
                            original.add(1, 0,-2);

                            original.add(-2, 0,1).getBlock().setType(one);
                            original.add(2, 0,-1);

                            original.add(1, 0,-1).getBlock().setType(one);
                            original.add(-1, 0,1);

                            original.add(2, 0,-2).getBlock().setType(one);
                            original.add(-2, 0,2);

                            original.add(1, 0,-2).getBlock().setType(one);
                            original.add(-1, 0,2);

                            original.add(2, 0,-1).getBlock().setType(one);
                            original.add(-2, 0,1);




                            //2nd level
                            original.add(1, 1,-1).getBlock().setType(Material.CRAFTING_TABLE);
                            original.add(-1, -1,1);

                            original.add(-1, 1,-1).getBlock().setType(Material.CHEST);
                            original.add(1, -1,1);

                            original.add(0, 1,-1).getBlock().setType(Material.CHEST);
                            original.add(0, -1,1);

                            original.add(0, 1,2).getBlock().setType(Material.OAK_DOOR);
                            original.add(0, -1,-3);

                            plugin.blocks.clear();

                    }
                }else{
                    return;
                }
            }
        }
    }
}
