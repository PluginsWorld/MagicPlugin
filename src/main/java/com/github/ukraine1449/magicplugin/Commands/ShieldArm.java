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

public class ShieldArm implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.supershield")){
                ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS);
                ItemMeta bm = boots.getItemMeta();
                bm.setDisplayName(ChatColor.LIGHT_PURPLE + "Porta-shield");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.BOLD + "Put this on for temporary defense");
                bm.setLore(lore);
                boots.setItemMeta(bm);
                player.getInventory().addItem(boots);
            }else{
                player.sendMessage(ChatColor.GOLD + "Please get the permission called; Magic.supershield");
            }
        }

        return true;
    }
}
