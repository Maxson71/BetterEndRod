package com.maxson.betterendrod.block;

import com.maxson.betterendrod.BetterEndRod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.EndRodBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class BlockEndRod {

    public static final Block REDSTONE_ENDROD = registerBlock("redstone_endrod",
            new EndRodBlock(FabricBlockSettings.copyOf(Blocks.END_ROD)));

    private static Block registerBlock(String id, Block block){
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(BetterEndRod.MOD_ID, id), block);
    }

    private static Item registerBlockItem(String id, Block block){
        return Registry.register(Registries.ITEM, new Identifier(BetterEndRod.MOD_ID, id),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void register(){
        BetterEndRod.LOGGER.debug("Registering blocks for: " + BetterEndRod.MOD_ID);
    }
}
