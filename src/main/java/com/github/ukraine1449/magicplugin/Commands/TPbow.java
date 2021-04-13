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

public class TPbow implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.TPB")){
                ItemStack bow = new ItemStack(Material.BOW);
                ItemMeta bm = bow.getItemMeta();
                bm.setDisplayName(ChatColor.BLUE + "Teleport bow");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.BOLD + "Shoot this to teleport wherever this lands");
                bm.setLore(lore);
                bow.setItemMeta(bm);
                player.getInventory().addItem(bow);
            }else{
                player.sendMessage(ChatColor.GOLD + "Please get the permission called; Magic.TPB");
            }
        }

        return true;
    }
}
