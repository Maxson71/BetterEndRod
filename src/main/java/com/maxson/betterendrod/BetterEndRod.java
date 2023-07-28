package com.maxson.betterendrod;

import com.maxson.betterendrod.block.Blocks;
import com.maxson.betterendrod.item.GroupItems;
import com.maxson.betterendrod.item.Items;
import com.maxson.betterendrod.particle.Particles;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterEndRod implements ModInitializer {
    public static final String MOD_ID = "betterendrod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        GroupItems.register();
        Items.register();
        Blocks.register();
    }

}
