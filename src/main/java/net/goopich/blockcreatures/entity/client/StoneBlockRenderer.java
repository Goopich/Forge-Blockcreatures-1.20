package net.goopich.blockcreatures.entity.client;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.entity.custom.StoneBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class StoneBlockRenderer extends GeoEntityRenderer<StoneBlockEntity> {

    public StoneBlockRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new StoneBlockModel(new ResourceLocation(BlockCreatures.MOD_ID, "geo/stoneblockmob.geo.json")));
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(StoneBlockEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "textures/entity/stoneblockcreature.png");
    }

    @Override
    public RenderType getRenderType(StoneBlockEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}