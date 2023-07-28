package com.maxson.betterendrod.particle;

import com.maxson.betterendrod.BetterEndRod;
import com.mojang.serialization.Codec;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class Particles {

    public static final DefaultParticleType REDSTONE_ENDROD = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(BetterEndRod.MOD_ID, "redstone_endrod"),
                REDSTONE_ENDROD);
    }

}