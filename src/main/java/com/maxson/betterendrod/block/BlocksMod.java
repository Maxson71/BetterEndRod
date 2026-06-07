package com.maxson.betterendrod.block;

import com.maxson.betterendrod.BetterEndRod;
import com.maxson.betterendrod.particle.ParticlesMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlocksMod {
    public static final Block SAND_ENDROD = registerBlock("sand_endrod",
            new EndRodBlock(AbstractBlock.Settings.copy(Blocks.END_ROD), ParticlesMod.SAND_ENDROD));
    public static final Block REDSTONE_ENDROD = registerBlock("redstone_endrod",
            new EndRodBlock(AbstractBlock.Settings.copy(Blocks.END_ROD), ParticlesMod.REDSTONE_ENDROD));
    public static final Block HONEY_ENDROD = registerBlock("honey_endrod",
            new EndRodBlock(AbstractBlock.Settings.copy(Blocks.END_ROD), ParticlesMod.HONEY_ENDROD));
    public static final Block COPPER_ENDROD = registerBlock("copper_endrod",
            new EndRodBlock(AbstractBlock.Settings.copy(Blocks.END_ROD), ParticlesMod.COPPER_ENDROD));
    public static final Block AMETHYST_ENDROD = registerBlock("amethyst_endrod",
            new EndRodBlock(AbstractBlock.Settings.copy(Blocks.END_ROD), ParticlesMod.AMETHYST_ENDROD));
    public static final Block RUSTY_ENDROD = registerBlock("rusty_endrod",
            new EndRodBlock(AbstractBlock.Settings.copy(Blocks.END_ROD), ParticlesMod.RUSTY_ENDROD));
    public static final Block EMERALD_ENDROD = registerBlock("emerald_endrod",
            new EndRodBlock(AbstractBlock.Settings.copy(Blocks.END_ROD), ParticlesMod.EMERALD_ENDROD));
    public static final Block SCULK_ENDROD = registerBlock("sculk_endrod",
            new EndRodBlock(AbstractBlock.Settings.copy(Blocks.END_ROD), ParticlesMod.SCULK_ENDROD));

    private static Block registerBlock(String id, Block block){
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, BetterEndRod.id(id), block);
    }

    private static Item registerBlockItem(String id, Block block){
        return Registry.register(Registries.ITEM, BetterEndRod.id(id),
                new BlockItem(block, new Item.Settings()));
    }

    public static void register(){
        BetterEndRod.LOGGER.debug("Registering blocks for: " + BetterEndRod.MOD_ID);
    }
}
