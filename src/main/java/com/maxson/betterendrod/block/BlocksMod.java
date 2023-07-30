package com.maxson.betterendrod.block;

import com.maxson.betterendrod.BetterEndRod;
import com.maxson.betterendrod.particle.ParticlesMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlocksMod {
    public static final Block SAND_ENDROD = registerBlock("sand_endrod",
            new EndRodBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.END_ROD), ParticlesMod.SAND_ENDROD));
    public static final Block REDSTONE_ENDROD = registerBlock("redstone_endrod",
            new EndRodBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.END_ROD), ParticlesMod.REDSTONE_ENDROD));
    public static final Block HONEY_ENDROD = registerBlock("honey_endrod",
            new EndRodBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.END_ROD), ParticlesMod.HONEY_ENDROD));
    public static final Block COPPER_ENDROD = registerBlock("copper_endrod",
            new EndRodBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.END_ROD), ParticlesMod.COPPER_ENDROD));
    public static final Block AMETHYST_ENDROD = registerBlock("amethyst_endrod",
            new EndRodBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.END_ROD), ParticlesMod.AMETHYST_ENDROD));
    public static final Block RUSTY_ENDROD = registerBlock("rusty_endrod",
            new EndRodBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.END_ROD), ParticlesMod.RUSTY_ENDROD));
    public static final Block EMERALD_ENDROD = registerBlock("emerald_endrod",
            new EndRodBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.END_ROD), ParticlesMod.EMERALD_ENDROD));

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
