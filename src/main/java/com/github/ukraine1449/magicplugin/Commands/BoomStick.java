package com.github.ukraine1449.magicplugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class BoomStick implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.BoomStick")){
                ItemStack stick = new ItemStack(Material.STICK);
                ItemMeta sm = stick.getItemMeta();
                sm.setDisplayName(ChatColor.RED + "Boom Stick");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.AQUA + "A stick with an explosive attached to it");
                lore.add(ChatColor.RED + "Tanerite ammount: .25kg");
                sm.setLore(lore);
                stick.setItemMeta(sm);
                player.getInventory().addItem(stick);
            }else{
                player.sendMessage(ChatColor.GOLD + "Please get the permission called; Magic.BoomStick");
            }
        }

        return true;
    }
}
