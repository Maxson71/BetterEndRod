package com.maxson.betterendrod;

import com.maxson.betterendrod.block.BlockEndRod;
import com.maxson.betterendrod.item.GroupItems;
import com.maxson.betterendrod.item.test_item;
import net.fabricmc.api.ModInitializer;

import net.minecraft.server.command.GameRuleCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterEndRod implements ModInitializer {
    public static final String MOD_ID = "betterendrod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        GroupItems.register();
        test_item.register();
        BlockEndRod.register();
    }
}
