package com.maxson.betterendrod.item;

import com.maxson.betterendrod.BetterEndRod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemsMod {

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, BetterEndRod.id(id), item);
    }

    public static void register(){
        BetterEndRod.LOGGER.debug("Registering items for: " + BetterEndRod.MOD_ID);
    }
}
