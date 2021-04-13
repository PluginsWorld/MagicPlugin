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

public class PillowBoots implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.Pillow")){
                ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS);
                ItemMeta bm = boots.getItemMeta();
                bm.setDisplayName(ChatColor.BOLD + "Pillow boots");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.WHITE + "Wear to gain better falling capablities");
                bm.setLore(lore);
                boots.setItemMeta(bm);
                player.getInventory().addItem(boots);
            }else{
                player.sendMessage(ChatColor.GOLD + "Please get the permission called; Magic.Pillow");
            }
        }

        return true;
    }
}
