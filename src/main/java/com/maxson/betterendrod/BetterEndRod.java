package com.maxson.betterendrod;

import com.maxson.betterendrod.blockendrod.BlockEndRod;
import com.maxson.betterendrod.itemendrod.ItemEndRod;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterEndRod implements ModInitializer {
    public static final String MOD_ID = "betterendrod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ItemEndRod.register();
        BlockEndRod.register();
    }
}
