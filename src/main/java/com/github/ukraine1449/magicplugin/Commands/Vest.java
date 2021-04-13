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

public class Vest implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.vest")){
                ItemStack vest = new ItemStack(Material.IRON_CHESTPLATE);
                ItemMeta vm = vest.getItemMeta();
                vm.setDisplayName(ChatColor.RED + "Suicide bomber vest");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.AQUA + "A vest with explosives strapped to it");
                lore.add(ChatColor.RED + "Tanerite ammount: 10kg");
                vm.setLore(lore);
                vest.setItemMeta(vm);
                player.getInventory().addItem(vest);
            }else{
                player.sendMessage(ChatColor.GOLD + "Please get the permission called; Magic.vest");
            }
        }

        return true;
    }
}
