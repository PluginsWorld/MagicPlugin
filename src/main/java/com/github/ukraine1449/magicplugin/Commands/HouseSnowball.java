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

public class HouseSnowball implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.instaHouse")){
                ItemStack snowball = new ItemStack(Material.STICK);
                ItemMeta sm = snowball.getItemMeta();
                sm.setDisplayName(ChatColor.DARK_GREEN + "Porta-house");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.GREEN + "Right click on 3 any 3 blocks to make a house out of them");
                sm.setLore(lore);
                snowball.setItemMeta(sm);
                player.getInventory().addItem(snowball);



            }else{
                player.sendMessage(ChatColor.GOLD + "Please get the permission called; Magic.instaHouse");
            }
        }

        return true;
    }
}
