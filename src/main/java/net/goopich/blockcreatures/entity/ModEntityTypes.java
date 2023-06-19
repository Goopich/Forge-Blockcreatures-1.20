package net.goopich.blockcreatures.entity;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.entity.custom.GrassBlockEntity;
import net.goopich.blockcreatures.entity.custom.MudBlockEntity;
import net.goopich.blockcreatures.entity.custom.StoneBlockEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BlockCreatures.MOD_ID);

    public static final RegistryObject<EntityType<StoneBlockEntity>> STONE_BLOCK =
            ENTITY_TYPES.register("stone_block",
                    () -> EntityType.Builder.of(StoneBlockEntity::new, MobCategory.CREATURE)
                            .sized( 1.5f, 2.0f)
                            .build(String.valueOf(new ResourceLocation(BlockCreatures.MOD_ID, "stone_block"))));
    public static final RegistryObject<EntityType<GrassBlockEntity>> GRASS_BLOCK =
            ENTITY_TYPES.register("grass_block",
                    () -> EntityType.Builder.of(GrassBlockEntity::new, MobCategory.CREATURE)
                            .sized( 1.5f, 2.0f)
                            .build(String.valueOf(new ResourceLocation(BlockCreatures.MOD_ID, "grass_block"))));
    public static final RegistryObject<EntityType<MudBlockEntity>> MUD_BLOCK =
            ENTITY_TYPES.register("mud_block",
                    () -> EntityType.Builder.of(MudBlockEntity::new, MobCategory.WATER_CREATURE)
                            .sized( 1.0f, 0.6f)
                            .build(String.valueOf(new ResourceLocation(BlockCreatures.MOD_ID, "mud_block"))));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
