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

public class PickAxe implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.Pickaxe")){
                ItemStack pick = new ItemStack(Material.GOLDEN_PICKAXE);
                ItemMeta pm = pick.getItemMeta();
                pm.setDisplayName(ChatColor.GOLD + "Excavator");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.GOLD + "Use this to mine large ammounts of block");
                lore.add(ChatColor.AQUA + "It has an *explosive* surprise :)");
                pm.setLore(lore);
                pick.setItemMeta(pm);
                player.getInventory().addItem(pick);
            }else{
                player.sendMessage(ChatColor.GOLD + "Please get the permission called; Magic.Pickaxe");
            }
        }

        return true;
    }
}
