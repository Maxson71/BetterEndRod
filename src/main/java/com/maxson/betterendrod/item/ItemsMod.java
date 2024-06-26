package com.maxson.betterendrod.item;

import com.maxson.betterendrod.BetterEndRod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemsMod {

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterEndRod.MOD_ID, id), item);
    }

    public static void register(){
        BetterEndRod.LOGGER.debug("Registering items for: " + BetterEndRod.MOD_ID);
    }
}
