package net.goopich.blockcreatures.entity.client;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.entity.custom.RootMonsterEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class RootMonsterModel extends DefaultedEntityGeoModel<RootMonsterEntity> {
    public RootMonsterModel(ResourceLocation assetSubpath) {
        super(assetSubpath, true);
    }
    @Override
    public ResourceLocation getModelResource(RootMonsterEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "geo/root_monster.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RootMonsterEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "textures/entity/root_monster.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RootMonsterEntity  animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "animations/root_monster.animation.json");
    }

}