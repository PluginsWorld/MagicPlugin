package com.github.ukraine1449.magicplugin;

import org.bukkit.enchantments.Enchantment;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CustomEnchants {

    public static final Enchantment Telepathy = new EnchantWrapper("telepathy", "Telepathy", 1);
    public static void register(){
        boolean registered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(Telepathy);
        if(!registered){
            registerEnchantment(Telepathy);
        }
    }
    public static void registerEnchantment(Enchantment enchantment){
        boolean registered = true;
        try{
            Field f = Enchantment.class.getDeclaredField("acceptingNew");
            f.setAccessible(true);
            f.set(null, true);
            Enchantment.registerEnchantment(enchantment);
        }catch(Exception e){
            registered = false;
            e.printStackTrace();
        }q
    }

}
