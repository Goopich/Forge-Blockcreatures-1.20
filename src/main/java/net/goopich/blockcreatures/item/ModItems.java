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
    public static final RegistryObject<Item> ROASTED_SUNFLOWER_SEEDS = ITEMS.register("roasted_sunflower_seeds",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().nutrition(4).saturationMod(4).alwaysEat().build()))
    );
    public static final RegistryObject<Item> ROASTED_PUMPKIN_SEEDS = ITEMS.register("roasted_pumpkin_seeds",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().nutrition(4).saturationMod(4).alwaysEat().build()))
    );

    public static final RegistryObject<Item> SAWDUST = ITEMS.register("sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_SAWDUST = ITEMS.register("dark_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TROPICAL_SAWDUST = ITEMS.register("tropical_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUNGAL_SAWDUST = ITEMS.register("fungal_sawdust",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

