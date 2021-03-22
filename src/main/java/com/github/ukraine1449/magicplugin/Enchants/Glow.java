package com.github.ukraine1449.magicplugin.Enchants;

import com.github.ukraine1449.magicplugin.MagicPlugin;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

import java.lang.annotation.Annotation;

public class Glow extends Enchantment implements EventHandler {


    public Glow(String namespace) {
        super(new NamespacedKey(MagicPlugin.getPlugin(), namespace));
    }
    @EventHandler
    public void onPlayerHit(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Player){
            Player player = (Player) event.getDamager();
            if(player.getEquipment().getChestplate().getEnchantments().containsKey(Enchantment.getByKey(MagicPlugin.glow.getKey()))){
                event.getEntity().setGlowing(true);
            }
        }
    }
    @Override
    public String getName() {
        return "Glow";
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public int getStartLevel() {
        return 1;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        return EnchantmentTarget.ARMOR;
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean isCursed() {
        return false;
    }

    @Override
    public boolean conflictsWith(Enchantment other) {
        return false;
    }

    @Override
    public boolean canEnchantItem(ItemStack item) {
        return true;
    }

    @Override
    public EventPriority priority() {
        return null;
    }

    @Override
    public boolean ignoreCancelled() {
        return false;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
