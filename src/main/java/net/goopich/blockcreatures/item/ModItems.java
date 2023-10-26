package net.goopich.blockcreatures.item;

import net.goopich.blockcreatures.BlockCreatures;
import net.goopich.blockcreatures.entity.ModEntityTypes;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import software.bernie.example.registry.EntityRegistry;

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
    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder().nutrition(4).saturationMod(4.8f).alwaysEat().build()))
    );

    public static final RegistryObject<Item> SAWDUST = ITEMS.register("sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_SAWDUST = ITEMS.register("dark_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TROPICAL_SAWDUST = ITEMS.register("tropical_sawdust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STICKYSUBSTANCE = ITEMS.register("stickysubstance",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TANGLED_ROOT = ITEMS.register("tangled_root",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHELLITE = ITEMS.register("shellite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CETANITE = ITEMS.register("cetanite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAPRINITE = ITEMS.register("caprinite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<ForgeSpawnEggItem> STONE_BLOCK_SPAWN_EGG = ITEMS.register("stone_block_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.STONE_BLOCK, 0x686868, 0x8f8f8f,
                    new Item.Properties()));
    public static final RegistryObject<ForgeSpawnEggItem> GRASS_BLOCK_SPAWN_EGG = ITEMS.register("grass_block_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GRASS_BLOCK, 0x59412c, 0x487e3c,
                    new Item.Properties()));
    public static final RegistryObject<ForgeSpawnEggItem> ROOT_MONSTER_SPAWN_EGG = ITEMS.register("root_monster_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ROOT_MONSTER, 0x7d5347, 0x891d1d,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
