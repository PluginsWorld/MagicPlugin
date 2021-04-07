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

public class Mine implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("Magic.mine")){
                ItemStack mine = new ItemStack(Material.PAINTING);
                ItemMeta mm = mine.getItemMeta();
                mm.setDisplayName(ChatColor.BLACK + "Mine");
                ArrayList<String> lore = new ArrayList();
                lore.add(ChatColor.BLUE + "An antipersonel trap");
                lore.add(ChatColor.BLUE + "On interact it will explode");
                mm.setLore(lore);
                mine.setItemMeta(mm);
                player.getInventory().addItem(mine);
            }
        }

        return true;
    }
}
