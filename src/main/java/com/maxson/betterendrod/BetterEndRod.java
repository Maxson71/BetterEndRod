package com.maxson.betterendrod;

import com.maxson.betterendrod.block.BlocksMod;
import com.maxson.betterendrod.item.GroupItemsMod;
import com.maxson.betterendrod.item.ItemsMod;
import com.maxson.betterendrod.particle.ParticlesMod;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterEndRod implements ModInitializer {
    public static final String MOD_ID = "betterendrod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        GroupItemsMod.register();
        ItemsMod.register();
        BlocksMod.register();
        ParticlesMod.register();
    }

}
