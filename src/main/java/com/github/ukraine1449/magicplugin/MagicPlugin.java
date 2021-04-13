package com.github.ukraine1449.magicplugin;

import com.github.ukraine1449.magicplugin.Commands.*;
import com.github.ukraine1449.magicplugin.Events.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class MagicPlugin extends JavaPlugin {
    public ArrayList<Player> vanished = new ArrayList<>();
    public ArrayList<Block> blocks = new ArrayList<>();
    @Override
    public void onEnable() {
        System.out.println("Plugin is starting up");
        getServer().getPluginManager().registerEvents(new HammerEvent(), this);
        getServer().getPluginManager().registerEvents(new ShieldEvent(), this);
        getServer().getPluginManager().registerEvents(new BowEvent(), this);
        getServer().getPluginManager().registerEvents(new ESPHelmet(), this);
        getServer().getPluginManager().registerEvents(new ShearsEvent(), this);
        getServer().getPluginManager().registerEvents(new ScytheEvent(), this);
        getServer().getPluginManager().registerEvents(new ExplosiveBowEvent(), this);
        getServer().getPluginManager().registerEvents(new InvisEvent(this), this);
        getServer().getPluginManager().registerEvents(new ZeusBowEvent(), this);
        getServer().getPluginManager().registerEvents(new VestEvent(), this);
        getServer().getPluginManager().registerEvents(new BoomStickEvent(), this);
        getServer().getPluginManager().registerEvents(new VestBigEvent(), this);
        getServer().getPluginManager().registerEvents(new BootsFallEvent(), this);
        getServer().getPluginManager().registerEvents(new PickaxeEvent(), this);
        getServer().getPluginManager().registerEvents(new SlowStickEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerDeathEvent(), this);
        getServer().getPluginManager().registerEvents(new LevitationBootsEvent(), this);
        getServer().getPluginManager().registerEvents(new TPBEvent(), this);
        getServer().getPluginManager().registerEvents(new ShieldArmEvent(), this);



        getCommand("tshield").setExecutor(new ShieldArm());
        getCommand("tpbow").setExecutor(new TPbow());
        getCommand("wings").setExecutor(new LevitationBoots());
        getCommand("slowStick").setExecutor(new SlowStick());
        getCommand("Pickaxe").setExecutor(new PickAxe());
        getCommand("boots").setExecutor(new PillowBoots());
        getCommand("vestBig").setExecutor(new VestBig());
        getCommand("Vest").setExecutor(new Vest());
        getCommand("BoomStick").setExecutor(new BoomStick());
        getCommand("Zeus").setExecutor(new ZeusBow());
        getCommand("invis").setExecutor(new Invis());
        getCommand("boombow").setExecutor(new ExplosiveBow());
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