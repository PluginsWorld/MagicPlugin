package com.github.ukraine1449.magicplugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HelmetOfVision implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.EH")){
                ItemStack helmet = new ItemStack(Material.CHAINMAIL_HELMET);
                ItemMeta hm = helmet.getItemMeta();
                hm.setDisplayName(ChatColor.BLUE + "The all seeing helmet");
                helmet.setItemMeta(hm);
                player.getInventory().addItem(helmet);
            }
        }

        return true;
    }
}
