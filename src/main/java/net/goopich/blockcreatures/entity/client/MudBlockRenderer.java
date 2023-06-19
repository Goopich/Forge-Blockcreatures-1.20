package net.goopich.blockcreatures.entity.client;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.entity.custom.MudBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MudBlockRenderer extends GeoEntityRenderer<MudBlockEntity> {

    public MudBlockRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MudBlockModel(new ResourceLocation(BlockCreatures.MOD_ID, "geo/mudblockmob.geo.json")));
        this.shadowRadius = 0.4f;
    }

    @Override
    public ResourceLocation getTextureLocation(MudBlockEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "textures/entity/mudblockcreature.png");
    }

    @Override
    public RenderType getRenderType(MudBlockEntity animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return super.getRenderType(animatable, texture, bufferSource, partialTick);
    }
}