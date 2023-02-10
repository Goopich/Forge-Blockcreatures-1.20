package net.goopich.blockcreatures.item;

import net.goopich.blockcreatures.BlockCreatures;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BlockCreatures.MOD_ID);
    public static final RegistryObject<Item> SEED_BALL = ITEMS.register("seed_ball",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().nutrition(4).saturationMod(4).alwaysEat().build()))
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

