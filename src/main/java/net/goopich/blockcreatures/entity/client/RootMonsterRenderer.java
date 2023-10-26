package net.goopich.blockcreatures.entity.client;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.entity.custom.RootMonsterEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class RootMonsterRenderer extends GeoEntityRenderer<RootMonsterEntity> {


    public RootMonsterRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RootMonsterModel(new ResourceLocation(BlockCreatures.MOD_ID, "geo/root_monster.geo.json")));
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(RootMonsterEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "textures/entity/root_monster.png");
    }

    @Override
    public RenderType getRenderType(RootMonsterEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}