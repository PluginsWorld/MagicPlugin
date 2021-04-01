package com.github.ukraine1449.magicplugin.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Invis implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.invis")){
                ItemStack head = new ItemStack(Material.LEATHER_HELMET);
                ItemMeta hm = head.getItemMeta();





                ItemStack chesplate = new ItemStack(Material.LEATHER_CHESTPLATE);
                ItemMeta cm = chesplate.getItemMeta();

                ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
                ItemMeta lm = leggings.getItemMeta();

                ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
                ItemMeta bm = boots.getItemMeta();
            }
        }

        return true;
    }
}
