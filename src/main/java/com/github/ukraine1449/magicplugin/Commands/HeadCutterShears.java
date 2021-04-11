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

public class HeadCutterShears implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.Guillotine")){
                ItemStack shears = new ItemStack(Material.SHEARS);
                ItemMeta bm = shears.getItemMeta();
                bm.setDisplayName(ChatColor.RED + "Guillotine");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.DARK_PURPLE + "The french Guillotine");
                lore.add(ChatColor.DARK_PURPLE + "Kill someone with this to get their head");
                bm.setLore(lore);
                shears.setItemMeta(bm);
                Inventory playerinv = player.getInventory();
                playerinv.addItem(shears);
            }else{
                player.sendMessage(ChatColor.GOLD + "Please get the permission called; Magic.Guillotine");
            }
        }

        return true;
    }
}
