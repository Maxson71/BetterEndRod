package com.maxson.betterendrod;

import com.maxson.betterendrod.particle.Particles;
import com.maxson.betterendrod.particle.custom.RedstoneEndRodParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class BetterEndRodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(Particles.REDSTONE_ENDROD, RedstoneEndRodParticle.Factory::new);
    }
}
