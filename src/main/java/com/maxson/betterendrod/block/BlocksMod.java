package com.maxson.betterendrod.block;

import com.maxson.betterendrod.BetterEndRod;
import com.maxson.betterendrod.particle.ParticlesMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class BlocksMod {
    public static final Block SAND_ENDROD = registerEndRodBlock("sand_endrod", ParticlesMod.SAND_ENDROD);
    public static final Block REDSTONE_ENDROD = registerEndRodBlock("redstone_endrod", ParticlesMod.REDSTONE_ENDROD);
    public static final Block HONEY_ENDROD = registerEndRodBlock("honey_endrod", ParticlesMod.HONEY_ENDROD);
    public static final Block COPPER_ENDROD = registerEndRodBlock("copper_endrod", ParticlesMod.COPPER_ENDROD);
    public static final Block AMETHYST_ENDROD = registerEndRodBlock("amethyst_endrod", ParticlesMod.AMETHYST_ENDROD);
    public static final Block RUSTY_ENDROD = registerEndRodBlock("rusty_endrod", ParticlesMod.RUSTY_ENDROD);
    public static final Block EMERALD_ENDROD = registerEndRodBlock("emerald_endrod", ParticlesMod.EMERALD_ENDROD);
    public static final Block SCULK_ENDROD = registerEndRodBlock("sculk_endrod", ParticlesMod.SCULK_ENDROD);

    private static Block registerEndRodBlock(String path, ParticleEffect particleType) {
        Identifier id = BetterEndRod.id(path);
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);
        Block block = new EndRodBlock(AbstractBlock.Settings.copy(Blocks.END_ROD).registryKey(blockKey), particleType);
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static Item registerBlockItem(Identifier id, Block block){
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);
        return Registry.register(Registries.ITEM, itemKey,
                new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey()));
    }

    public static void register(){
        BetterEndRod.LOGGER.debug("Registering blocks for: " + BetterEndRod.MOD_ID);
    }
}
