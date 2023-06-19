package net.goopich.blockcreatures.entity.client;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.entity.custom.MudBlockEntity;
import net.goopich.blockcreatures.entity.custom.StoneBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class MudBlockModel extends DefaultedEntityGeoModel<MudBlockEntity> {
    public MudBlockModel(ResourceLocation assetSubpath) {
        super(assetSubpath, true);
    }
    @Override
    public ResourceLocation getModelResource(MudBlockEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "geo/mudblockmob.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MudBlockEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "textures/entity/mudblockcreature.png");
    }
    @Override
    public ResourceLocation getAnimationResource(MudBlockEntity animatable) {
        return new ResourceLocation(BlockCreatures.MOD_ID, "animations/mudblock.animation.json");
    }

}