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

public class SnowBallHitEvent implements Listener {
    MagicPlugin plugin;

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
                    Bukkit.broadcastMessage("1");
                    if(plugin.blocks.size() < 4){
                        Bukkit.broadcastMessage("2");
                        if(event.getClickedBlock() == null){
                            return;
                        }else{
                            Bukkit.broadcastMessage("3");
                            plugin.blocks.add(event.getClickedBlock());
                        }
                    }else if(plugin.blocks.size() == 3){
                        Bukkit.broadcastMessage("4");
                                Block one = plugin.blocks.get(1);
                                Block two = plugin.blocks.get(2);
                                Block three = plugin.blocks.get(3);
                                //Bottom level
                                original.add(0, 0,0).getBlock().setType(one.getType());

                                original.add(0, 0,1).getBlock().setType(one.getType());
                                original.add(0, 0,-1).getBlock().setType(one.getType());

                                original.add(0, 0,2).getBlock().setType(one.getType());
                                original.add(0, 0,-2).getBlock().setType(one.getType());

                                original.add(0, 0,-1).getBlock().setType(one.getType());
                                original.add(0, 0,1).getBlock().setType(one.getType());

                                original.add(0, 0,-2).getBlock().setType(one.getType());
                                original.add(0, 0,2).getBlock().setType(one.getType());

                                original.add(1, 0,0).getBlock().setType(one.getType());
                                original.add(-1, 0,0).getBlock().setType(one.getType());

                                original.add(2, 0,0).getBlock().setType(one.getType());
                                original.add(-2, 0,0).getBlock().setType(one.getType());

                                original.add(-1, 0,0).getBlock().setType(one.getType());
                                original.add(1, 0,0).getBlock().setType(one.getType());

                                original.add(-2, 0,0).getBlock().setType(one.getType());
                                original.add(2, 0,0).getBlock().setType(one.getType());

                                original.add(-1, 0,-1).getBlock().setType(one.getType());
                                original.add(1, 0,1).getBlock().setType(one.getType());

                                original.add(-2, 0,-2).getBlock().setType(one.getType());
                                original.add(2, 0,2).getBlock().setType(one.getType());

                                original.add(-1, 0,-2).getBlock().setType(one.getType());
                                original.add(1, 0,2).getBlock().setType(one.getType());

                                original.add(-2, 0,-1).getBlock().setType(one.getType());
                                original.add(2, 0,1).getBlock().setType(one.getType());

                                original.add(1, 0,1).getBlock().setType(one.getType());
                                original.add(-1, 0,-1).getBlock().setType(one.getType());

                                original.add(2, 0,2).getBlock().setType(one.getType());
                                original.add(-2, 0,-2).getBlock().setType(one.getType());

                                original.add(1, 0,2).getBlock().setType(one.getType());
                                original.add(-1, 0,-2).getBlock().setType(one.getType());

                                original.add(2, 0,1).getBlock().setType(one.getType());
                                original.add(-2, 0,-1).getBlock().setType(one.getType());

                                original.add(-1, 0,1).getBlock().setType(one.getType());
                                original.add(1, 0,-1).getBlock().setType(one.getType());

                                original.add(-2, 0,2).getBlock().setType(one.getType());
                                original.add(2, 0,-2).getBlock().setType(one.getType());

                                original.add(-1, 0,2).getBlock().setType(one.getType());
                                original.add(1, 0,-2).getBlock().setType(one.getType());

                                original.add(-2, 0,1).getBlock().setType(one.getType());
                                original.add(2, 0,-1).getBlock().setType(one.getType());

                                original.add(1, 0,-1).getBlock().setType(one.getType());
                                original.add(-1, 0,1).getBlock().setType(one.getType());

                                original.add(2, 0,-2).getBlock().setType(one.getType());
                                original.add(-2, 0,2).getBlock().setType(one.getType());

                                original.add(1, 0,-2).getBlock().setType(one.getType());
                                original.add(-1, 0,2).getBlock().setType(one.getType());

                                original.add(2, 0,-1).getBlock().setType(one.getType());
                                original.add(-2, 0,1).getBlock().setType(one.getType());




                                //2nd level
                                original.add(1, 1,-1).getBlock().setType(Material.CRAFTING_TABLE);
                                original.add(-1, -1,1).getBlock().setType(one.getType());

                                original.add(-1, 1,-1).getBlock().setType(Material.CHEST);
                                original.add(1, -1,1).getBlock().setType(one.getType());

                                original.add(0, 1,-1).getBlock().setType(Material.CHEST);
                                original.add(0, -1,1).getBlock().setType(one.getType());

                                original.add(0, 1,3).getBlock().setType(Material.OAK_DOOR);
                                original.add(0, -1,-3).getBlock().setType(one.getType());

                    }else{
                        Bukkit.broadcastMessage("10");
                        return;
                    }
                }else if (mainhand == null){
                    return;
                }else{
                    return;
                }
            }
        }
    }
}
