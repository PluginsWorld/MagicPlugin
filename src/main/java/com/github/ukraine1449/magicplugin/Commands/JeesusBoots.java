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

public class JeesusBoots implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.JeesusBoots")){

                ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
                ItemMeta bm = boots.getItemMeta();
                bm.setDisplayName(ChatColor.GREEN + "Jeesus boots");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.GREEN + "Wear these boots to walk on water");
                bm.setLore(lore);

            }
        }

        return true;
    }
}
