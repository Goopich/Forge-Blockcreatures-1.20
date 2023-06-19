package net.goopich.blockcreatures.entity.client;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.entity.custom.GrassBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class GrassBlockModel extends DefaultedEntityGeoModel<GrassBlockEntity> {
    public GrassBlockModel(ResourceLocation assetSubpath) {
        super(assetSubpath, true);
    }
    @Override
    public ResourceLocation getModelResource(GrassBlockEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "geo/grassblockmob.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GrassBlockEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "textures/entity/grassblockcreature.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GrassBlockEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "animations/grassblock.animation.json");
    }

}