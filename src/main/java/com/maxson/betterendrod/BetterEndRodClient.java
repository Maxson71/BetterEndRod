package com.maxson.betterendrod;

import com.maxson.betterendrod.block.BlocksMod;
import com.maxson.betterendrod.particle.ParticlesMod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.EndRodParticle;
import net.minecraft.client.render.RenderLayer;

public class BetterEndRodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(BlocksMod.REDSTONE_ENDROD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksMod.SAND_ENDROD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksMod.EMERALD_ENDROD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksMod.AMETHYST_ENDROD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksMod.COPPER_ENDROD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksMod.RUSTY_ENDROD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksMod.HONEY_ENDROD, RenderLayer.getCutout());

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
