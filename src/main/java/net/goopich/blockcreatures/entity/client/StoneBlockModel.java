package net.goopich.blockcreatures.entity.client;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.entity.custom.StoneBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class StoneBlockModel extends DefaultedEntityGeoModel<StoneBlockEntity> {
    public StoneBlockModel(ResourceLocation assetSubpath) {
        super(assetSubpath, true);
    }
    @Override
    public ResourceLocation getModelResource(StoneBlockEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "geo/stoneblockmob.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(StoneBlockEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "textures/entity/stoneblockcreature.png");
    }

    @Override
    public ResourceLocation getAnimationResource(StoneBlockEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "animations/stoneblock.animation.json");
    }

}