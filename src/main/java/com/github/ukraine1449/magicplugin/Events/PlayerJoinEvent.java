package com.github.ukraine1449.magicplugin.Events;

import com.github.ukraine1449.magicplugin.MagicPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoinEvent implements Listener {
MagicPlugin plugin;

    public PlayerJoinEvent(MagicPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent event) {
        Player player = event.getPlayer();
        for(int i = 0; i < plugin.vanished.size(); i++){
            player.hidePlayer(plugin, plugin.vanished.get(i));
            player.hidePlayer(player);
        }
    }

}
