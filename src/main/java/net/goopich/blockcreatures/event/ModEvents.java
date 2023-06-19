package net.goopich.blockcreatures.event;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.entity.ModEntityTypes;
import net.goopich.blockcreatures.entity.custom.MudBlockEntity;
import net.goopich.blockcreatures.entity.custom.StoneBlockEntity;
import net.goopich.blockcreatures.entity.custom.GrassBlockEntity;
import net.goopich.blockcreatures.entity.custom.MudBlockEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = BlockCreatures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.STONE_BLOCK.get(), StoneBlockEntity.setAttributes());
            event.put(ModEntityTypes.GRASS_BLOCK.get(), GrassBlockEntity.setAttributes());
            event.put(ModEntityTypes.MUD_BLOCK.get(), MudBlockEntity.setAttributes());
        }
        @SubscribeEvent
        public static void entityAttributeEvent(SpawnPlacementRegisterEvent event) {
            event.register(ModEntityTypes.STONE_BLOCK.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Animal::checkAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        }
    }
}