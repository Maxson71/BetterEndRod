package com.maxson.betterendrod;

import com.maxson.betterendrod.block.BlocksMod;
import com.maxson.betterendrod.particle.ParticlesMod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.EndRodParticle;

public class BetterEndRodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ParticlesMod.REDSTONE_ENDROD, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticlesMod.SAND_ENDROD, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticlesMod.HONEY_ENDROD, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticlesMod.AMETHYST_ENDROD, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticlesMod.COPPER_ENDROD, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticlesMod.EMERALD_ENDROD, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticlesMod.RUSTY_ENDROD, EndRodParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ParticlesMod.SCULK_ENDROD, EndRodParticle.Factory::new);
    }
}
