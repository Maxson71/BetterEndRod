package com.maxson.betterendrod.itemendrod;

import com.maxson.betterendrod.BetterEndRod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ItemEndRod {

    public static final Item TEST_ITEM = registerItem("test_item", new Item(new FabricItemSettings()));


    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterEndRod.MOD_ID, id), item);
    }

    private static Item registerItem(String id, Item item, RegistryKey<ItemGroup> itemGroup) {
        Item returnItem = Registry.register(Registries.ITEM, new Identifier(BetterEndRod.MOD_ID, id), item);
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(returnItem));
        return returnItem;
    }
    public static void register(){
        BetterEndRod.LOGGER.debug("Registering items for: " + BetterEndRod.MOD_ID);
    }
}
