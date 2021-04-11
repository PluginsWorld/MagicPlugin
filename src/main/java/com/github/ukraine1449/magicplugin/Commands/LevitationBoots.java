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

public class LevitationBoots implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.Flying")){
                ItemStack wings = new ItemStack(Material.LEATHER_CHESTPLATE);
                ItemMeta wm = wings.getItemMeta();
                wm.setDisplayName(ChatColor.DARK_AQUA + "Wings");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.BLUE + "Put this on to help you fly");
                wm.setLore(lore);
                wings.setItemMeta(wm);
                player.getInventory().addItem(wings);
            }
        }

        return true;
    }
}
