package com.maxson.betterendrod.blockendrod;

import com.maxson.betterendrod.BetterEndRod;
import com.maxson.betterendrod.itemendrod.ItemEndRod;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockEndRod {
    private static Block registerBlock(String id, Block block, ItemGroup itemGroup){
        return Registry.register(Registries.BLOCK, new Identifier(BetterEndRod.MOD_ID, id), block);
    }
    public static void register(){
        BetterEndRod.LOGGER.debug("Registering blocks for: " + BetterEndRod.MOD_ID);
    }
}
