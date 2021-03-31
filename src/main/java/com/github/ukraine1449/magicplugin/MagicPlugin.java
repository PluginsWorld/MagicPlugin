package com.github.ukraine1449.magicplugin;

import com.github.ukraine1449.magicplugin.Commands.*;
import com.github.ukraine1449.magicplugin.Events.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class MagicPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Plugin is starting up");
        getServer().getPluginManager().registerEvents(new HammerEvent(), this);
        getServer().getPluginManager().registerEvents(new ShieldEvent(), this);
        getServer().getPluginManager().registerEvents(new BowEvent(), this);
        getServer().getPluginManager().registerEvents(new ESPHelmet(), this);
        getServer().getPluginManager().registerEvents(new ShearsEvent(), this);
        getServer().getPluginManager().registerEvents(new ScytheEvent(), this);


        getCommand("scythe").setExecutor(new Scythe());
        getCommand("shears").setExecutor(new HeadCutterShears());
        getCommand("EH").setExecutor(new HelmetOfVision());
        getCommand("hammer").setExecutor(new Hammer());
        getCommand("shield").setExecutor(new Shield());
        getCommand("bow").setExecutor(new Bow());
    }


    @Override
    public void onDisable() {

    }

}
