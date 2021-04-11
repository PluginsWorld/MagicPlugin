package com.github.ukraine1449.magicplugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class SlowStick implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.slowstick")){
                ItemStack stick = new ItemStack(Material.STICK);
                ItemMeta sm = stick.getItemMeta();
                sm.setDisplayName(ChatColor.BOLD + "Feet whacker");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.BOLD + "A stick to give opponenets slowness");
                sm.setLore(lore);
                stick.setItemMeta(sm);
                player.getInventory().addItem(stick);
            }else{
                player.sendMessage(ChatColor.GOLD + "Please get the permission called; Magic.slowstick");
            }
        }

        return true;
    }
}
