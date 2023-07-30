package com.maxson.betterendrod.particle;

import com.maxson.betterendrod.BetterEndRod;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.client.particle.Particle;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ParticlesMod {
    public static final DefaultParticleType AMETHYST_ENDROD = registerParticle("amethyst_endrod");
    public static final DefaultParticleType REDSTONE_ENDROD = registerParticle("redstone_endrod");
    public static final DefaultParticleType COPPER_ENDROD = registerParticle("copper_endrod");
    public static final DefaultParticleType HONEY_ENDROD = registerParticle("honey_endrod");
    public static final DefaultParticleType RUSTY_ENDROD = registerParticle("rusty_endrod");
    public static final DefaultParticleType EMERALD_ENDROD = registerParticle("emerald_endrod");
    public static final DefaultParticleType SAND_ENDROD = registerParticle("sand_endrod");

    private static DefaultParticleType registerParticle(String id) {
        return Registry.register(Registries.PARTICLE_TYPE, new Identifier(BetterEndRod.MOD_ID, id), FabricParticleTypes.simple());
    }

    public static void register(){
        BetterEndRod.LOGGER.debug("Registering particles for: " + BetterEndRod.MOD_ID);
    }
}