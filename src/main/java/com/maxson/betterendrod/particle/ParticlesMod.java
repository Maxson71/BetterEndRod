package com.maxson.betterendrod.particle;

import com.maxson.betterendrod.BetterEndRod;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ParticlesMod {
    public static final SimpleParticleType AMETHYST_ENDROD = registerParticle("amethyst_endrod");
    public static final SimpleParticleType REDSTONE_ENDROD = registerParticle("redstone_endrod");
    public static final SimpleParticleType COPPER_ENDROD = registerParticle("copper_endrod");
    public static final SimpleParticleType HONEY_ENDROD = registerParticle("honey_endrod");
    public static final SimpleParticleType RUSTY_ENDROD = registerParticle("rusty_endrod");
    public static final SimpleParticleType EMERALD_ENDROD = registerParticle("emerald_endrod");
    public static final SimpleParticleType SAND_ENDROD = registerParticle("sand_endrod");

    public static final SimpleParticleType SCULK_ENDROD = registerParticle("sculk_endrod");

    private static SimpleParticleType registerParticle(String id) {
        return Registry.register(Registries.PARTICLE_TYPE, BetterEndRod.id(id), FabricParticleTypes.simple());
    }

    public static void register(){
        BetterEndRod.LOGGER.debug("Registering particles for: " + BetterEndRod.MOD_ID);
    }
}
