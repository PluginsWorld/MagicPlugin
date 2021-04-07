package com.github.ukraine1449.magicplugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Bow implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.Bow")){
                ItemStack bow = new ItemStack(Material.BOW);
                ItemMeta bm = bow.getItemMeta();
                bm.setDisplayName(ChatColor.LIGHT_PURPLE + "Cupid's Bow");

                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.LIGHT_PURPLE + "The bow of cupid. Go help someone");
                bm.setLore(lore);
                bow.setItemMeta(bm);
                Inventory playerinv = player.getInventory();
                playerinv.addItem(bow);
            }
        }

        return true;
    }
}
