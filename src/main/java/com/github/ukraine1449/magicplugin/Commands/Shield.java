package com.github.ukraine1449.magicplugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Shield implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.spawnShield")){
                ItemStack shield = new ItemStack(Material.SHIELD);
                ItemMeta sm = shield.getItemMeta();
                sm.setDisplayName(ChatColor.BLACK + "The shield of darkness");
                shield.setItemMeta(sm);
                shield.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);
                Inventory pi = player.getInventory();
                pi.addItem(shield);


            }
        }

        return true;
    }
}
