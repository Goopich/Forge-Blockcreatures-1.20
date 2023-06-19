package net.goopich.blockcreatures.entity.client;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.entity.custom.GrassBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GrassBlockRenderer extends GeoEntityRenderer<GrassBlockEntity> {

    public GrassBlockRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GrassBlockModel(new ResourceLocation(BlockCreatures.MOD_ID, "geo/grassblockmob.geo.json")));
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(GrassBlockEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "textures/entity/grassblockcreature.png");
    }

    @Override
    public RenderType getRenderType(GrassBlockEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}