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

public class Nuke implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            Player player = (Player) sender;
            if(player.hasPermission("Magic.Nuke")){
                ItemStack fs = new ItemStack(Material.FLINT);
                ItemMeta fm = fs.getItemMeta();
                fm.setDisplayName(ChatColor.RED + "A portable fucking nuke");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.RED + "Drop this to detonate");
                fm.setLore(lore);
                fs.setItemMeta(fm);
                player.getInventory().addItem(fs);

            }else{
                player.sendMessage(ChatColor.GOLD + "Please get the permission called; Magic.Nuke");
            }

        }

        return true;
    }
}
