package com.github.ukraine1449.magicplugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDropItemEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class LevitationBootsEvent implements Listener {
    public static ArrayList<Player> listOfFlyingPlayers = new ArrayList<>();

    public static void onWingsWear(EntityDropItemEvent event){
        if(event.getEntity() instanceof Player){
            Player player = (Player) event.getEntity();
            if(event.getItemDrop().getItemStack().getItemMeta().getDisplayName() == null){
                return;
            }else{




                if(player.getEquipment().getChestplate() == null){
                    return;
                }else{
                    String Chestplate = player.getEquipment().getChestplate().getItemMeta().getDisplayName();
                    if(Chestplate.equals(ChatColor.DARK_AQUA + "Wings")){
                        ItemStack dropped = event.getItemDrop().getItemStack();
                        if(dropped.getItemMeta().getDisplayName() == ChatColor.BLUE + "Wings activator"){



                                player.setAllowFlight(true);
                                listOfFlyingPlayers.add(player);
                                player.sendMessage(ChatColor.DARK_AQUA + "You can now fly");




                        }else if(dropped.getItemMeta().getDisplayName() == ChatColor.RED + "Wings de-activator"){



                                player.setAllowFlight(false);
                                listOfFlyingPlayers.remove(player);
                                player.sendMessage(ChatColor.DARK_AQUA + "You now cannot fly");

                        }else{
                            return;
                        }

                    }else if (Chestplate == null){
                        return;
                    }else{
                        return;
                    }
                }
            }
        }else{
            return;
        }
    }

}
