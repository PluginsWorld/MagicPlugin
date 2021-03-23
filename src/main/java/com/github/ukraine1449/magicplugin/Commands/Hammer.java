package com.github.ukraine1449.magicplugin.Commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Hammer implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.spawnHammer")){
                ItemStack hammer = new ItemStack(Material.WOODEN_AXE);
                ItemMeta hm = hammer.getItemMeta();
                hm.setDisplayName(ChatColor.RED + "The great fuck you hammer");
                hammer.setItemMeta(hm);
                Inventory pi = player.getInventory();
                pi.addItem(hammer);
            }
        }


        return true;
    }
}
