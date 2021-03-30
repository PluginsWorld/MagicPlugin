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

public class Scythe implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.scythe")){
                ItemStack scythe = new ItemStack(Material.NETHERITE_HOE);
                ItemMeta sm = scythe.getItemMeta();
                sm.setDisplayName(ChatColor.BLACK + "Death's scythe");
                scythe.setItemMeta(sm);
                Inventory pi = player.getInventory();
                pi.addItem(scythe);
            }
        }

        return true;
    }
}
