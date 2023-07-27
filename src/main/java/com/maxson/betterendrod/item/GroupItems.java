package com.maxson.betterendrod.item;

import com.maxson.betterendrod.block.BlockEndRod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class GroupItems {
    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(BlockEndRod.REDSTONE_ENDROD);
        });
    }
}
