package com.github.ukraine1449.magicplugin;

import com.github.ukraine1449.magicplugin.Commands.Hammer;
import com.github.ukraine1449.magicplugin.Commands.Shield;
import com.github.ukraine1449.magicplugin.Events.HammerEvent;
import com.github.ukraine1449.magicplugin.Events.ShieldEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MagicPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Plugin is starting up");
        getServer().getPluginManager().registerEvents(new HammerEvent(), this);
        getServer().getPluginManager().registerEvents(new ShieldEvent(), this);





        getCommand("hammer").setExecutor(new Hammer());
        getCommand("shield").setExecutor(new Shield());
    }

    @Override
    public void onDisable() {

    }

}
