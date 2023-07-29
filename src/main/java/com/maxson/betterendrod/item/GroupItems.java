package com.maxson.betterendrod.item;

import com.maxson.betterendrod.block.Blocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class GroupItems {
    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(Blocks.REDSTONE_ENDROD);
            entries.add(Blocks.SAND_ENDROD);
            entries.add(Blocks.HONEY_ENDROD);
            entries.add(Blocks.COPER_ENDROD);
            entries.add(Blocks.EMERALD_ENDROD);
            entries.add(Blocks.RUSTY_ENDROD);
            entries.add(Blocks.AMETHYST_ENDROD);
        });
    }
}
