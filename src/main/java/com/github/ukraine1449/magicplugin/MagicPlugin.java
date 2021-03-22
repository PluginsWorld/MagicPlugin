package com.github.ukraine1449.magicplugin;

import com.github.ukraine1449.magicplugin.Enchants.Glow;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;
import java.util.HashMap;

public final class MagicPlugin extends JavaPlugin {
        private static MagicPlugin plugin;
        public static Glow glow;
    @Override
    public void onEnable() {
        System.out.println("Plugin is starting up");
        plugin = this;
        glow = new Glow("glow");
        registerEnchantment(glow);
        this.getServer().getPluginManager().registerEvents((Listener) glow, this);
    }

    @Override
    public void onDisable() {
        try {
            Field keyField = Enchantment.class.getDeclaredField("byKey");

            keyField.setAccessible(true);
            @SuppressWarnings("unchecked")
            HashMap<NamespacedKey, Enchantment> byKey = (HashMap<NamespacedKey, Enchantment>) keyField.get(null);

                if(byKey.containsKey(glow.getKey())) {
                    byKey.remove(glow.getKey());

            }

            Field nameField = Enchantment.class.getDeclaredField("byName");

            nameField.setAccessible(true);
            @SuppressWarnings("unchecked")
            HashMap<String, Enchantment> byName = (HashMap<String, Enchantment>) nameField.get(null);

                if(byName.containsKey(glow.getName())) {
                    byName.remove(glow.getName());
            }
        } catch (Exception ignored) { }

    }

    public static void registerEnchantment(Enchantment enchantment) {
        boolean registered = true;
        try {
            Field f = Enchantment.class.getDeclaredField("acceptingNew");
            f.setAccessible(true);
            f.set(null, true);
            Enchantment.registerEnchantment(enchantment);
        } catch (Exception e) {
            registered = false;
            e.printStackTrace();
        }
        if(registered){
            // It's been registered!
        }
    }

    public static MagicPlugin getPlugin(){
        return plugin;
    }
}
