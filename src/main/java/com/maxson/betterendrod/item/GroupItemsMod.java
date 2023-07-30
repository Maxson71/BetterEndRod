package com.maxson.betterendrod.item;

import com.maxson.betterendrod.block.BlocksMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class GroupItemsMod {
    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(BlocksMod.REDSTONE_ENDROD);
            entries.add(BlocksMod.SAND_ENDROD);
            entries.add(BlocksMod.HONEY_ENDROD);
            entries.add(BlocksMod.COPPER_ENDROD);
            entries.add(BlocksMod.EMERALD_ENDROD);
            entries.add(BlocksMod.RUSTY_ENDROD);
            entries.add(BlocksMod.AMETHYST_ENDROD);
        });
    }
}
