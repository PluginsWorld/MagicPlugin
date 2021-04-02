package com.github.ukraine1449.magicplugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Invis implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.invis")){
                Inventory pi = player.getInventory();


                ItemStack head = new ItemStack(Material.LEATHER_HELMET);
                LeatherArmorMeta hm = (LeatherArmorMeta) head.getItemMeta();
                hm.setDisplayName(ChatColor.BLACK + "Spy's hat");
                hm.setColor(Color.BLACK);
                head.setItemMeta(hm);
                pi.addItem(head);

                ItemStack chesplate = new ItemStack(Material.LEATHER_CHESTPLATE);
                LeatherArmorMeta cm = (LeatherArmorMeta) chesplate.getItemMeta();
                cm.setDisplayName(ChatColor.BLACK + "Spy's jacket");
                cm.setColor(Color.BLACK);
                chesplate.setItemMeta(cm);
                pi.addItem(chesplate);

                ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
                LeatherArmorMeta lm = (LeatherArmorMeta) leggings.getItemMeta();
                lm.setDisplayName(ChatColor.BLACK + "Spy's pants");
                lm.setColor(Color.BLACK);
                head.setItemMeta(lm);
                pi.addItem(leggings);

                ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
                LeatherArmorMeta bm = (LeatherArmorMeta) boots.getItemMeta();
                bm.setDisplayName(ChatColor.BLACK + "Spy's sneaky boots");
                bm.setColor(Color.BLACK);
                head.setItemMeta(bm);
                pi.addItem(boots);

            }
        }

        return true;
    }
}
